package Laba17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Game extends JComponent {

    public static final int FIELD_EMPTY = 0;//пустое поле
    public static final int FIELD_X = 10;//поле с крестиками
    public static final int FIELD_O = 200;//поле с нулями
    int[][] field;//объявление массива
    boolean isXturn; //показывает чей ход

    public Game(){
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3];
        initGame();
    }

    public void initGame(){
        for(int i=0; i<3; ++i){
            for(int j=0; j<3; ++j){
                field[i][j] = FIELD_EMPTY;//очищаем массив и запоняем его нулями
            }
        }
        isXturn = true;
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);
        if(mouseEvent.getButton()==MouseEvent.BUTTON1){//проверяем, что нажата левая клавиша
            int x = mouseEvent.getX();//координата x клика
            int y = mouseEvent.getY();//координата y клика
            //переводим координаты в индексы ячейки в массиве field
            int i = (int)((float) x/getWidth()*3);
            int j = (int)((float) y/getHeight()*3);
            //проверяем, что выбранная ячейка пуста и туда можно сходить
            if (field[i][j] == FIELD_EMPTY){
                //проверяем чей ход, если X-ставим крестик, если 0- ставим нолик
                field[i][j] = isXturn?FIELD_X:FIELD_O;
                isXturn = !isXturn;//меняем флаг хода
                repaint();//перерисовка компонента, это вызовет метод painComponent()
                int res = checkState();
                if(res!=0){
                    if(res == FIELD_O*3){
                        //победил 0
                        JOptionPane.showMessageDialog(this,"Нолики выиграли!", "Победа", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(res == FIELD_X*3){
                        //победа x
                        JOptionPane.showMessageDialog(this,"Крестики выиграли!", "Победа", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(this,"Ничья!", "Ничья!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //перезапускаем игру
                    initGame();
                    //перерисовываем поле
                    repaint();
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        //очищеяем холст
        graphics.clearRect(0, 0, getWidth(), getHeight());
        //рисуем сетку из линий
        drawGrid(graphics);
        //рисуем текущие крестики и нолики
        drawXO(graphics);
    }

    void drawGrid(Graphics graphics){
        int w = getWidth();//ширина игрового поля
        int h = getHeight();//высота игрового поля
        int dw = w/3;//ширина одного поля
        int dh = h/3;//высота одного поля
        graphics.setColor(Color.BLUE);
        for(int i=1; i<3; i++){
            graphics.drawLine(0, dh*i, w, dh*i);//горизонтальная линия
            graphics.drawLine(dw*i, 0, dw*i, h);//вертикальная линия
        }
    }

    void drawX(int i, int j, Graphics graphics){
        graphics.setColor(Color.BLACK);
        int dw = getWidth()/3;
        int dh = getHeight()/3;
        int x = i*dw;
        int y = j*dh;
        graphics.drawLine(x, y, x+dw, y+dh);//линия от верхнего левого угла в нижний правый
        graphics.drawLine(x, y+dh, x+dw, y);//линия от нижнего левого угла в верхний правый
    }

    void drawO(int i, int j, Graphics graphics){
        graphics.setColor(Color.BLACK);
        int dw = getWidth()/3;
        int dh = getHeight()/3;
        int x = i*dw;
        int y = j*dh;
        graphics.drawOval(x+5*dw/100, y, dw*9/10, dh);

    }

    void drawXO(Graphics graphics){
        for(int i=0; i<3; ++i){
            for(int j=0; j<3; ++j){

                if(field[i][j] == FIELD_X){//если в ячейки крестик - рисуем его
                    drawX(i,j, graphics);
                }
                else if (field[i][j] == FIELD_O){//если в ячейки нолик - рисуем его
                    drawO(i, j, graphics);
                }
            }
        }
    }

    int checkState(){
        //проверяем диагонали
        int diag = 0;
        int diag2 = 0;
        for(int i=0; i<3; i++){
            diag += field[i][i];//сумма значений по диагонали от левого угла
            diag2 += field[i][2-i];//сумма значений по диагонали от правого угла
        }
        //если по диагонали стоят одни крестики или одни ноликивыходим из метода
        if(diag == FIELD_O*3 || diag == FIELD_X*3){
            return diag;
        }
        //то же для второй диагонали
        if(diag2 == FIELD_O*3 || diag2 == FIELD_X*3){
            return diag2;
        }
        int check_i, check_j;
        boolean hasEmpty = false;
        //бегае по рядам
        for(int i=0; i<3; i++){
            check_i = 0;
            check_j = 0;
            for(int j=0; j<3; j++){
                //суммируем знаки в текущем ряду
                if (field[i][j] == 0){
                    hasEmpty = true;
                }
                check_i += field[i][j];
                check_j += field[j][i];
            }
            //если победа крестика или нолика, то выводим
            if (check_i == FIELD_O * 3 || check_i == FIELD_X * 3) {
                return check_i;
            }
            if (check_j == FIELD_O * 3 || check_j == FIELD_X * 3) {
                return check_j;
            }
        }
        if (hasEmpty)
            return 0;
        else return -1;
    }
}
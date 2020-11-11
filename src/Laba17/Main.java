import java.awt.*;
import java.util.*;
import java.awt.event.*;

class Play extends Frame implements ActionListener
{
    static Play f;
    // таймер
    static Timer myTimer;
    // задача на выполнение
    static MyTimerTask myTask;
    // Кнопки с числами
    static Button buttons[][] = new Button[4][4];
    // Кнопка запуска игры
    static Button newGame;
    // текстовое поле
    static TextField time;
    // Список
    static java.awt.List nums;
    // Значение из текстового поля
    //сколько секунд будет длиться игра
    static int howmuch;
    static int mas[]=new int[16];
    private static Random rnd = new Random();
    //прошедшее время с начала игры
    static int passedTime=0;
    // показывает, запущена ли игра
    static boolean running = false;
    public Play()
    {
        this.setBounds (0, 0, 400, 400);
        addWindowListener(new MyWindowAdapter());
        int temp;
        //Создание кнопок
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                buttons[i][j] = new Button();
                buttons[i][j].setBounds((i+1)*50, (j+2)*50, 50, 50);
                add(buttons[i][j]);
                buttons[i][j].addActionListener(this);
            }
        }
        newGame=new Button("Новая игра");
        newGame.setBounds(50, 40, 80, 50);
        add(newGame);
        newGame.addActionListener(this);
        time = new TextField(3);
        time.setBounds(150, 65, 130, 20);
        add(time);
        Label one = new Label ("Введите время в секундах :" );
        one.setBounds(150, 40, 150, 20);
        add(one);
        nums = new java.awt.List(16);
        nums.setBounds(280, 100, 50, 200);
        this.setLayout(null);
        add(nums);
    }

    public static void main (String[] args)
    {
        f = new Play();
        f.setVisible(true);
        f.setTitle("Игра") ;
    }

    public void actionPerformed(ActionEvent ae) //выставление чисел в кнопки
    {
        if(running==true)
        {
            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    if(ae.getSource() == buttons[i][j])
                    {
                        String dd = buttons[i][j].getLabel();
                        if(mas[nums.getItemCount()]!=Integer.parseInt(dd))
                        {
                            return;
                        }
                        if(nums.getItemCount()==0)
                        {
                            nums.add(dd);
                            break;
                        }
                        else if(nums.getItem(nums.getItemCount()-1)!=null &&
                                Integer.parseInt(nums.getItem(nums.getItemCount()-1)) <= Integer.parseInt(dd))
                        {
                            nums.add(dd);
                            break;
                        }
                    }
                }
            }
        }
        // если нажата кнопка запуска игры
        if(ae.getSource() == newGame)
        {
            try
            {
                // получаем время игры
                howmuch=Integer.parseInt(time.getText());
                running=true;
                //запускаем таймер
                myTask = new MyTimerTask();
                myTask.app = f;
                myTimer = new Timer();
                myTimer.schedule(myTask, howmuch, 1000);
                newGame.setEnabled(false);
                nums.removeAll();
                int t=0;
                for(int i=0; i<4;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        int temp = rnd.nextInt(100);
                        // Если такое значение уже есть в  массиве - вычисляем следующее
                        if(t>0)
                        {
                            if(mas[t-1]==temp)
                            {
                                j--;
                                continue;
                            }
                        }
                        buttons[i][j].setLabel(String.valueOf(temp));
                        mas[t]=temp;
                        t++;
                    }
                }
                Arrays.sort(mas);
            }
            catch(NumberFormatException ex)
            {
                f.setTitle("ВВЕДИТЕ ПРАВИЛЬНОЕ ЧИСЛО!");
            }
        }
        repaint();
    }
}

class MyTimerTask extends TimerTask
{
    Play app = null;

    public void run()
    {
        //прибавляем по секунде
        app.passedTime++;
        app.setTitle("Прошло " + app.passedTime + " секунд");
        //если все время прошло, смотрим выиграли ли игрок
        if(app.passedTime==app.howmuch)
        {
            app.running=false;
            app.myTimer.cancel();
            if(app.nums.getItemCount()==16)
            {
                app.setTitle("ВЫ ВЫИГРАЛИ!");
            }
            else
            {
                app.setTitle("ВЫ ПРОИГРАЛИ!");
            }
        }
        // если игрок успел до завершения времени, также смотрим, выиграл ли
        if(app.nums.getItemCount()==16)
        {
            app.running=false;
            app.myTimer.cancel();
            app.setTitle("ВЫ ВЫИГРАЛИ!");
        }
        app.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
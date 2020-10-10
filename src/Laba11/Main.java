package Laba11;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    private void showSuccessAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Результат");
        alert.setHeaderText("Поздравляем");
        alert.setContentText("Вы успешно угадали число!");
        alert.showAndWait();
    }

    private void showNotificationAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка");
        alert.setHeaderText("Некорректный ввод");
        alert.setContentText("Введите число от 0 до 20");
        alert.showAndWait();
    }

    private void showFailAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Результат");
        alert.setHeaderText("Неудача");
        alert.setContentText("Вы не смогли угадать загаданное число. Попробуйте снова!");
        alert.showAndWait();
    }

    @Override
    public void start(Stage primaryStage) {

        AtomicInteger count = new AtomicInteger(3);
        String rand = new AtomicInteger(new Random().nextInt(20)).toString();
        System.out.println("Рандомное число: " + rand);

        TextField textField = new TextField();

        Button btn = new Button("Угадать число");
        btn.setMinWidth(200);

        Label lbl = new Label("У вас осталось " + count + " попытки.");
        Label ins = new Label("Введите случайное число от 0 до 20");
        Label adv = new Label();

        btn.setOnAction(event -> {

            try {
                if (Integer.parseInt(textField.getText()) <= 20 && Integer.parseInt(textField.getText()) >= 0) {

                    if (textField.getText().equals(rand)) {
                        showSuccessAlert();
                        System.exit(1);
                    }

                    count.getAndDecrement();

                    if (count.get() == 0) {
                        showFailAlert();
                        System.exit(1);
                    }

                    lbl.setText("У вас осталось " + count + " попытки.");

                    if (Integer.parseInt(rand) > Integer.parseInt(textField.getText()))
                        adv.setText("Загаданное число больше, чем " + textField.getText());
                    if (Integer.parseInt(rand) < Integer.parseInt(textField.getText()))
                        adv.setText("Загаданное число меньше, чем " + textField.getText());
                } else showNotificationAlert();
            }
            catch (NumberFormatException nfe) { showNotificationAlert(); }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 20, 20, ins, textField, btn, lbl, adv);
        root.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Guess Random Number");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
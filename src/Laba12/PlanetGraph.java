package Laba12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.text.*;

public class PlanetGraph extends JFrame {

    private static final double gravConst = 6.67 * Math.pow(10, -11);
    private NumberFormat formatter = new DecimalFormat("#0.00000");

    public PlanetGraph() {
        super("Solar System Planets");
        this.setBounds(400, 200, 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.setBackground(new Color(57, 39, 80));

        Planet[] planets = Planet.values();
        for (Planet p : planets) {
            JButton button = new JButton(String.valueOf(p));
            button.addActionListener(e -> {
                String message = "";
                double grav = gravConst * p.getMass() / (p.getRadius() * p.getRadius() * Math.pow(10, 6));
                message += "Gravitation on " + p + " is " + grav;
                JOptionPane.showMessageDialog(null,
                        message,
                        "Exit",
                        JOptionPane.PLAIN_MESSAGE);
            });
            button.setForeground(new Color(126, 86, 172));
            container.add(button);
        }
    }
}
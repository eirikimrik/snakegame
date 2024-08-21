package org.eirikimrik;

import javax.swing.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My first frame");
        //JLabel label = new JLabel("Hello world");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);


        //label.setHorizontalAlignment(0);

        frame.setSize(300,300);
        frame.add(panel);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
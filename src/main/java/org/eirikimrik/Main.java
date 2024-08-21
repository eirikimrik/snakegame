package org.eirikimrik;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My first frame");
        GamePanel panel = new GamePanel();

        frame.setSize(500,500);
        frame.setResizable(false);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
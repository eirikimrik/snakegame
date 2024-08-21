package org.eirikimrik;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");
        GamePanel gamePanel = new GamePanel();


        frame.setResizable(false);
        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        gamePanel.startGameThread();


    }
}
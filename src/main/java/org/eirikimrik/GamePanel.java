package org.eirikimrik;

import javax.swing.*;
import java.awt.*;

/**
 * The class for managing the screen. Extends JPanel and implements Runnable to be able to
 * use the Thread.
 */
public class GamePanel extends JPanel implements Runnable{


    //using Thread to be able to have the snake to be appearing to move.
    Thread gameThread;
    KeyInputHandler keyInputHandler = new KeyInputHandler();

    int coordinateX = (int) (Math.random() * 450);
    int coordinateY = (int) (Math.random() * 450);

    int movement = 1;

    public GamePanel(){
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(1000,1000));
        this.addKeyListener(keyInputHandler);
        this.setFocusable(true);
    }

    /**
     * Initializes the thread.
     */
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        //creating game loop

        while (gameThread != null) {
            update();

            repaint();
            System.out.println("Thread is running");
        }
        System.out.println("Thread NOT running");

    }

    public void update(){

    }

    /**
     * Method for drawing components. Using Graphics, which is a class containing functions to draw
     * objects on the screen.
     * @param g the <code>Graphics</code> object to protect
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillRect(coordinateX,coordinateY,10,10);
        g.dispose();
        moveRect();



    }

    private void moveRect() {

        if(keyInputHandler.upPressed){
            this.coordinateY = coordinateY - movement;
        }
        if(keyInputHandler.downPressed){
            this.coordinateY = coordinateY + movement;
        }

        if(keyInputHandler.rightPressed){
            this.coordinateX = coordinateX + movement;
        }

        if(keyInputHandler.leftPressed){
            this.coordinateX = coordinateX - movement;
        }

    }


}

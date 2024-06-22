/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalan;

import contoh.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author UX430UN
 */
public class Sushi extends JLabel implements Runnable {

    boolean status;

    public Sushi(boolean status) {
        this.status = status;
    }

    @Override
    public void run() {
        int x = this.getX();
        int y = this.getY();
        this.setVisible(true);

        for (int i = 0;; i++) {
            if (status) {
                x += 10;
            } else {
                y += 10;
            }
            this.setLocation(x, y);

            repaint();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(System.err);
            }
        }
    }

}

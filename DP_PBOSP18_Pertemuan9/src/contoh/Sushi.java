/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author UX430UN
 */
public class Sushi extends JLabel implements Runnable {

    @Override
    public void run() {
        while (true) {
            this.setVisible(true);
            Random rn = new Random();
            int x = rn.nextInt(450 - 0 + 1) + 0;
            int y = rn.nextInt(450 - 0 + 1) + 0;

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

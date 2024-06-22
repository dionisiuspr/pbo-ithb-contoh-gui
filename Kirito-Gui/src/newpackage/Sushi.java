package newpackage;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Ria Chan
 */
public class Sushi extends JLabel implements Runnable {

    private boolean reset = false;

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    @Override
    public void run() {
        while (true) {
            reset = true;
            this.setVisible(true);
            Random rn = new Random();
            int x = rn.nextInt(450 - 0 + 1) + 0;
            int y = rn.nextInt(450 - 0 + 1) + 0;

            this.setLocation(x, y);

            repaint();

            try {
                Thread.sleep(3000);
                reset = false;
            } catch (InterruptedException ex) {
                System.out.println(System.err);
            }
        }
    }

}

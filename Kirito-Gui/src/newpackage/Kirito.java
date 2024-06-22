package newpackage;

import java.awt.geom.Area;
import javax.swing.JLabel;

/**
 *
 * @author Ria Chan
 */
public class Kirito extends JLabel{

    public boolean intersects(JLabel lblB) {
        Area areaA = new Area(this.getBounds());
        Area areaB = new Area(lblB.getBounds());

        return areaA.intersects(areaB.getBounds2D());
    }
    
    public static void main(String[] args) {
        
    }
    
}

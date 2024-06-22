/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.awt.geom.Area;
import javax.swing.JLabel;

/**
 *
 * @author UX430UN
 */
public class Kirito extends JLabel {

    public boolean intersects(JLabel lblB) {
        Area areaA = new Area(this.getBounds());
        Area areaB = new Area(lblB.getBounds());

        return areaA.intersects(areaB.getBounds2D());
    }

}

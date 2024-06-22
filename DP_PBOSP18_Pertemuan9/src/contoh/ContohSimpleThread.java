/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UX430UN
 */
public class ContohSimpleThread implements Runnable {

    private String nama;

    public ContohSimpleThread(String nama) {
        this.nama = nama;
    }

    @Override
    public void run() {
        if (nama.equals("Bokir")) {
            actionBokir();
        } else {
            System.out.println("bukan bokir!!");
        }

    }

    private void actionBokir() {
        for (int i = 0;; i++) {
            System.out.println("Ini punya " + nama);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ContohSimpleThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

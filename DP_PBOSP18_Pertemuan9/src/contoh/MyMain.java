/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author UX430UN
 */
public class MyMain {

    public static void main(String[] args) {
        ContohSimpleThread contohSimpleThread = new ContohSimpleThread("Bokir");
        ContohSimpleThread contohSimpleThread2 = new ContohSimpleThread("Kincup");
        
        Thread t1 = new Thread(contohSimpleThread);
        t1.start();
        
        Thread t2 = new Thread(contohSimpleThread2);
        t2.start();
    }
}

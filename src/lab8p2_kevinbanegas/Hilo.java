/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_kevinbanegas;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    private JProgressBar bar;
    private boolean work;
    private ArrayList<Ser> s = new ArrayList();
    private JDialog d;

    public Hilo(JProgressBar bar, ArrayList<Ser> s, JDialog d) {
        this.bar = bar;
        this.s = s;
        bar.setMaximum(s.size());
        this.work = true;
        this.d = d;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        for (Ser ser : s) {
            try{
            bar.setValue(bar.getValue() + 1);
            
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
        d.setVisible(false);
    }
}

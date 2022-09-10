/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_kevinbanegas;

import java.util.ArrayList;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    private JProgressBar bar;
    private boolean work;
    private ArrayList<Ser> s = new ArrayList();

    public Hilo(JProgressBar bar, ArrayList<Ser> s) {
        this.bar = bar;
        this.s = s;
        bar.setMaximum(s.size());
        this.work = true;
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
        int d = 0;
        while (work) {
            if (bar.getValue() > 0) {
                d = bar.getValue();
            }
            bar.setValue(bar.getMaximum() - d);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            if (bar.getValue() == bar.getMaximum()) {
                work = false;
            }
        }
    }
}

package Apprenant;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class AnimationBar{

    private JProgressBar jProgressBar1;
    private Timer timer;

    public AnimationBar(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
        jProgressBar1.setMaximum(100);
        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);

        timer = new Timer(1000, new ActionListener() {
            int counter = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter < 47) {
                    counter++;
                    jProgressBar1.setValue(counter);
                } else {
                    timer.stop();
                }
                if (counter < 25) {
                    jProgressBar1.setForeground(Color.RED);
                } else if (counter < 50) {
                    jProgressBar1.setForeground(Color.YELLOW);
                } else if (counter < 75) {
                    jProgressBar1.setForeground(Color.GREEN);
                } else {
                    jProgressBar1.setForeground(Color.BLUE);
                }
            }
        });
        timer.start();
    }
}

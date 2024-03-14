package swing;

import javax.swing.JProgressBar;

public class CircleProgressBar extends JProgressBar {

    private final ProgressCircleUI ui;

    public CircleProgressBar() {
        setOpaque(false);
        setStringPainted(true);
        ui = new ProgressCircleUI();
        setUI(ui);
    }

    @Override
    public String getString() {
        return ((int) (getValue() * ui.getAnimate())) + "%";
    }

    public void start() {
        ui.start();
    }
}
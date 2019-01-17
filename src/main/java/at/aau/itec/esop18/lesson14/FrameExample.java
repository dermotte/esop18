package at.aau.itec.esop18.lesson14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrameExample extends JFrame {
    JLabel label = new JLabel();
    String labelText = "";

    public FrameExample() throws HeadlessException {
        super("My Frame Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        label.setFont(label.getFont().deriveFont(128f));
        add(label, BorderLayout.CENTER);

        addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent keyEvent) {
                if (!keyEvent.isActionKey())
                    labelText += Character.toString(keyEvent.getKeyChar());
                    label.setText(labelText);
            }
        });
    }

    public static void main(String[] args) {
        FrameExample kf = new FrameExample();
        kf.setVisible(true);
    }
}

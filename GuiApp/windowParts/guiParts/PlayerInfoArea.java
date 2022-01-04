package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private JLabel infoArea;
    private JLabel hp;
    private JLabel str;
    private JLabel position;

    public PlayerInfoArea() {
        prepareInfoArea();

    }

    public void prepareInfoArea() {
        setLayout(new GridLayout(4, 1));
        infoArea = new JLabel(" =HERO INFO= ", SwingConstants.CENTER);
        hp = new JLabel(" Health: ");
        str = new JLabel(" Strength: ");
        position = new JLabel(" Position: ");

        add (infoArea);
        add (hp);
        add (str);
        add (position);
    }
}

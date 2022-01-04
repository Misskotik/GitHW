package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {

    private JButton up ;
    private JButton left;
    private JButton right;
    private JButton down;
    private JButton empty;
    private JPanel container;


    public PlayerControlArea() {

        prepareInfoArea();

    }

    public void prepareInfoArea() {
        setLayout(new GridLayout(2, 3));
        up = new JButton( "^");
        left = new JButton(" < ");
        down = new JButton(" v ");
        right = new JButton(" > ");
        empty = new JButton (" ");
        container = new JPanel();


        add (new JPanel ());
        add (up);
        add (new JPanel ());
        add (left);
        add (down);
        add (right);



    }
}

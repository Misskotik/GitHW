package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {

    private JLabel areaName;
    private JButton btnStartGame;
    private JButton btnEndGame;



    public GameControlArea () {
        setLayout(new GridLayout(3,1));
        areaName = new JLabel(" = Game Control = ");
        btnStartGame = new JButton("Launcher Game");
        btnEndGame = new JButton("End Game");

        add (areaName);
        add (btnStartGame);
        add (btnEndGame);

    }
}

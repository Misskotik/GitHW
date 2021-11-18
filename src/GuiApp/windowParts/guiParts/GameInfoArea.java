package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

    private JLabel infoGame;
    private JLabel enemyCount;
    private JLabel level;
    private JLabel sizeMap;


    public GameInfoArea() {

    prepareInfoArea();

    }

    public void prepareInfoArea() {
        setLayout(new GridLayout(4, 1));
        infoGame = new JLabel(" =GAME INFO= ", SwingConstants.CENTER);
        enemyCount = new JLabel(" Enemies Count: ");
        level = new JLabel(" Level: ");
        sizeMap = new JLabel(" Map Size: ");

add (infoGame);
add (enemyCount);
add (level);
add (sizeMap);
    }

}



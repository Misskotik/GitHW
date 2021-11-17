package GuiApp;

import GuiApp.windowParts.GameMap;
import GuiApp.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private int windowWidth = 1024;
    private int windowHeight = 768;
    private int windowPosX = 300;
    private int windowPosY = 100;
    private String windowTitle = "Title";

    private GuiPanel guiPanel;
    private GameMap gameMap;


    MainWindow () {
        setupWindow();

        guiPanel = new GuiPanel ();
        gameMap = new GameMap ();

        add (gameMap);
        add (guiPanel, BorderLayout.EAST);


        setVisible (true);

    }
    private void setupWindow () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setLocation (windowPosX, windowPosY);
        setTitle (windowTitle);
        setResizable(true);

    }
}

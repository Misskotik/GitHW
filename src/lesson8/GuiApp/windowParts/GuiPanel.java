package GuiApp.windowParts;

import GuiApp.MainWindow;
import GuiApp.models.Player;
import GuiApp.windowParts.guiParts.GameControlArea;
import GuiApp.windowParts.guiParts.GameInfoArea;
import GuiApp.windowParts.guiParts.PlayerControlArea;
import GuiApp.windowParts.guiParts.PlayerInfoArea;
import sun.applet.Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class GuiPanel extends JPanel {
    private MainWindow mainWindow;

    private GameControlArea gameControlArea;
    private PlayerInfoArea playerInfoArea;
    private GameInfoArea gameInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea gameLog;
    private JScrollPane scrollLog;

    public GuiPanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        prepare();
        createParts();
        prepareLogArea();

        add(gameControlArea);
        add(playerInfoArea);
        add(gameInfoArea);
        add(playerControlArea);
        add(scrollLog);
    }

    private void prepare() {
        setBackground(Color.RED);
        setLayout(new GridLayout(5, 1));
    }

    private void prepareLogArea() {
        gameLog = new JTextArea();
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
        scrollLog = new JScrollPane(gameLog);
    }

    private void createParts() {
        gameControlArea = new GameControlArea(this);
        playerInfoArea = new PlayerInfoArea();
        gameInfoArea = new GameInfoArea();
        playerControlArea = new PlayerControlArea(this);
    }

    public void recordLog(String msg) {
        gameLog.append(msg + "\n");
    }

    public void launchNewGame() {
        mainWindow.startNewGame();
    }

    public void refreshGuiInfo(GameMap map) {
        playerInfoArea.refreshPlayerInfo(map.getPlayer());
        gameInfoArea.refreshGameInfo(map.getCountEnemies(), map.getLevelCount(), map.getMapSize());
    }

    public void changePositionPlayer(int key) {
        mainWindow.changePositionPlayer(key);
    }
}

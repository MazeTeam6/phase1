import javax.swing.*;
import javax.swing.JFrame;

public class GameMenu extends Mode{
    private JButton instructions, easyMode, mediumMode, hardMode, exitGame;
    private JPanel gameMenuPanel;


    public GameMenu(){
        instructions.addActionListener(e -> new Mode("INSTRUCTIONS") );
        easyMode.addActionListener(e -> new Mode("EASY"));
        mediumMode.addActionListener(e -> new Mode("MEDIUM"));
        hardMode.addActionListener(e -> new Mode("HARD"));
        exitGame.addActionListener(e -> new Mode("EXIT"));
    }

    public void displayGameMenu() {
        JFrame frame = new JFrame("Game Menu");
        frame.setResizable(false);
        frame.setContentPane(new GameMenu().gameMenuPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); //PLACES FRAME IN THE CENTER OF THE SCREEN
        frame.setVisible(true);
        frame.setSize(200, 192);
    }}

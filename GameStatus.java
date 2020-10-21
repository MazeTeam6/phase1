import javax.swing.*;

public class GameStatus extends JPanel{
    private JPanel gameWinStatusPanel;

    //IMPLEMENT A JBUTTON "ASKING PLAYER TO PLAY AGAIN"

    public GameStatus(){}
    public void displayWinStatus(){}
    public static void displayGameWinStatusPanel(){
        JFrame frame = new JFrame("Game Status");
        frame.setResizable(false);
        frame.setContentPane(new GameStatus().gameWinStatusPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); //PLACES FRAME IN THE CENTER OF THE SCREEN
        frame.setVisible(true);
        frame.setSize(400, 400);
    }

    public static void main(String[] args){
        displayGameWinStatusPanel();
    }
}

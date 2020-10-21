import javax.swing.*;
import java.awt.*;

public class MazeDisplay extends KeyBoard{

    public MazeDisplay(){}
    public void instructionAction(){
        new DisplayInstructionFile();
    }
    public void easyModeAction(){
        //DISPLAY EASY MAP
    }
    public void mediumModeAction(){
        //DISPLAY MEDIUM MAP
    }
    public void hardModeAction(){
        //DISPLAY HARD MAP
    }
    public void exitGameAction(){
            System.out.println("EXITING GAME...\nGOODBYE!");
            System.exit(0);
    }
}

class DisplayInstructionFile extends JPanel {

    public DisplayInstructionFile(){
        //System.out.println("DisplayInstructionFile: DisplayInstructionFile(); ");
        String file = "C:/Users/IT/IdeaProjects/TheMazeGameDraft//src//INSTRUCTIONS.txt";
        ImageIcon obj = new ImageIcon(file);
        add(new JLabel(obj));
    }
  
}

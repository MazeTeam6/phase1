public class Mode extends MazeDisplay{
    private String gameMode = "";
    MazeDisplay obj = new MazeDisplay();

    public Mode(){}

    public Mode(String gameMode){
        this.gameMode = gameMode;
        setMode();
    }
    public void setMode(){
        if(gameMode == "INSTRUCTIONS") {
            obj.instructionAction();
        } else if(gameMode == "EASY"){
            obj.easyModeAction();
        } else if(gameMode == "MEDIUM"){
            obj.mediumModeAction();
        } else if(gameMode == "HARD"){
            obj.hardModeAction();
        } else if(gameMode == "EXIT"){
            obj.exitGameAction();       }}}

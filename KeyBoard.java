public class KeyBoard implements PlayerControl {

    private boolean grantAccess = false;
    private String gameMode = "";
    public String stringHolder = "You found me!";

    public KeyBoard(){}
    public void GrantKeyBoardControls(boolean grantAccess){
        System.out.println("Granted KeyBoard Controls");
    }

    public void moveUp() {
        //W AND UP ARROW
    }
    public void moveDown() {
        //S and DOWN ARROW
    }
    public void moveRight() {
        //D and RIGHT ARROW
    }
    public void moveLeft() {
        //A and LEFT ARROW
    }
}


class LaunchKeyboard extends KeyBoard{
    public String stringHolder = "You found me?";
   /* public void holdString(String stringHolder){
        this.stringHolder = stringHolder;
    }
    public void getStringHolder(){
        System.out.println(stringHolder);
    }*/
    public LaunchKeyboard(){}
    public void enableKeyboard(){
       KeyBoard obj = new KeyBoard();
       obj.GrantKeyBoardControls(true);
    }
}

/*class Main{
    public static void main(String[] args) {
        LaunchKeyboard obj = new LaunchKeyboard();
        obj.enableKeyboard();
    }

}/*
@Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
    }

    public static void main(String[] args) {
        new KeyListenerTester("Key Listener Tester");
    }
    frame.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                AWTKeyStroke ak = AWTKeyStroke.getAWTKeyStrokeForEvent(e);
                if(ak.equals(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_M))) {
                    System.exit(0);
                }
            }
        });


 */
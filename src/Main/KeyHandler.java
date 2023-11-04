package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    GamePanel gp;
    public boolean upPressed, downPressed, leftPressed, rightPressed, uprightPressed,upleftPressed, downrightPressed,downleftPressed;

    boolean checkDrawTime = false;

    public KeyHandler(GamePanel gp){
        this.gp = gp;
    }
    boolean Akey = false;
    boolean Skey = false;
    boolean Dkey = false;
    boolean Wkey = false;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {
            upPressed = true;

        }
        if(code == KeyEvent.VK_S) {
            downPressed = true;

        }
        if(code == KeyEvent.VK_A) {
            leftPressed = true;

        }
        if(code == KeyEvent.VK_D) {
            rightPressed = true;

        }
        if(code == KeyEvent.VK_W){
            Wkey = true;
        }
        if(code == KeyEvent.VK_D){
            Dkey = true;
        }
        if(Wkey == true && Dkey == true){
            uprightPressed = true;
        }
        if(code == KeyEvent.VK_W){
            Wkey = true;
        }
        if(code == KeyEvent.VK_A){
            Akey = true;
        }
        if(Wkey == true && Akey == true){
            upleftPressed = true;
        }
        if(code == KeyEvent.VK_S){
            Skey = true;
        }
        if(code == KeyEvent.VK_D){
            Dkey = true;
        }
        if(Skey == true && Dkey == true){
            downrightPressed = true;
        }
        if(code == KeyEvent.VK_S){
            Skey = true;
        }
        if(code == KeyEvent.VK_A){
            Akey = true;
        }
        if(Skey == true && Akey == true){
            downleftPressed = true;
        }

        if (code == KeyEvent.VK_T){
            if(checkDrawTime == false) {
                checkDrawTime = true;
            } else if (checkDrawTime == true) {
                checkDrawTime = false;

            }
        }

        if(code == KeyEvent.VK_P){
            if(gp.gameState == gp.playState) {
                gp.gameState = gp.pauseState;
            }
            else if (gp.gameState == gp.pauseState) {
                gp.gameState = gp.playState;
                
            }
        }



    }


    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;

        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;

        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;

        }
        if (code == KeyEvent.VK_D) {
            rightPressed = false;

        }
        if(code == KeyEvent.VK_W){
            Wkey = false;
        }
        if(code == KeyEvent.VK_D){
            Dkey = false;
        }
        if(Wkey == false || Dkey == false){
            uprightPressed = false;

        }
        if(code == KeyEvent.VK_W){
            Wkey = false;
        }
        if(code == KeyEvent.VK_A){
            Akey = false;
        }
        if(Wkey == false || Akey == false){
            upleftPressed = false;

        }
        if(code == KeyEvent.VK_S){
            Skey = false;
        }
        if(code == KeyEvent.VK_D){
            Dkey = false;
        }
        if(Skey == false || Dkey == false){
            downrightPressed = false;

        }
        if(code == KeyEvent.VK_S){
            Skey = false;
        }
        if(code == KeyEvent.VK_A){
            Akey = false;
        }
        if(Skey == false || Akey == false){
            downleftPressed = false;

        }
    }
}

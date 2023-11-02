package Main;

import object.OBJ_Key;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

public class UI {

    GamePanel gp;
    Font arial_40 = new Font("Arial", Font.PLAIN, 40 );
    Font arial_60B = new Font("Arial", Font.BOLD, 60 );
    Font consolas_40I = new Font("Consolas", Font.ITALIC, 40);
    BufferedImage keyImage;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;

    double playTime;
    DecimalFormat dFormat = new DecimalFormat("#0.00");


    public UI(GamePanel gp) {
        this.gp = gp;

        OBJ_Key key = new OBJ_Key();
        keyImage = key.image;
    }
    public void showMessage(String text) {
        message = text;
        messageOn = true;
    }
    public void draw (Graphics2D g2) {
        if(gameFinished == true){
            g2.setFont( arial_40);
            g2.setColor(Color.WHITE);

            String text;
            int textLength;
            int x;
            int y;

            text = "You fount the treasure!";
            textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();

            x = gp.screenWidth/2 - textLength/2;
            y = gp.screenHeight/2 - (gp.tileSize);
            g2.drawString(text, x, y);

            text = "Your time: "+ dFormat.format(playTime) + "!";
            textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();

            x = gp.screenWidth/2 - textLength/2;
            y = gp.screenHeight/2 + (gp.tileSize* 3);
            g2.drawString(text, x, y);


            g2.setFont( arial_60B);
            g2.setColor(Color.YELLOW);
            text = "CONGRATULATIONS!";
            textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();

            x = gp.screenWidth/2 - textLength/2;
            y = gp.screenHeight/2 + (gp.tileSize);
            g2.drawString(text, x, y);

            gp.gameThread = null;


        }
        else {
            g2.setFont( arial_40);
            g2.setColor(Color.WHITE);
            g2.drawImage(keyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            g2.drawString("x "+ gp.player.hasKey, 74,65);

            playTime +=(double) 1/60;
            g2.drawString("Time: "+dFormat.format(playTime), gp.tileSize*11, 65 );


            if(messageOn == true){
                g2.setFont(consolas_40I.deriveFont(20F));
                g2.drawString(message, gp.tileSize*12 , gp.tileSize*11 );

                messageCounter ++;

                if(messageCounter > 45) {
                    messageCounter = 0;
                    messageOn = false;

                }
            }

        }

    }
}

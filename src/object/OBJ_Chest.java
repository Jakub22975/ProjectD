package object;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Chest extends SuperObject{

    GamePanel gp;
    public OBJ_Chest(GamePanel gp) {
        name = "Chest";
        try{
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/chest.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

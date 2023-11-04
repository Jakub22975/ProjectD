package object;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Boots extends SuperObject{

    GamePanel gp;
    public OBJ_Boots(GamePanel gp) {
        name = "Boots";
        try{
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/boots.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

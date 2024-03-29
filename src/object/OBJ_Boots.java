package object;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Boots extends SuperObject {
    public OBJ_Boots(int x, int y) {
        name = "Boots";
        try {
            image = ImageIO.read(new File("res/objects/boots.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        worldX = x;
        worldY = y;
    }
}

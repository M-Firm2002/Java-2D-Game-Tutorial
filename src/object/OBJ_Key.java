package object;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Key extends SuperObject {
    public OBJ_Key(int x, int y) {
        name = "Key";
        try {
            image = ImageIO.read(new File("res/objects/key.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        worldX = x;
        worldY = y;
    }

}

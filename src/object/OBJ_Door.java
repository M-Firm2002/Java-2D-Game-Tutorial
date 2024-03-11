package object;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Door extends SuperObject {
        public OBJ_Door(int x, int y) {
        name = "Door";
        try {
            image = ImageIO.read(new File("res/objects/door.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        worldX = x;
        worldY = y;

        collision = true;
    }

}

package Game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector;

/**
 * Created by David on 20/10/2016.
 */
public class Actor {

    Texture sprite;
    int sizeH, sizeW;

    Data.ActorClass actorClass;
    Data.ActorTeam actorTeam;


    public Actor(String fileName, int width, int height) {
        sprite = new Texture(fileName);
    }

    // GAME METHODS

    public boolean moveTo(int col, int row) {
        return false;
    }


}



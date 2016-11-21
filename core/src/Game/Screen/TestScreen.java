package Game.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import fr.pixdad.games.TBSGame;
import fr.pixdad.games.TiledScreen;


/**
 * Created by David on 16/10/2016.
 */
public class TestScreen extends TiledScreen {

    public Texture img;
    int pos_col = 0;
    int pos_row = 0;

    public TestScreen(TBSGame game) {
        super(game, "carte-tuto.tmx");
        img = new Texture("pika.png");
    }

    @Override
    public void renderScreen(float delta, SpriteBatch batch) {

        Vector3 screenpos = camera.project(new Vector3(0,0,0));
        batch.begin();
        batch.draw(img, screenpos.x, screenpos.y);
        batch.end();
        //this.camera.position.x = pos_row;
        //this.camera.position.y = pos_col;
    }

    @Override
    public void updateScreen(float delta) {
        moveCameraToLeft = (Gdx.input.isKeyPressed(Input.Keys.LEFT));
        moveCameraToRight = (Gdx.input.isKeyPressed(Input.Keys.RIGHT));
        moveCameraToBottom = (Gdx.input.isKeyPressed(Input.Keys.DOWN));
        moveCameraToTop = (Gdx.input.isKeyPressed(Input.Keys.UP));
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return super.touchDown(screenX, screenY, pointer, button);
    }
}


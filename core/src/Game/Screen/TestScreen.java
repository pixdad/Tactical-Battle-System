package Game.Screen;

import fr.pixdad.games.Level;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import fr.pixdad.games.TBSGame;


/**
 * Created by David on 16/10/2016.
 */
public class TestScreen implements Screen, InputProcessor {

    public TBSGame game;

    public Texture img;
    int pos_col = 0;
    int pos_row = 0;

    TiledMap map;
    OrthogonalTiledMapRenderer renderer;
    OrthographicCamera camera;

    Level level;


    public TestScreen(TBSGame game) {
        this.game = game;

        level = new Level(game, "carte-tuto.tmx");
        img = new Texture("pika.png");

        renderer = new OrthogonalTiledMapRenderer(level.getMap(), 1);
        camera=new OrthographicCamera(1080,720);
        camera.setToOrtho(false);

    }


    /* OVERRIDE METHODS */

    @Override
    public void render(float delta) {

        renderer.setView(camera);

        int[] backgroundLayers = { 0 };
        int[] foregroundLayers = { 1 };


        if(Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) pos_col -= 32;//200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) pos_col += 32;//200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) pos_row -= 32;//200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyJustPressed(Input.Keys.UP)) pos_row += 32;    //200 * Gdx.graphics.getDeltaTime();

        renderer.render(backgroundLayers);

        game.batch.begin();
        game.batch.draw(img, pos_col, pos_row);
        game.batch.end();

        renderer.render(foregroundLayers);
    }


    @Override
    public void show() {}
    @Override
    public void resize(int width, int height) {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}
    @Override
    public void dispose() {}

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}

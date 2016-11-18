package fr.pixdad.games;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

import java.util.ArrayList;

/**
 * Created by David on 17/11/2016.
 * Abscract Screen class for tiled screens. Render entities between layers
 */
public abstract class TiledScreen implements Screen {

    TBSGame game;
    TiledMap map;
    OrthogonalTiledMapRenderer renderer;
    OrthographicCamera camera;

    ArrayList<TiledMapTileLayer> layers = new ArrayList<TiledMapTileLayer>();

    /* Methods */

    public TiledScreen(TBSGame game, String levelTmxFilename) {
        this.game = game;
        map = new TmxMapLoader().load(levelTmxFilename);

        /* Layers from the map : 0 - under entities / 1+ - above entities */
        for (int i=0;i<map.getLayers().getCount();i++) {
            layers.add( (TiledMapTileLayer) map.getLayers().get(i) );
        }

        renderer = new OrthogonalTiledMapRenderer(map, 1);
        camera=new OrthographicCamera(1080,720);
        camera.setToOrtho(false);
    }

    /* To-Override Methods */

    /** Meant to be overrided : render & update entities between layers */
    public abstract void renderScreen(float delta, SpriteBatch batch);
    public abstract void updateScreen(float delta);


    /* Getters & Setters */

    public TiledMap getMap() {
        return map;
    }

    /* Implemented Screen Methods */

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        renderer.setView(camera);

        int[] backgroundLayers = { 0 };
        int[] foregroundLayers = new int[layers.size()-1];
        for (int i=1; i<layers.size();i++) { foregroundLayers[i-1] = i; }

        /* Update & Render entities between layers */
        renderer.render(backgroundLayers);
        updateScreen(delta);
        renderScreen(delta, game.batch);
        renderer.render(foregroundLayers);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

package Game.Level;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.Array;
import fr.pixdad.games.TBSGame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by David on 20/10/2016.
 */
public class Level {

    public TBSGame game;
    //public Texture img;
    TiledMap map;
    OrthogonalTiledMapRenderer renderer;
    OrthographicCamera camera;

    ArrayList<TiledMapTileLayer> layers = new ArrayList<TiledMapTileLayer>();

    int[][] board;




    public Level (TBSGame game, String carteTmx) {

        this.game = game;
        //img = new Texture("badlogic.jpg");

        map = new TmxMapLoader().load(carteTmx);


        for (int i=0;i<map.getLayers().getCount();i++) {
            layers.add( (TiledMapTileLayer) map.getLayers().get(i) );
        }

        this.createBoard();
    }

    private void createBoard() {

        TiledMapTileLayer layer = layers.get(1);
        board = new int[layer.getWidth()][layer.getWidth()];

        for (int i = 0;i<layer.getWidth(); i++) {
            for (int j = 0; j<layer.getHeight(); j++) {
                int s = -1;
                if (layer.getCell(i,j) != null) {
                    s = layer.getCell(i,j).getTile().getId();   //getProperties().get("access");
                }
                board[i][j] = s;
            }
            System.out.println(Arrays.toString(board[i]));
        }


    }





    // GETTERS & SETTERS


    public int[][] getBoard() {
        return board;
    }

    public TiledMap getMap() {
        return map;
    }

    public OrthogonalTiledMapRenderer getRenderer() {
        return renderer;
    }
}

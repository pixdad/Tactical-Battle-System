package fr.pixdad.games;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Action;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by David on 20/10/2016.
 *
 * Représente une entité générique dans un monde de tiles (TiledWorld).
 * Possède une position graphique et une position dans le tiledworld.
 *
 */
public class TBSEntity {

    /*
    private Stage stage;
	Group parent;
	private final DelayedRemovalArray<EventListener> listeners = new DelayedRemovalArray(0);
	private final DelayedRemovalArray<EventListener> captureListeners = new DelayedRemovalArray(0);
	private final Array<Action> actions = new Array(0);

	private String name;
	private Touchable touchable = Touchable.enabled;
	private boolean visible = true, debug;
	float x, y;
	float width, height;
	float originX, originY;
	float scaleX = 1, scaleY = 1;
	float rotation;
	final Color color = new Color(1, 1, 1, 1);
	private Object userObject;
     */

    /* General */
    String name;

    /* Graphic & animations */
    Texture sprite;
    float x, y;
    float width, height;
    float originX, originY;
    float scaleX = 1, scaleY = 1;
    float rotation = 0;
    boolean visible = true;

    /* Game Logic */
    private final ArrayList<Action> actions = new ArrayList<Action>();
    int col, row;     //Position in the tiled world
    int logicW = 1, logicH = 1;



    //Data.ActorClass actorClass;
    //Data.ActorTeam actorTeam;


    public TBSEntity(String name, String textureFileName, float width, float height) {
        sprite = new Texture(textureFileName);
    }


    /*
    Graphic Methods
    */

    public void act (float delta) {
        Iterator<Action> it = actions.iterator();
        while(it.hasNext()) {
            Action action = it.next();
            if ( action.act(delta) ) {
                it.remove();
            }
        }
    }

    /*
    Game (logic) Methods

    Depend on the specialization
    */



    /* Getters & Setters */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Texture getSprite() {
        return sprite;
    }
    public void setSprite(Texture sprite) {
        this.sprite = sprite;
    }
    public boolean isVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    // CRUD actions
    public void addActions(Action action) { actions.add(action); }
    public void getAction(int index) { actions.get(index); }
    public void removeAction(int index) { actions.remove(index); }
    public void removeAction(Action action) { actions.remove(action); }

}



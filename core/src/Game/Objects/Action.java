package Game.Objects;

/**
 * Created by David on 19/11/2016.
 */
public abstract class Action {

    public abstract void update( float dt );
    public abstract void onStart();
    public abstract void onEnd();

    public boolean isFinished;
    public boolean isBlocking;
    public int lanes;
    public float elapsed;
    public float duration;

    private ActionList ownerList;
}

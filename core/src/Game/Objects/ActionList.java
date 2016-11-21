package Game.Objects;

import java.util.ArrayList;

/**
 * Created by David on 19/11/2016.
 */
public class ActionList {

    private float duration;
    private float timeElapsed;
    private float percentDone;
    private boolean blocking;
    private int  lanes;
    private ArrayList<Action> actions; // can be a vector or linked list

    void update( float dt ) {
        int i = 0;
        while(i != actions.size())
        {
            Action action = actions.get(i);
            action.update(dt);

            if(action.isBlocking)
                break;

            if(action.isFinished)
            {
                action.onEnd();
                this.remove( action );
                --i;
            }

            ++i;
        }
    }

    void pushFront( Action action ) {

    }
    void pushBack( Action action ) {}
    void insertBefore( Action action ){}
    void insertAfter( Action action ){}

    Action remove( Action action ){}

    Action begin() {}
    Action end() {}

}

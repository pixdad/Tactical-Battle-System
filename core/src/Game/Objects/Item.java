package Game.Objects;

import java.util.ArrayList;

/**
 * Created by David on 18/11/2016.
 */
public abstract class Item {
    String name;
    String description;
    int price = 0;
    boolean isSaleable = true;

    private ArrayList<ActorClass> classRequired;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean isUsable(ActorClass actorClass) {
        return this.classRequired.isEmpty() || this.classRequired.contains(actorClass);
    }

    //GETTERS & SETTERS
}

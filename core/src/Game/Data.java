package Game;


import java.util.ArrayList;

/**
 * Created by David on 22/10/2016.
 */
public class Data {

    public enum ActorTeam {
        ALLY,
        ENNEMY,
        PLAYER;
    }

    public enum ActorClass {
        MAGE,
        KNIGHT,
        ARCHER;
    }

    public class ActorStatsSet {
        int strengh = 0;
        int defense = 0;
        int intelligence = 0;
        int resistance = 0;
        int speed = 0;
        int chance = 0;

    }

    public abstract class Item {
        String name;
        String description;
        int price;
        boolean isSaleable;

        private ArrayList<Data.ActorClass> classRequired;

        public boolean isUsable(Data.ActorClass actorClass) {
            if (this.classRequired.isEmpty() || this.classRequired.contains(actorClass)) {
                return true;
            }
            return false;
        }

        //GETTERS & SETTERS

    }

    public class WeaponItem extends Item {
        int porteeMin;
        int porteeMax;
        int Dmg;

        passiveEffects;

        targetEffects;

        /**
         * @Brief 0:himself / 1:opponents / 2:allies
         */
        int targetType;

    }

    public class DisposableItem extends Item {

    }

    public class PassiveItem extends Item {

    }


}

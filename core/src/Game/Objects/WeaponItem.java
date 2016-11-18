package Game.Objects;

import Game.Data;

/**
 * Created by David on 18/11/2016.
 */
public class WeaponItem extends Item {

    int porteeMin = 1;
    int porteeMax = 1;
    int dmg;

    ActorStatsSet passiveEffects;
    ActorStatsSet targetEffects;

    Data.AffectedTarget targetType;

    public WeaponItem(String name, String description, int dmg, Data.AffectedTarget targetType) {
        super(name, description);
        this.dmg = dmg;
        this.targetType = targetType;
    }
}

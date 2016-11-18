package Game;


import Game.Objects.ActorClass;
import Game.Objects.DisposableItem;
import Game.Objects.WeaponItem;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 * Created by David on 22/10/2016.
 *
 * Les enumerations sont les types de données ne provenant pas de fichiers externes, mais personalisables ici.
 * Les objets Hashtables sont l'instanciation des données contenues dans les fichiers de donnée, la clé est leur champ name (ou un ID parfois)
 */
public class Data {


    public enum ActorTeam {
        ALLY,
        ENNEMY,
        PLAYER;
    }
    /** Du point de vue de l'actor concerné */
    public enum AffectedTarget {
        HIMSELF,
        OPPONENT,
        ALLIES,
        OTHERS,
        ALL
    }


    Hashtable<String, ActorClass> actorClasses = new Hashtable<String, ActorClass>();
    Hashtable<String, WeaponItem> weaponItems = new Hashtable<String, WeaponItem>();
    //Hashtable<String, DisposableItem> disposableItems = new Hashtable<String, DisposableItem>();


    public Data() {
        init();
    }

    /**
     * Methode temporaire pour creer les objets de Data à la main.
     * TO-DO : Utiliser la classe TBSDataManager pour réaliser la même chose à partir de fichiers de données
     */
    public void init() {
        //Classes d'acteurs
        actorClasses.put("mage", new ActorClass("mage"));
        actorClasses.put("knight", new ActorClass("knight"));
        actorClasses.put("archer", new ActorClass("archer"));

        //Weapons
        weaponItems.put("woodySword", new WeaponItem("woodySword", "A woody sword, weak", 3, AffectedTarget.OPPONENT) );
        weaponItems.put("ironSword", new WeaponItem("ironSword", "A good iron sword", 8, AffectedTarget.OPPONENT) );


    }
}

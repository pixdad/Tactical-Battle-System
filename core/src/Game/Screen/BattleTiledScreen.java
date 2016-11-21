package Game.Screen;

import Game.Objects.Entities.Actor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.pixdad.games.TBSGame;
import fr.pixdad.games.TiledScreen;

import java.util.ArrayList;

/**
 * Created by David on 17/11/2016.
 */
public class BattleTiledScreen extends TiledScreen {

    // Map informations

    String mapFileName;
    ArrayList<Actor> players;
    ArrayList<Actor> allies;
    ArrayList<Actor> ennemies;


    //State Information
    enum TurnState {
        Player, Ally, Enemy
    }
    enum ActionTurnSate {
        ActorSelection, TargetSelection, SelectAction, PerformAction
    }
    enum ActionState {
        Attack, Object, Wait
    }

    TurnState turnState;
    ActionTurnSate actionTurnSate;
    ActionState actionState;

    String objectif = "Vaincre tous les ennemis";






    public BattleTiledScreen(TBSGame game, String levelTmxFilename) {
        super(game, levelTmxFilename);
    }

    @Override
    public void renderScreen(float delta, SpriteBatch batch) {

    }

    @Override
    public void updateScreen(float delta) {

    }
}

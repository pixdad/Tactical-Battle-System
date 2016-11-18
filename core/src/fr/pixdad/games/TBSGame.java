package fr.pixdad.games;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Game.Data;
import Game.Screen.TestScreen;

import java.util.ArrayList;

public class TBSGame extends Game {

	private ArrayList<Screen> screens = new ArrayList<Screen>();
	public SpriteBatch batch;
	public BitmapFont font;

	public Data data = new Data();

	@Override
	public void create() {
		batch = new SpriteBatch();
        font = new BitmapFont();

        this.addScreen(new TestScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	public void addScreen(Screen newScreen) {
		Screen current = this.getScreen();
		screens.add(current);
		super.setScreen(newScreen);
	}

	public boolean closeScreen() {
		System.out.println(screens.size());
		if(!screens.isEmpty()) {
			Screen lastScreen = screens.get(screens.size()-1);
			setScreen(lastScreen);
			screens.remove(lastScreen);
			return true;
		}
		return false;
	}
}

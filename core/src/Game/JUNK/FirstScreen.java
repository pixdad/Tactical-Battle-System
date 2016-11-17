package Game.JUNK;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import fr.pixdad.games.TBSGame;

public class FirstScreen implements Screen {
	
	TBSGame game;
	Texture img;
	
	public FirstScreen(TBSGame game) {
		this.game = game;
		img = new Texture("badlogic.jpg");
	}

	public FirstScreen(TBSGame game, int num) {
		this.game = game;
		img = new Texture("Magistere.png");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(img, 0, 0);
		game.batch.end();
		boolean estTouche = Gdx.input.justTouched();
		if (estTouche) {
			System.out.println("est Touché");
			game.closeScreen();
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}

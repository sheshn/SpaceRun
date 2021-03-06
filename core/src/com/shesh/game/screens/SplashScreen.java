package com.shesh.game.screens;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.shesh.game.Assets;
import com.shesh.game.SpaceRun;

public class SplashScreen implements Screen {

	/**
	 * The length of the time that the splash screen is shown.
	 */
	private static final float SPLASH_SCREEN_LENGTH = 1.8f;

	private SpaceRun game;
	private float fTimer = 0;

	public SplashScreen(SpaceRun game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		game.getBatch().begin();
		if (Gdx.app.getType().equals(ApplicationType.Android)) {
			game.getBatch().draw(Assets.texSplash, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		} else {
			game.getBatch().draw(Assets.texSplash, 0, 0, SpaceRun.WIDTH, SpaceRun.HEIGHT);

		}
		game.getBatch().end();

		fTimer += delta;
		if (fTimer > SPLASH_SCREEN_LENGTH) {
			game.setScreen(game.getMainMenuScreen());
		}
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}

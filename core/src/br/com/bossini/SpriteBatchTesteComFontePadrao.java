package br.com.bossini;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class SpriteBatchTesteComFontePadrao extends ApplicationAdapter {
    private SpriteBatch spriteBatch;
    private BitmapFont bitmapFont;
    private OrthographicCamera orthographicCamera;
    private Viewport viewport;

    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        bitmapFont = new BitmapFont();
        orthographicCamera = new OrthographicCamera();
        viewport = new FitViewport(640, 480, orthographicCamera);
    }


    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void render() {
        //isso limpa a tela
        Gdx.gl.glClearColor(1.0f, 1f, 1f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //ScreenUtils.clear(Color.WHITE);
        spriteBatch.begin();
        spriteBatch.setProjectionMatrix(orthographicCamera.combined);
        int x = Gdx.input.getX();
        int y = Gdx.input.getY();
        boolean esquerdo = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
        boolean direito = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);
        boolean a = Gdx.input.isKeyPressed(Input.Keys.A);
        boolean w = Gdx.input.isKeyPressed(Input.Keys.W);
        boolean s = Gdx.input.isKeyPressed(Input.Keys.S);
        boolean d = Gdx.input.isKeyPressed(Input.Keys.D);
        bitmapFont.draw(spriteBatch, String.format("Posição do mouse: %d, %d", x, y), 20f, 480f - 20f);
        bitmapFont.draw(spriteBatch, String.format("Esquerdo: %s", esquerdo ? "Sim" : "Não"), 20f, 480f - 40f);
        bitmapFont.draw(spriteBatch, String.format("Direito: %s", direito ? "Sim" : "Não"), 20f, 480f - 60f);
        if (a) bitmapFont.draw(spriteBatch, "A", 20f, 480f - 100f);
        if (w) bitmapFont.draw(spriteBatch, "W", 40f, 480f - 80f);
        if (s) bitmapFont.draw(spriteBatch, "S", 40f, 480f - 100f);
        if (d) bitmapFont.draw(spriteBatch, "D", 60f, 480f - 100f);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        bitmapFont.dispose();
    }
}

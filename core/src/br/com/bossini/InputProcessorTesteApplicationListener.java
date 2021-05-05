package br.com.bossini;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class InputProcessorTesteApplicationListener extends ApplicationAdapter {

    private SpriteBatch spriteBatch;
    private OrthographicCamera orthographicCamera;
    private Viewport viewport;
    private BitmapFont bitmapFont;
    private InputProcessorTeste inputProcessorTeste;

    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        orthographicCamera = new OrthographicCamera();
        viewport = new FitViewport(640, 480);
        bitmapFont = new BitmapFont();
        bitmapFont.setColor(Color.BLUE);
        inputProcessorTeste = new InputProcessorTeste();
        Gdx.input.setInputProcessor(inputProcessorTeste);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        bitmapFont.draw(spriteBatch, inputProcessorTeste.getTexto(), 20f, 480f - 20f);
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void dispose() {
        bitmapFont.dispose();
        spriteBatch.dispose();
    }
}







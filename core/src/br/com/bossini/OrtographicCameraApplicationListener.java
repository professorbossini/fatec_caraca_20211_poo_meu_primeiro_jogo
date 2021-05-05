package br.com.bossini;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class OrtographicCameraApplicationListener extends ApplicationAdapter {
    private static final float WIDTH = 6.4f;
    private static final float HEIGHT = 4.8f;
    public static final float CAMERA_SPEED = 2;
    public static final float CAMERA_ZOOM_SPEED = 2;

    private OrthographicCamera orthographicCamera;
    private Viewport viewport;
    private SpriteBatch spriteBatch;
    private Texture texture;

    @Override
    public void create() {
        Gdx.app.setLogLevel(Logger.DEBUG);
        orthographicCamera = new OrthographicCamera();
        viewport = new FitViewport(WIDTH, HEIGHT, orthographicCamera);
        spriteBatch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("raw/montanhas.png"));
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        texture.dispose();
    }

    @Override
    public void render() {
        capturarTeclas();
        Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.setProjectionMatrix(orthographicCamera.combined);
        spriteBatch.begin();
        spriteBatch.draw(texture, 0f, 0f, WIDTH, HEIGHT);
        spriteBatch.end();
    }

    private void capturarTeclas(){
        float tempoEntreFrames = Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            orthographicCamera.position.x -= CAMERA_SPEED * tempoEntreFrames;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            orthographicCamera.position.x += CAMERA_SPEED * tempoEntreFrames;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)){
            orthographicCamera.position.y += CAMERA_SPEED * tempoEntreFrames;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)){
            orthographicCamera.position.y -= CAMERA_SPEED * tempoEntreFrames;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            orthographicCamera.zoom -= CAMERA_ZOOM_SPEED * tempoEntreFrames;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            orthographicCamera.zoom += CAMERA_ZOOM_SPEED * tempoEntreFrames;
        }
        orthographicCamera.update();
    }
}

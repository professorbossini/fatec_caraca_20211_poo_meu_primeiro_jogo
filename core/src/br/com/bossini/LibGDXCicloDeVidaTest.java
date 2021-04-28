package br.com.bossini;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public class LibGDXCicloDeVidaTest implements ApplicationListener {

    private static String TAG = "TESTE_CICLO_DE_VIDA";
    private static int contador = 1;

    @Override
    public void create() {
        Gdx.app.debug(TAG, "create");
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.debug(TAG, String.format(
                "resize. w: %d, h: %d",
                width,height
        ));
    }

    @Override
    public void render() {
        contador++;
        if (contador == 60){
            Gdx.app.debug(TAG, "render");
            contador = 1;
        }
    }

    @Override
    public void pause() {
        Gdx.app.debug(TAG, "pause");
    }

    @Override
    public void resume() {
        Gdx.app.debug(TAG, "resume");
    }

    @Override
    public void dispose() {
        Gdx.app.debug(TAG, "dispose");
    }
}

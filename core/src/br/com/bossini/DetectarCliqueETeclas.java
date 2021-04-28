package br.com.bossini;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.Logger;

public class DetectarCliqueETeclas extends ApplicationAdapter {

    private static final String TAG = DetectarCliqueETeclas.class.getName();


    @Override
    public void create() {
        Gdx.app.setLogLevel(Logger.DEBUG);
    }

    @Override
    public void render() {
        int x = Gdx.input.getX();
        int y = Gdx.input.getY();
        Gdx.app.debug(TAG, String.format(
                "Mouse: %d, %d", x, y
        ));
        boolean algumaTeclaEstaPressionada = Gdx.input.isKeyPressed(Input.Keys.ANY_KEY);
        Gdx.app.debug(TAG, algumaTeclaEstaPressionada ? "Tem uma tecla pressionada" : "Não tem uma teclada pressionada");
    }

}

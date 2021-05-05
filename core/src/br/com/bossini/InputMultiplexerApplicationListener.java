package br.com.bossini;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.utils.Logger;

public class InputMultiplexerApplicationListener extends ApplicationAdapter {
    private InputMultiplexer inputMultiplexer;

    @Override
    public void create() {
        Gdx.app.setLogLevel(Logger.DEBUG);
        inputMultiplexer = new InputMultiplexer();
        inputMultiplexer.addProcessor( new InputAdapter(){
            @Override
            public boolean keyTyped(char character) {
                if (character == 'w'){
                    Gdx.app.debug("TESTE_MULTIPLEXER", String.format(
                            "Primeiro: %c", character
                    ));
                    return false;
                }
                Gdx.app.debug("TESTE_MULTIPLEXER", String.format(
                        "Primeiro: %c", character
                ));
                return true;
            }
        });
        inputMultiplexer.addProcessor(new InputAdapter(){
            @Override
            public boolean keyTyped(char character) {
                Gdx.app.debug("TESTE_MULTIPLEXER", String.format(
                        "Segundo: %c", character
                ));
                return true;
            }
        });
        Gdx.input.setInputProcessor(inputMultiplexer);
    }
}



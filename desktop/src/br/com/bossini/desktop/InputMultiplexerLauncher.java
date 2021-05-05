package br.com.bossini.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import br.com.bossini.InputMultiplexerApplicationListener;

public class InputMultiplexerLauncher {
    public static void main(String[] args) {
        new LwjglApplication(
                new InputMultiplexerApplicationListener(),
                new LwjglApplicationConfiguration()
        );
    }
}

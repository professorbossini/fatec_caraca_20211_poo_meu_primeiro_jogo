package br.com.bossini.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.utils.Logger;

import br.com.bossini.LibGDXCicloDeVidaTest;

public class LibGDXCicloDeVidaTestLauncher {
    public static void main(String[] args) {

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new LibGDXCicloDeVidaTest(), config);
        Gdx.app.setLogLevel(Logger.DEBUG);
    }
}

package br.com.bossini.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import br.com.bossini.InputProcessorTesteApplicationListener;

public class InputProcessorTesteLauncher {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new InputProcessorTesteApplicationListener(), config);
    }
}

package br.com.bossini.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import br.com.bossini.DetectarCliqueETeclas;

public class DetectarCliqueETeclasLauncher {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new DetectarCliqueETeclas(), config);
    }
}


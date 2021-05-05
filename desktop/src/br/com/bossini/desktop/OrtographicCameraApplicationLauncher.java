package br.com.bossini.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import br.com.bossini.OrtographicCameraApplicationListener;

public class OrtographicCameraApplicationLauncher {
    public static void main(String[] args) {
    new LwjglApplication(
            new OrtographicCameraApplicationListener(),
            new LwjglApplicationConfiguration()
    ) ;
    }
}

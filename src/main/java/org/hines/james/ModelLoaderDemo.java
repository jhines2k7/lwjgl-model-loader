package org.hines.james;

public class ModelLoaderDemo {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            OpenGLApp modelLoader= new ModelLoader();
            Engine engine = new Engine("OpenGL Model Loader", 800, 600, vSync, modelLoader);
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}

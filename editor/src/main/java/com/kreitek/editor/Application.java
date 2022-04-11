package com.kreitek.editor;

import com.kreitek.editor.visitor.Visualizer;

public class Application {

    public static void main(String[] args) throws Exception {

        try {
            Visualizer visualizer = Visualizer.getInstance();
            visualizer.setType(args[0]);
        }catch (Exception e){
            throw  new Exception("Inserte algun argumento");
        }

        EditorFactory editorFactory = new EditorFactory();
        Editor editor = editorFactory.getEditor();
        editor.run();
    }

}

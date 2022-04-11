package com.kreitek.editor.visitor;

import com.kreitek.editor.format.FormatFactory;
import com.kreitek.editor.format.FormatJSON;
import com.kreitek.editor.format.FormatString;

import java.util.ArrayList;

public class Visualizer {

    private static volatile Visualizer instance;
    private final ShowFormatVisitor visitor = new ShowFormatVisitor();
    private final FormatFactory formatFactory = new FormatFactory();
    private String type;

    public static Visualizer getInstance(){
        if (instance == null) {
            synchronized(Visualizer.class) {
                if (instance == null) {
                    instance = new Visualizer();
                }
            }
        }
        return instance;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getFormat(ArrayList<String> textLines){
        switch (type){
            case "JSON":
                FormatJSON textJSON = formatFactory.getFormatJSON(textLines);
                return textJSON.accept(visitor);
            default:
                FormatString textString = formatFactory.getFormatString(textLines);
                return textString.accept(visitor);
        }
    }

}

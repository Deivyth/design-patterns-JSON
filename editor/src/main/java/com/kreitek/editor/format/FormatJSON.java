package com.kreitek.editor.format;

import com.kreitek.editor.visitor.ShowFormatVisitor;

import java.util.ArrayList;

public class FormatJSON implements Format{

    private ArrayList<String> textLines;

    public FormatJSON(ArrayList<String> textLines) {
        this.textLines = textLines;
    }

    public ArrayList<String> getArrayList() {
        return  textLines;
    }

    public String accept(ShowFormatVisitor visitor){
        return visitor.getString(this);
    }
}

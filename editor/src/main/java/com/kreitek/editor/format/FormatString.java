package com.kreitek.editor.format;

import com.kreitek.editor.visitor.ShowFormatVisitor;

import java.util.ArrayList;

public class FormatString implements Format{

    private ArrayList<String> textLines;

    public FormatString(ArrayList<String> textLines) {
        this.textLines = textLines;
    }

    public ArrayList<String> getArrayList() {
        return  textLines;
    }

    public String accept(ShowFormatVisitor visitor){
        return visitor.getString(this);
    }

}

package com.kreitek.editor.visitor;

import com.kreitek.editor.format.FormatJSON;
import com.kreitek.editor.format.FormatString;

import java.util.ArrayList;

public class ShowFormatVisitor implements TextTypeVisitor {

    @Override
    public String getString(FormatString textString) {
        ArrayList<String> textLines = textString.getArrayList();
        StringBuilder stringBuilder = new StringBuilder();

        for (int index = 0; index < textLines.size(); index++) {
            stringBuilder.append("[");
            stringBuilder.append(index);
            stringBuilder.append("] ");
            stringBuilder.append(textLines.get(index));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String getString(FormatJSON textJSON) {
        ArrayList<String> textLines = textJSON.getArrayList();
        StringBuilder stringBuilder = new StringBuilder();

        if (textLines.size() > 0){
            stringBuilder.append("{\n");
            stringBuilder.append("\t'doc':[\n");
            for (int index = 0; index < textLines.size(); index++){
                stringBuilder.append("\t\t{'line':'");
                stringBuilder.append(index);
                stringBuilder.append("','text':'");
                stringBuilder.append(textLines.get(index));
                stringBuilder.append("'},\n");
            }
            stringBuilder.append("\t]\n");
            stringBuilder.append("}\n");
        }
        return stringBuilder.toString();
    }
}

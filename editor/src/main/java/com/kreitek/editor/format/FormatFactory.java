package com.kreitek.editor.format;

import java.util.ArrayList;

public class FormatFactory {

    public FormatJSON getFormatJSON(ArrayList<String> textLines){
        return new FormatJSON(textLines);
    }
    public FormatString getFormatString(ArrayList<String> textLines){
        return new FormatString(textLines);
    }

}

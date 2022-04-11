package com.kreitek.editor.visitor;

import com.kreitek.editor.format.FormatJSON;
import com.kreitek.editor.format.FormatString;

public interface TextTypeVisitor {

    String getString (FormatString textString);
    String getString (FormatJSON textJSON);

}

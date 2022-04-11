package com.kreitek.editor.format;

import com.kreitek.editor.visitor.ShowFormatVisitor;

public interface Format {
    String accept(ShowFormatVisitor visitor);
}

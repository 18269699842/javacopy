package com.liwo.app.core;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;
import sun.beans.editors.StringEditor;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;

/**
 * Created by chenhuan on 15-9-27.
 */
public class BaseEditor extends StringEditor {

    @Override
    public String getAsText() {
        System.out.println(1);
        return super.getAsText();
    }
}

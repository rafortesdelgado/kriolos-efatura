package io.github.kriolos.efatura.kriolosefaturaservice.components;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.textfield.TextField;

public class CrudGrid<T> extends Grid<T> {

    public CrudGrid (Class<T> klass, boolean generate) {
        super(klass, generate);

        var dict =  new HashMap<String,Field>();

        for( var f : klass.getFields()) 
        {
            dict.put(f.getName(), f);
        }


        for(var c : this.getColumns())
        {
            var f = dict.get(c.getHeaderText());
            var editor = new TextField(c.getHeaderText());
            c.setEditorComponent(editor);
        }
    }
}

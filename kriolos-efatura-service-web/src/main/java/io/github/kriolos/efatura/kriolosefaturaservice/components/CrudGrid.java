package io.github.kriolos.efatura.kriolosefaturaservice.components;

import com.vaadin.flow.component.grid.Grid;

public class CrudGrid<T> extends Grid<T> {

    private Grid<T> grid;

    public CrudGrid () {
        this.grid = new Grid<T>();
        
    }
}

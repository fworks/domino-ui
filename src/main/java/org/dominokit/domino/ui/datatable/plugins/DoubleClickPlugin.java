package org.dominokit.domino.ui.datatable.plugins;

import org.dominokit.domino.ui.datatable.DataTable;
import org.dominokit.domino.ui.datatable.TableRow;
import org.jboss.gwt.elemento.core.EventType;

public class DoubleClickPlugin<T> implements DataTablePlugin<T> {

    private DoublClickHandler handler;

    public DoubleClickPlugin(DoublClickHandler handler) {
        this.handler = handler;
    }

    @Override
    public void onRowAdded(DataTable<T> dataTable, TableRow<T> tableRow) {
        tableRow.asElement().addEventListener(EventType.dblclick.getName(), evt -> {
            handler.onDoubleClick(tableRow);
        });
    }

    @FunctionalInterface
    public interface DoublClickHandler<T> {
        void onDoubleClick(TableRow<T> tableRow);
    }
}

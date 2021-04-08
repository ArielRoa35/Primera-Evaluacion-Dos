package uni.evaluacion1.data.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import uni.evaluacion1.backend.pojo.Vehicle;

public class ListTableModel extends AbstractTableModel {
    private List<Vehicle> data;
    private String[] columns;

    public ListTableModel(List<Vehicle> data, String[] columns) {
        this.data = data;
        this.columns = columns;
    }
    
    @Override
    public int getRowCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public int getColumnCount() {
        return columns == null ? 0 : columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            return data.get(rowIndex).asArray()[columnIndex];
    }
    
}

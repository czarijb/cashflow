package com.github.czarijb;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TableModel extends AbstractTableModel{

    private int columnCount = 3;
    private List<String []> dataArrayList;

    public TableModel() {
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++){
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public List<String []> getDataArrayList() {
        return dataArrayList;
    }

    public void setDataArrayList(List<String []> dataArrayList) {
        this.dataArrayList = dataArrayList;
    }

    public int getRowCount() {
        return 0;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
    
    public void addDate (StatementsField o){
        String [] rowTable = new String[getColumnCount()];
        if (o instanceof Assets){
            rowTable[0] = o.getName();
            rowTable[1] = String.valueOf(((Assets) o).getVolume());
            rowTable[2] = String.valueOf(o.getPrice());

            dataArrayList.add(rowTable);
        } else{
            rowTable[0] = o.getName();
            rowTable[1] = String.valueOf(o.getPrice());

            dataArrayList.add(rowTable);
        }

    }
}

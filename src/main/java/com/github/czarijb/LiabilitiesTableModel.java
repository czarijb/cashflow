package com.github.czarijb;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandr on 05.01.17.
 */
public class LiabilitiesTableModel extends AbstractTableModel {

    private int columnCount = 2;
    private List<String []> liabilitiesDataArrayList;

    public LiabilitiesTableModel() {
        liabilitiesDataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < liabilitiesDataArrayList.size(); i++){
            liabilitiesDataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public List<String []> getLiabilitiesDataArrayList() {
        return liabilitiesDataArrayList;
    }

    public void setLiabilitiesDataArrayList(List<String []> incomeDataArrayList) {
        this.liabilitiesDataArrayList = incomeDataArrayList;
    }

    public int getRowCount() {
        return liabilitiesDataArrayList.size();
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        String [] rows = liabilitiesDataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public void addLiabilitiesDate(StatementsField o){
        String [] rowTable = new String[getColumnCount()];
        rowTable[0] = o.getName();
        rowTable[1] = String.valueOf(o.getPrice());
        liabilitiesDataArrayList.add(rowTable);


    }
}

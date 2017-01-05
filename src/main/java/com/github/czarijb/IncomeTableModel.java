package com.github.czarijb;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class IncomeTableModel extends AbstractTableModel{

    private int columnCount = 2;
    private List<String []> incomeDataArrayList;

    public IncomeTableModel() {
        incomeDataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < incomeDataArrayList.size(); i++){
            incomeDataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public List<String []> getIncomeDataArrayList() {
        return incomeDataArrayList;
    }

    public void setIncomeDataArrayList(List<String []> incomeDataArrayList) {
        this.incomeDataArrayList = incomeDataArrayList;
    }

    public int getRowCount() {
        return incomeDataArrayList.size();
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        String [] rows = incomeDataArrayList.get(rowIndex);
        return rows[columnIndex];
    }
    
    public void addIncomeDate(StatementsField o){
        String [] rowTable = new String[getColumnCount()];
        rowTable[0] = o.getName();
        rowTable[1] = String.valueOf(o.getPrice());
        incomeDataArrayList.add(rowTable);


    }
}

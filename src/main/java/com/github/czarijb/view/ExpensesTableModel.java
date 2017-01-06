package com.github.czarijb.view;

import com.github.czarijb.model.StatementsField;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandr on 05.01.17.
 */
public class ExpensesTableModel extends AbstractTableModel {

    private int columnCount = 2;
    private List<String []> expensesDataArrayList;

    public ExpensesTableModel() {
        expensesDataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < expensesDataArrayList.size(); i++){
            expensesDataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public List<String []> getExpensesDataArrayList() {
        return expensesDataArrayList;
    }

    public void setExpensesDataArrayList(List<String []> incomeDataArrayList) {
        this.expensesDataArrayList = incomeDataArrayList;
    }

    public int getRowCount() {
        return expensesDataArrayList.size();
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        String [] rows = expensesDataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public void addExpensesDate(StatementsField o){
        String [] rowTable = new String[getColumnCount()];
        rowTable[0] = o.getName();
        rowTable[1] = String.valueOf(o.getPrice());
        expensesDataArrayList.add(rowTable);


    }
}
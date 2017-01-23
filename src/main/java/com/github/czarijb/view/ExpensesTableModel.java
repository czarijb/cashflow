package com.github.czarijb.view;

import com.github.czarijb.model.Expenses;
import com.github.czarijb.model.StatementField;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandr on 05.01.17.
 */
public class ExpensesTableModel extends AbstractTableModel {

    private static final long serialVersionUID = -5528849972472097779L;
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

    public void addExpensesData(StatementField o){
        String [] rowTable = new String[getColumnCount()];
        rowTable[0] = o.getName();
        rowTable[1] = String.valueOf(o.getPrice());
        expensesDataArrayList.add(rowTable);
    }

    public void addAllExpenses(List<Expenses> list){
        expensesDataArrayList.clear();
        for (Expenses expenses : list){
            addExpensesData(expenses);
        }
    }
}

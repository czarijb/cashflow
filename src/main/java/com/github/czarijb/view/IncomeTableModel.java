package com.github.czarijb.view;

import com.github.czarijb.model.Income;
import com.github.czarijb.model.StatementField;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class IncomeTableModel extends AbstractTableModel{

    private static final long serialVersionUID = 4083008991781196863L;
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

    public void addIncomeData(StatementField o){
        String [] rowTable = new String[getColumnCount()];
        rowTable[0] = o.getName();
        rowTable[1] = String.valueOf(o.getPrice());
        incomeDataArrayList.add(rowTable);
    }

    public void addAllIncome(List<Income> list){
        incomeDataArrayList.clear();
        for (Income income : list){
            addIncomeData(income);
        }
    }
}

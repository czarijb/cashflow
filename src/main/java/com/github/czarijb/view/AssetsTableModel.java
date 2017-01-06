package com.github.czarijb.view;

import com.github.czarijb.model.Assets;
import com.github.czarijb.model.StatementsField;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandr on 05.01.17.
 */
public class AssetsTableModel extends AbstractTableModel{
    private int columnCount = 3;
    private List<String []> assetsDataArrayList;

    public AssetsTableModel() {
        assetsDataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < assetsDataArrayList.size(); i++){
            assetsDataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public List<String []> getAssetsDataArrayList() {
        return assetsDataArrayList;
    }

    public void setAssetsDataArrayList(List<String []> assetsDataArrayList) {
        this.assetsDataArrayList = assetsDataArrayList;
    }

    public int getRowCount() {
        return assetsDataArrayList.size();
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        String [] rows = assetsDataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public void addAssetsDate (StatementsField o){
        String [] rowTable = new String[getColumnCount()];
        rowTable[0] = o.getName();
        rowTable[1] = String.valueOf(((Assets) o).getVolume());
        rowTable[2] = String.valueOf(o.getPrice());
        assetsDataArrayList.add(rowTable);


    }
}

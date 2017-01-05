package com.github.czarijb;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class MainFrame extends JFrame {

    MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        //setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        TableModel tableModel = new TableModel();
        tableModel.addDate(new Assets("Банковские облигации", 1000, 200));
        JTable incomeTable = new JTable(tableModel);
        JScrollPane incomeTableScrollPane = new JScrollPane(incomeTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));




        add(incomeTableScrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));


    }
}

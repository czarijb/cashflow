package com.github.czarijb;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class MainFrame extends JFrame {

    MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        IncomeTableModel incomeTableModel = new IncomeTableModel();
        incomeTableModel.addIncomeDate(new Income("Доход", 200));
        JTable incomeTable = new JTable(incomeTableModel);
        JScrollPane incomeTableScrollPane = new JScrollPane(incomeTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(incomeTableScrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        AssetsTableModel assetsTableModel = new AssetsTableModel();
        assetsTableModel.addAssetsDate(new Assets("Активы", 1000, 200));
        JTable assetsTable = new JTable(assetsTableModel);
        JScrollPane assetsTableScrollPane = new JScrollPane(assetsTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(assetsTableScrollPane, new GridBagConstraints(0, 400, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        LiabilitiesTableModel liabilitiesTableModel = new LiabilitiesTableModel();
        liabilitiesTableModel.addLiabilitiesDate(new Liabilities("Пассивы", 200));
        JTable liabilitiesTable = new JTable(liabilitiesTableModel);
        JScrollPane liabilitiesTableScrollPane = new JScrollPane(liabilitiesTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(liabilitiesTableScrollPane, new GridBagConstraints(200, 400, 1, 1, 1, 1,
                GridBagConstraints.SOUTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        ExpensesTableModel expensesTableModel = new ExpensesTableModel();
        expensesTableModel.addExpensesDate(new Expenses("Расходы", 200));
        JTable expensesTable = new JTable(expensesTableModel);
        JScrollPane expensesTableScrollPane = new JScrollPane(expensesTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(expensesTableScrollPane, new GridBagConstraints(0, 100, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));



        setVisible(true);
    }
}

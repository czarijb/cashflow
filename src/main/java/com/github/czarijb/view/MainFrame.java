package com.github.czarijb.view;

import com.github.czarijb.model.Assets;
import com.github.czarijb.model.Expenses;
import com.github.czarijb.model.Income;
import com.github.czarijb.model.Liabilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class MainFrame extends JFrame {

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        /**
        * Таблица доходы, отражающая ежемесячную доходность по всем имеющимся активам
         */
        IncomeTableModel incomeTableModel = new IncomeTableModel();
        incomeTableModel.addIncomeDate(new Income("Доход", 200));
        JTable incomeTable = new JTable(incomeTableModel);
        JScrollPane incomeTableScrollPane = new JScrollPane(incomeTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(incomeTableScrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица расходы отражает ежемесячные бытовые и иные расходы
         */

        ExpensesTableModel expensesTableModel = new ExpensesTableModel();
        expensesTableModel.addExpensesDate(new Expenses("Расходы", 200));
        JTable expensesTable = new JTable(expensesTableModel);
        JScrollPane expensesTableScrollPane = new JScrollPane(expensesTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(expensesTableScrollPane, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица активы, отражающая все имущество по которому возможно получение доходов
         */

        AssetsTableModel assetsTableModel = new AssetsTableModel();
        assetsTableModel.addAssetsDate(new Assets("Активы", 1000, 200));
        JTable assetsTable = new JTable(assetsTableModel);
        JScrollPane assetsTableScrollPane = new JScrollPane(assetsTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(assetsTableScrollPane, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.SOUTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица пассивы отражает обязательства с отражением общих сумм которые необходимо погасить
         */

        LiabilitiesTableModel liabilitiesTableModel = new LiabilitiesTableModel();
        liabilitiesTableModel.addLiabilitiesDate(new Liabilities("Пассивы", 200));
        JTable liabilitiesTable = new JTable(liabilitiesTableModel);
        JScrollPane liabilitiesTableScrollPane = new JScrollPane(liabilitiesTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(liabilitiesTableScrollPane, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.SOUTHEAST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Кнопка создающая событие
         */

        JButton eventButton = new JButton("Событие");
        add(eventButton,new GridBagConstraints(1, 1, 1, 1, 0, 0,
                GridBagConstraints.SOUTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(2, 1, 2, 2), 0, 0));

        eventButton.addActionListener(e -> new EventWindow());

        setVisible(true);
        /**
         * Убираем название колонок
         */
        incomeTableScrollPane.setColumnHeaderView(null);
        expensesTableScrollPane.setColumnHeaderView(null);
        assetsTableScrollPane.setColumnHeaderView(null);
        liabilitiesTableScrollPane.setColumnHeaderView(null);
    }
}

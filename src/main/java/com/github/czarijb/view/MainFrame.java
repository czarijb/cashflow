package com.github.czarijb.view;

import com.github.czarijb.model.Assets;
import com.github.czarijb.model.Expenses;
import com.github.czarijb.model.Income;
import com.github.czarijb.model.Liabilities;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class MainFrame extends JFrame {

    private IncomeTableModel incomeTableModel;
    private JTable incomeTable;
    private JScrollPane incomeTableScrollPane;

    private ExpensesTableModel expensesTableModel;
    private JTable expensesTable;
    private JScrollPane expensesTableScrollPane;

    private AssetsTableModel assetsTableModel;
    private JTable assetsTable;
    private JScrollPane assetsTableScrollPane;

    private LiabilitiesTableModel liabilitiesTableModel;
    private JTable liabilitiesTable;
    private JScrollPane liabilitiesTableScrollPane;

    private JButton eventButton;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        /**
        * Таблица доходы, отражающая ежемесячную доходность по всем имеющимся активам
         */
        incomeTableModel = new IncomeTableModel();
        incomeTableModel.addIncomeData(new Income("Доход", 200));
        incomeTable = new JTable(incomeTableModel);
        incomeTableScrollPane = new JScrollPane(incomeTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(incomeTableScrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица расходы отражает ежемесячные бытовые и иные расходы
         */

        expensesTableModel = new ExpensesTableModel();
        expensesTableModel.addExpensesDate(new Expenses("Расходы", 200));
        expensesTable = new JTable(expensesTableModel);
        expensesTableScrollPane = new JScrollPane(expensesTable);
        expensesTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(expensesTableScrollPane, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица активы, отражающая все имущество по которому возможно получение доходов
         */

        assetsTableModel = new AssetsTableModel();
        assetsTableModel.addAssetsDate(new Assets("Активы", 1000, 200));
        assetsTable = new JTable(assetsTableModel);
        assetsTableScrollPane = new JScrollPane(assetsTable);
        assetsTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(assetsTableScrollPane, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.SOUTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица пассивы отражает обязательства с отражением общих сумм которые необходимо погасить
         */

        liabilitiesTableModel = new LiabilitiesTableModel();
        liabilitiesTableModel.addLiabilitiesDate(new Liabilities("Пассивы", 200));
        liabilitiesTable = new JTable(liabilitiesTableModel);
        liabilitiesTableScrollPane = new JScrollPane(liabilitiesTable);
        liabilitiesTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(liabilitiesTableScrollPane, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.SOUTHEAST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Кнопка создающая событие
         */

        eventButton = new JButton("Событие");
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

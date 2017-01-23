package com.github.czarijb.view;

import com.github.czarijb.daoImpl.AssetsDAOImpl;
import com.github.czarijb.daoImpl.ExpensesDAOImpl;
import com.github.czarijb.daoImpl.IncomeDAOImpl;
import com.github.czarijb.daoImpl.LiabilitiesDAOImpl;
import com.github.czarijb.hibernateUtils.Factory;
import com.github.czarijb.model.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 *
 */
public class MainFrame extends JFrame {

    private static final long serialVersionUID = 6378566768935656633L;

    Factory factory = Factory.getInstance();

    AssetsTableModel assetsTableModel;
    AssetsDAOImpl assetsDAO = factory.getAssetsDao();
    private List<Assets> assetsList = assetsDAO.getAllAssets();
    private JTable assetsTable;
    private JScrollPane assetsTableScrollPane;

    ExpensesTableModel expensesTableModel;
    ExpensesDAOImpl expensesDAO = factory.getExpensesDao();
    private List<Expenses> expensesList = expensesDAO.getAllExpenses();
    private JTable expensesTable;
    private JScrollPane expensesTableScrollPane;
    private Expenses expensesSummary;

    IncomeTableModel incomeTableModel;
    IncomeDAOImpl incomeDAO = factory.getIncomeDao();
    private List<Income> incomeList;
    private JTable incomeTable;
    private JScrollPane incomeTableScrollPane;
    private Income incomeSummary = new Income();
    private Income incomeCashFlow = new Income();

    LiabilitiesTableModel liabilitiesTableModel;
    LiabilitiesDAOImpl liabilitiesDAO = factory.getLiabilitiesDao();
    private List<Liabilities> liabilitiesList;
    private JTable liabilitiesTable;
    private JScrollPane liabilitiesTableScrollPane;

    private JButton eventButton;

    private int getSumAllFields(List<StatementField> list){
        int a = 0;
        for (int i = 0; i < list.size(); i++){
            a += list.get(i).getPrice();
        }
        return a;
    }

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());


        /**
         * Таблица активы, отражающая все имущество по которому возможно получение доходов
         */

        assetsTableModel = new AssetsTableModel();
        assetsTableModel.addAllAssets(assetsList);
        assetsTable = new JTable(assetsTableModel);
        assetsTableScrollPane = new JScrollPane(assetsTable);
        assetsTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(assetsTableScrollPane, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.SOUTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица расходы отражает ежемесячные бытовые и иные расходы
         */

        expensesTableModel = new ExpensesTableModel();
        expensesList = expensesDAO.getAllExpenses();
        expensesTableModel.addAllExpenses(expensesList);
        //expensesSummary = new Expenses("Итого расходы", getSumAllFields(expensesList));
        expensesTable = new JTable(expensesTableModel);
        expensesTableScrollPane = new JScrollPane(expensesTable);
        expensesTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(expensesTableScrollPane, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица доходы, отражающая ежемесячную доходность по всем имеющимся активам
         */
        incomeTableModel = new IncomeTableModel();
        incomeList = incomeDAO.getAllIncome();
        incomeTableModel.addAllIncome(incomeList);
        //incomeSummary = new Income("Итого доходы", getSumAllFields(incomeList));
        //incomeCashFlow = new Income("Денежный поток", getSumAllFields(incomeList) - getSumAllFields(expensesList));
        incomeTable = new JTable(incomeTableModel);
        incomeTableScrollPane = new JScrollPane(incomeTable);
        incomeTableScrollPane.setPreferredSize(new Dimension(265, 195));

        add(incomeTableScrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        /**
         * Таблица пассивы отражает обязательства с отражением общих сумм которые необходимо погасить
         */

        liabilitiesTableModel = new LiabilitiesTableModel();
        liabilitiesList = liabilitiesDAO.getAllLiabilities();
        liabilitiesTableModel.addAllLiabilities(liabilitiesList);
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

        eventButton.addActionListener(e -> new EventWindow(assetsTableModel, expensesTableModel, incomeTableModel, liabilitiesTableModel));

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

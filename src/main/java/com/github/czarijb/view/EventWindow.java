package com.github.czarijb.view;

import com.github.czarijb.model.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by aleksandr on 06.01.17.
 */
public class EventWindow extends JFrame {

    private JRadioButton incomeRadioButton;
    private JLabel labelIncomeName;
    private JTextField textFieldIncomeName;
    private JLabel labelIncomePrice;
    private JTextField textFieldIncomePrice;

    private JRadioButton expensesRadioButton;
    private JLabel labelExpensesName;
    private JTextField textFieldExpensesName;
    private JLabel labelExpensesPrice;
    private JTextField textFieldExpensesPrice;

    private JRadioButton assetsRadioButton;
    private JLabel labelAssetsName;
    private JTextField textFieldAssetsName;
    private JLabel labelAssetsVolume;
    private JTextField textFieldAssetsVolume;
    private JLabel labelAssetsPrice;
    private JTextField textFieldAssetsPrice;

    private JRadioButton liabilitiesRadioButton;
    private JLabel labelLiabilitiesName;
    private JTextField textFieldLiabilitiesName;
    private JLabel labelLiabilitiesPrice;
    private JTextField textFieldLiabilitiesPrice;

    private JButton createButton;
    private JButton updateButton;
    private JButton deleteButton;

    public EventWindow(){
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600, 400);
        //setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        /**
         * Активация и добавление элемента поля "Доходы" по нажатию на кнопку событие
         */

        incomeRadioButton = new JRadioButton("Доходы");
        labelIncomeName = new JLabel("Название источника дохода");
        textFieldIncomeName = new JTextField("введите название источника дохода");
        labelIncomePrice = new JLabel("Стоимость источника дохода");
        textFieldIncomePrice = new JTextField("введите стоимость источника дохода");

        add(incomeRadioButton, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelIncomeName, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldIncomeName, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelIncomePrice, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldIncomePrice, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));


        textFieldIncomeName.setEditable(false);
        textFieldIncomePrice.setEditable(false);

        incomeRadioButton.addActionListener(e  -> {
            if(incomeRadioButton.isSelected()) {
                textFieldIncomeName.setEditable(true);
                textFieldIncomePrice.setEditable(true);
            }else {
                textFieldIncomeName.setEditable(false);
                textFieldIncomePrice.setEditable(false);
            }
        });

        /**
         * Активация и добавление элемента поля "Расходы" по нажатию на кнопку событие
         */

        expensesRadioButton = new JRadioButton("Расходы");
        labelExpensesName = new JLabel("Название источника расходов");
        textFieldExpensesName = new JTextField("введите название источника расходов");
        labelExpensesPrice = new JLabel("Стоимость источника расходов");
        textFieldExpensesPrice = new JTextField("введите стоимость источника расходов");

        add(expensesRadioButton, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelExpensesName, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldExpensesName, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelExpensesPrice, new GridBagConstraints(0, 5, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldExpensesPrice, new GridBagConstraints(1, 5, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        textFieldExpensesName.setEditable(false);
        textFieldExpensesPrice.setEditable(false);

        expensesRadioButton.addActionListener(e  -> {
            if(expensesRadioButton.isSelected()) {
                textFieldExpensesName.setEditable(true);
                textFieldExpensesPrice.setEditable(true);
            }else {
                textFieldExpensesName.setEditable(false);
                textFieldExpensesPrice.setEditable(false);
            }
        });

        /**
         * Активация и добавление элемента поля "Активы" по нажатию на кнопку событие
         */

        assetsRadioButton = new JRadioButton("Активы");
        labelAssetsName = new JLabel("Название актива");
        textFieldAssetsName = new JTextField("введите название актива");
        labelAssetsVolume = new JLabel("Количество актива");
        textFieldAssetsVolume = new JTextField("введите количество актива");
        labelAssetsPrice = new JLabel("Стоимость актива");
        textFieldAssetsPrice = new JTextField("введите стоимость актива");

        add(assetsRadioButton, new GridBagConstraints(0, 6, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelAssetsName, new GridBagConstraints(0, 7, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldAssetsName, new GridBagConstraints(1, 7, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelAssetsVolume, new GridBagConstraints(0, 8, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldAssetsVolume, new GridBagConstraints(1, 8, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelAssetsPrice, new GridBagConstraints(0, 9, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldAssetsPrice, new GridBagConstraints(1, 9, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        textFieldAssetsName.setEditable(false);
        textFieldAssetsVolume.setEditable(false);
        textFieldAssetsPrice.setEditable(false);

        assetsRadioButton.addActionListener(e  -> {
            if(assetsRadioButton.isSelected()) {
                textFieldAssetsName.setEditable(true);
                textFieldAssetsVolume.setEditable(true);
                textFieldAssetsPrice.setEditable(true);
            }else {
                textFieldAssetsName.setEditable(false);
                textFieldAssetsVolume.setEditable(false);
                textFieldAssetsPrice.setEditable(false);
            }
        });

        /**
         * Активация и добавление элемента поля "Пассивы" по нажатию на кнопку событие
         */

        liabilitiesRadioButton = new JRadioButton("Пассивы");
        labelLiabilitiesName = new JLabel("Название пассива");
        textFieldLiabilitiesName = new JTextField("введите название пассива");
        labelLiabilitiesPrice = new JLabel("Стоимость пассива");
        textFieldLiabilitiesPrice = new JTextField("введите стоимость пассива");

        add(liabilitiesRadioButton, new GridBagConstraints(0, 10, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelLiabilitiesName, new GridBagConstraints(0, 11, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldLiabilitiesName, new GridBagConstraints(1, 11, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(labelLiabilitiesPrice, new GridBagConstraints(0, 12, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(textFieldLiabilitiesPrice, new GridBagConstraints(1, 12, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        textFieldLiabilitiesName.setEditable(false);
        textFieldLiabilitiesPrice.setEditable(false);

        liabilitiesRadioButton.addActionListener(e  -> {
            if(liabilitiesRadioButton.isSelected()) {
                textFieldLiabilitiesName.setEditable(true);
                textFieldLiabilitiesPrice.setEditable(true);
            }else {
                textFieldLiabilitiesName.setEditable(false);
                textFieldLiabilitiesPrice.setEditable(false);
            }
        });

        createButton = new JButton("Добавить");
        updateButton = new JButton("Обновить");
        deleteButton = new JButton("Удалить");
        add(createButton, new GridBagConstraints(0, 13, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        add(updateButton, new GridBagConstraints(1, 13, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        add(deleteButton, new GridBagConstraints(2, 13, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        /** Если так обрабатывать событие то необходимо наследоваться от MainFrame, но тогда
         * в этом окошке появляются таблички и кнопка создать, а как подругому засунуть объект в таблицу я не могу понять
        createButton.addActionListener(e -> {
            if(incomeRadioButton.isSelected()){
                incomeTableModel.addIncomeData(new Income(textFieldIncomeName.getText(),
                        Integer.parseInt(textFieldIncomePrice.getText())));
            }else if(expensesRadioButton.isSelected()){
                    expensesTableModel.addExpensesDate(new Expenses(textFieldExpensesName.getText(),
                            Integer.parseInt(textFieldExpensesPrice.getText())));
            }else if(assetsRadioButton.isSelected()){
                assetsTableModel.addAssetsDate(new Assets(textFieldAssetsName.getText(),
                        Integer.parseInt(textFieldAssetsPrice.getText()),
                                Integer.parseInt(textFieldAssetsVolume.getText())));
            }else if(liabilitiesRadioButton.isSelected()) {
                liabilitiesTableModel.addLiabilitiesDate(new Liabilities(textFieldLiabilitiesName.getText(),
                        Integer.parseInt(textFieldLiabilitiesPrice.getText())));
            }else
                return;

        });*/

        setVisible(true);
    }
}

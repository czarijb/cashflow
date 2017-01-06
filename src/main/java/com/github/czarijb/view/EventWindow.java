package com.github.czarijb.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by aleksandr on 06.01.17.
 */
public class EventWindow extends JFrame {

    public EventWindow(){
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        /**
         * Активация и добавление элемента поля "Доходы" по нажатию на кнопку событие
         */

        JRadioButton incomeRadioButton = new JRadioButton("Доходы");
        JLabel labelIncomeName = new JLabel("Название источника дохода");
        JTextField textFieldIncomeName = new JTextField("введите название источника дохода");
        JLabel labelIncomePrice = new JLabel("Стоимость источника дохода");
        JTextField textFieldIncomePrice = new JTextField("введите стоимость источника дохода");

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

        /**
         * Активация и добавление элемента поля "Расходы" по нажатию на кнопку событие
         */

        JRadioButton expensesRadioButton = new JRadioButton("Расходы");
        JLabel labelExpensesName = new JLabel("Название источника расходов");
        JTextField textFieldExpensesName = new JTextField("введите название источника расходов");
        JLabel labelExpensesPrice = new JLabel("Стоимость источника расходов");
        JTextField textFieldExpensesPrice = new JTextField("введите стоимость источника расходов");

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

        /**
         * Активация и добавление элемента поля "Активы" по нажатию на кнопку событие
         */

        JRadioButton assetsRadioButton = new JRadioButton("Активы");
        JLabel labelAssetsName = new JLabel("Название актива");
        JTextField textFieldAssetsName = new JTextField("введите название актива");
        JLabel labelAssetsVolume = new JLabel("Количество актива");
        JTextField textFieldAssetsVolume = new JTextField("введите количество актива");
        JLabel labelAssetsPrice = new JLabel("Стоимость актива");
        JTextField textFieldAssetsPrice = new JTextField("введите стоимость актива");

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

        /**
         * Активация и добавление элемента поля "Пассивы" по нажатию на кнопку событие
         */

        JRadioButton liabilitiesRadioButton = new JRadioButton("Пассивы");
        JLabel labelLiabilitiesName = new JLabel("Название пассива");
        JTextField textFieldLiabilitiesName = new JTextField("введите название пассива");
        JLabel labelLiabilitiesPrice = new JLabel("Стоимость пассива");
        JTextField textFieldLiabilitiesPrice = new JTextField("введите стоимость пассива");

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

        setVisible(true);
    }
}

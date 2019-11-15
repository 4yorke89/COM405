/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author 4yorke89
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {

    private JLabel lblCarReg;
    private JLabel lblCarColour;
    private JLabel lblCarMake;
    private JLabel lblCarModel;
    private JTextField txtCarReg;
    private JTextField txtCarColour;
    private JTextField txtCarMake;
    private JTextField txtCarModel;
    private JLabel lblStatus;
    private JButton btnAdd;
    private JButton btnRemove;
    private GridBagConstraints constraints;

    public Gui() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        initComponents();
        layoutComponents();
        constraints = new GridBagConstraints();

    }

    public void initComponents() {
        lblCarReg = new JLabel("Car Registration:");
        lblCarColour = new JLabel("Car Colour:");
        lblCarMake = new JLabel("Car Make:");
        lblCarModel = new JLabel("Car Model");
        txtCarReg = new JTextField();
        txtCarColour = new JTextField();
        txtCarMake = new JTextField();
        txtCarModel = new JTextField();
        lblStatus = new JLabel("Car Park has 15 Empty Spaces");
        btnAdd = new JButton("Add Car");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove Car");
    }

    public void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblCarReg, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 0; // New row
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        this.add(txtCarReg, constraints);
        constraints.gridy = 1; // New row
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblCarColour, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 1; // New row
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        this.add(txtCarColour, constraints);
        constraints.gridy = 2; // New row
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblCarMake, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2; // New row
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        this.add(txtCarMake, constraints);
        constraints.gridy = 3; // New row
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblCarModel, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3; // New row
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        this.add(txtCarModel, constraints);
        constraints.gridx = 4;
// Makes the textbox fill the width of the column
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(lblStatus, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 5;
        constraints.gridx = 0;
        this.add(btnAdd, constraints);
        constraints.gridy = 5;
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(btnAdd)) {
            String id = txtCarReg.getText();
            String name = txtCarColour.getText();

            if (CarPark.addCar(new Car(reg, colour, make, model))) {
                JOptionPane.showMessageDialog(null, "Car has been added");
            } else {
                JOptionPane.showMessageDialog(null, "The car park is full");
            }
        } else if (ev.getSource().equals(btnRemove)) {

        }
    }
}

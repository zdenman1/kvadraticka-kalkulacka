package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        JFrame okno = new JFrame();


        JLabel popis = new JLabel("Zde prosím zadejte kvadratickou rovnici ve formátu ax²+bx+c=0. Nezapomeňte zadat znaménka! ");
        popis.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel();

        JTextField prvni= new JTextField();
        JTextField druhe= new JTextField();
        JTextField treti = new JTextField();
        prvni.setPreferredSize(new Dimension(40,20));
        druhe.setPreferredSize(new Dimension(45,20));
        treti.setPreferredSize(new Dimension(45,20));
        JLabel nula = new JLabel("= 0");
        JLabel b = new JLabel("x");

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        prvni.setBorder(border);
        druhe.setBorder(border);
        JLabel xnadruhou = new JLabel("x²");

        panel.setLayout(new FlowLayout());
        panel.add(prvni);
        panel.add(xnadruhou);
        panel.add(druhe);
        panel.add(b);
        panel.add(treti);
        panel.add(nula);










        JPanel v1 = new JPanel();
        JLabel v1vysledek= new JLabel();
        v1.add(v1vysledek);

        JPanel v2 = new JPanel();
        JLabel v2vysledek = new JLabel();
        v2.add(v2vysledek);


        JButton vypocitej = new JButton("Vypočítej");

        vypocitej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hodnota1 = prvni.getText();
                double a = Double.parseDouble(hodnota1);
                String hodnota2 = druhe.getText();
                double b = Double.parseDouble(hodnota2);
                String hodnota3 = treti.getText();
                double c = Double.parseDouble(hodnota3);
                double diskriminant = b * b - 4 * a * c;

                if (diskriminant < 0) {

                    v1vysledek.setText("Rovnice není v realných číslech!" );



                } else {
                    double v3 = (-b + Math.sqrt(diskriminant) )/ (2 * a);

                    double v4 = (-b - Math.sqrt(diskriminant) )/ (2 * a);

                    v1vysledek.setText("Výsledek je " + v3);
                    v2vysledek.setText("Výsledek je " + v4);
                }

            }


        });











        okno.setLayout(new GridLayout(5,1));
        okno.add(popis);
        okno.add(panel);
        okno.add(vypocitej);
        okno.add(v1);
        okno.add(v2);



        okno.setTitle("First GUI");
        okno.setSize(620,250);
        okno.setVisible(true);
        okno.setResizable(true);  //klidne mohu zmenit je to fuk










    }
}
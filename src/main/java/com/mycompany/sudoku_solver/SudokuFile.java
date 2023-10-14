/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudoku_solver;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import static java.awt.Color.green;
import static java.awt.Color.orange;
import static java.awt.Color.pink;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.lang.Math.tan;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TA20384333
 */
public class SudokuFile extends javax.swing.JFrame {

    /**
     * Creates new form SudokuFile
     */
    
    public String turn = "1";
    
    public boolean flag = true;
    
    private String[][] board = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"},
        
    };
    
    private void assign(JButton bn){
        
        SET1.setBackground(black);
        SET2.setBackground(black);
        SET3.setBackground(black);
        SET4.setBackground(black);
        SET5.setBackground(black);
        SET6.setBackground(black);
        SET7.setBackground(black);
        SET8.setBackground(black);
        SET9.setBackground(black);
        bn.setBackground(gray);
       
        
    }
    
    private void resetGame() {
    
        JButton[] predefinedButtons = {
        R2C1, R3C1, R3C3, R1C4, R2C5, R2C6, R3C5, R1C7, R1C8, R1C9, R2C7, R2C9, R3C8, R5C2, R5C3, R6C2, R4C5, R6C4,
        R4C8, R5C8, R5C7, R7C2, R8C1, R9C1, R9C2, R9C3, R7C5, R8C5, R9C6, R8C4, R7C7, R7C9, R8C9
    };

    JButton[][] btns = {
        {R1C1, R1C2, R1C3, R1C4, R1C5, R1C6, R1C7, R1C8, R1C9},
        {R2C1, R2C2, R2C3, R2C4, R2C5, R2C6, R2C7, R2C8, R2C9},
        {R3C1, R3C2, R3C3, R3C4, R3C5, R3C6, R3C7, R3C8, R3C9},
        {R4C1, R4C2, R4C3, R4C4, R4C5, R4C6, R4C7, R4C8, R4C9},
        {R5C1, R5C2, R5C3, R5C4, R5C5, R5C6, R5C7, R5C8, R5C9},
        {R6C1, R6C2, R6C3, R6C4, R6C5, R6C6, R6C7, R6C8, R6C9},
        {R7C1, R7C2, R7C3, R7C4, R7C5, R7C6, R7C7, R7C8, R7C9},
        {R8C1, R8C2, R8C3, R8C4, R8C5, R8C6, R8C7, R8C8, R8C9},
        {R9C1, R9C2, R9C3, R9C4, R9C5, R9C6, R9C7, R9C8, R9C9}
    };

   for(int i=0;i<9;i++){
       for(int j=0;j<9;j++){
           boolean local = true;
           for(int k=0;k<predefinedButtons.length;k++){
               if(btns[i][j] == predefinedButtons[k]){
                   local = false;
               }
           }
           if(local == true){
               btns[i][j].setText("0");
               btns[i][j].setBackground(white);
           }
       }
   }
}
    
    public void solution(){
        
                JButton[] predefinedButtons = {
        R2C1, R3C1, R3C3, R1C4, R2C5, R2C6, R3C5, R1C7, R1C8, R1C9, R2C7, R2C9, R3C8, R5C2, R5C3, R6C2, R4C5,  R6C4,
        R4C8, R5C8, R5C7, R7C2, R8C1, R9C1, R9C2, R9C3, R7C5, R8C5, R9C6, R8C4, R7C7, R7C9, R8C9
    };

    JButton[][] btns = {
        {R1C1, R1C2, R1C3, R1C4, R1C5, R1C6, R1C7, R1C8, R1C9},
        {R2C1, R2C2, R2C3, R2C4, R2C5, R2C6, R2C7, R2C8, R2C9},
        {R3C1, R3C2, R3C3, R3C4, R3C5, R3C6, R3C7, R3C8, R3C9},
        {R4C1, R4C2, R4C3, R4C4, R4C5, R4C6, R4C7, R4C8, R4C9},
        {R5C1, R5C2, R5C3, R5C4, R5C5, R5C6, R5C7, R5C8, R5C9},
        {R6C1, R6C2, R6C3, R6C4, R6C5, R6C6, R6C7, R6C8, R6C9},
        {R7C1, R7C2, R7C3, R7C4, R7C5, R7C6, R7C7, R7C8, R7C9},
        {R8C1, R8C2, R8C3, R8C4, R8C5, R8C6, R8C7, R8C8, R8C9},
        {R9C1, R9C2, R9C3, R9C4, R9C5, R9C6, R9C7, R9C8, R9C9}
    };
    
    if(flag == true){
        
        flag = false;
        SOLUTION.setText("HIDE SOLUTION");
        
        for(int i=0;i<9;i++){
       for(int j=0;j<9;j++){
           boolean local = true;
           for(int k=0;k<predefinedButtons.length;k++){
               if(btns[i][j] == predefinedButtons[k]){
                   local = false;
               }
           }
           if(local == true)
               btns[i][j].setText(board[i][j]);
       }
   }
        
        
        
    }
    else{
        flag = true;
        SOLUTION.setText("SHOW SOLUTION");
        resetGame();
    }
        
    }
    
     public void showw(){
        
           JButton[][] btns = {
        {R1C1, R1C2, R1C3, R1C4, R1C5, R1C6, R1C7, R1C8, R1C9},
        {R2C1, R2C2, R2C3, R2C4, R2C5, R2C6, R2C7, R2C8, R2C9},
        {R3C1, R3C2, R3C3, R3C4, R3C5, R3C6, R3C7, R3C8, R3C9},
        {R4C1, R4C2, R4C3, R4C4, R4C5, R4C6, R4C7, R4C8, R4C9},
        {R5C1, R5C2, R5C3, R5C4, R5C5, R5C6, R5C7, R5C8, R5C9},
        {R6C1, R6C2, R6C3, R6C4, R6C5, R6C6, R6C7, R6C8, R6C9},
        {R7C1, R7C2, R7C3, R7C4, R7C5, R7C6, R7C7, R7C8, R7C9},
        {R8C1, R8C2, R8C3, R8C4, R8C5, R8C6, R8C7, R8C8, R8C9},
        {R9C1, R9C2, R9C3, R9C4, R9C5, R9C6, R9C7, R9C8, R9C9}
    };
           
           Color brown = new Color(157, 79, 66);
           Color green = new Color(125, 164, 120);
           for(int i=0;i<9;i++){
               for(int j=0;j<9;j++){
                   if(btns[i][j].getText()!=board[i][j] && btns[i][j].getText()!= " "){
                       btns[i][j].setBackground(brown);
                   }
                  
                   
               }
           }
        
    }
  
   
    
    public SudokuFile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        R3C5 = new javax.swing.JButton();
        R1C6 = new javax.swing.JButton();
        R3C6 = new javax.swing.JButton();
        R2C5 = new javax.swing.JButton();
        R3C4 = new javax.swing.JButton();
        R1C4 = new javax.swing.JButton();
        R1C5 = new javax.swing.JButton();
        R2C4 = new javax.swing.JButton();
        R2C6 = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        SOLUTION = new javax.swing.JButton();
        CHECK = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        R3C2 = new javax.swing.JButton();
        R1C3 = new javax.swing.JButton();
        R3C3 = new javax.swing.JButton();
        R2C2 = new javax.swing.JButton();
        R3C1 = new javax.swing.JButton();
        R1C1 = new javax.swing.JButton();
        R1C2 = new javax.swing.JButton();
        R2C1 = new javax.swing.JButton();
        R2C3 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        R3C8 = new javax.swing.JButton();
        R1C9 = new javax.swing.JButton();
        R3C9 = new javax.swing.JButton();
        R2C8 = new javax.swing.JButton();
        R3C7 = new javax.swing.JButton();
        R1C7 = new javax.swing.JButton();
        R1C8 = new javax.swing.JButton();
        R2C7 = new javax.swing.JButton();
        R2C9 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        R6C2 = new javax.swing.JButton();
        R4C3 = new javax.swing.JButton();
        R6C3 = new javax.swing.JButton();
        R5C2 = new javax.swing.JButton();
        R6C1 = new javax.swing.JButton();
        R4C1 = new javax.swing.JButton();
        R4C2 = new javax.swing.JButton();
        R5C1 = new javax.swing.JButton();
        R5C3 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        R6C5 = new javax.swing.JButton();
        R4C6 = new javax.swing.JButton();
        R6C6 = new javax.swing.JButton();
        R5C5 = new javax.swing.JButton();
        R6C4 = new javax.swing.JButton();
        R4C4 = new javax.swing.JButton();
        R4C5 = new javax.swing.JButton();
        R5C4 = new javax.swing.JButton();
        R5C6 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        R6C8 = new javax.swing.JButton();
        R4C9 = new javax.swing.JButton();
        R6C9 = new javax.swing.JButton();
        R5C8 = new javax.swing.JButton();
        R6C7 = new javax.swing.JButton();
        R4C7 = new javax.swing.JButton();
        R4C8 = new javax.swing.JButton();
        R5C7 = new javax.swing.JButton();
        R5C9 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        R9C2 = new javax.swing.JButton();
        R7C3 = new javax.swing.JButton();
        R9C3 = new javax.swing.JButton();
        R8C2 = new javax.swing.JButton();
        R9C1 = new javax.swing.JButton();
        R7C1 = new javax.swing.JButton();
        R7C2 = new javax.swing.JButton();
        R8C1 = new javax.swing.JButton();
        R8C3 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        R9C8 = new javax.swing.JButton();
        R7C9 = new javax.swing.JButton();
        R9C9 = new javax.swing.JButton();
        R8C8 = new javax.swing.JButton();
        R9C7 = new javax.swing.JButton();
        R7C7 = new javax.swing.JButton();
        R7C8 = new javax.swing.JButton();
        R8C7 = new javax.swing.JButton();
        R8C9 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        R9C5 = new javax.swing.JButton();
        R7C6 = new javax.swing.JButton();
        R9C6 = new javax.swing.JButton();
        R8C5 = new javax.swing.JButton();
        R9C4 = new javax.swing.JButton();
        R7C4 = new javax.swing.JButton();
        R7C5 = new javax.swing.JButton();
        R8C4 = new javax.swing.JButton();
        R8C6 = new javax.swing.JButton();
        SET1 = new javax.swing.JButton();
        SET2 = new javax.swing.JButton();
        SET3 = new javax.swing.JButton();
        SET4 = new javax.swing.JButton();
        SET5 = new javax.swing.JButton();
        SET6 = new javax.swing.JButton();
        SET7 = new javax.swing.JButton();
        SET8 = new javax.swing.JButton();
        SET9 = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton5.setText("jButton2");

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton48.setText("jButton2");

        jButton49.setText("jButton2");

        jButton50.setText("jButton2");

        jButton51.setText("jButton2");

        jButton52.setText("jButton2");

        jButton53.setText("jButton2");

        jButton54.setText("jButton2");

        jButton55.setText("jButton2");

        jButton56.setText("jButton2");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton49)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R3C5.setBackground(new java.awt.Color(51, 51, 51));
        R3C5.setForeground(new java.awt.Color(255, 255, 255));
        R3C5.setText("4");
        R3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C5ActionPerformed(evt);
            }
        });

        R1C6.setText("0");
        R1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C6ActionPerformed(evt);
            }
        });

        R3C6.setText("0");
        R3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C6ActionPerformed(evt);
            }
        });

        R2C5.setBackground(new java.awt.Color(51, 51, 51));
        R2C5.setForeground(new java.awt.Color(255, 255, 255));
        R2C5.setText("7");
        R2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C5ActionPerformed(evt);
            }
        });

        R3C4.setText("0");
        R3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C4ActionPerformed(evt);
            }
        });

        R1C4.setBackground(new java.awt.Color(51, 51, 51));
        R1C4.setForeground(new java.awt.Color(255, 255, 255));
        R1C4.setText("5");
        R1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C4ActionPerformed(evt);
            }
        });

        R1C5.setText("0");
        R1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C5ActionPerformed(evt);
            }
        });

        R2C4.setText("0");
        R2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C4ActionPerformed(evt);
            }
        });

        R2C6.setBackground(new java.awt.Color(51, 51, 51));
        R2C6.setForeground(new java.awt.Color(255, 255, 255));
        R2C6.setText("8");
        R2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R3C4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R1C4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2C4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R3C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R1C5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R2C5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R1C6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R3C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R2C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R3C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        RESET.setBackground(new java.awt.Color(0, 0, 0));
        RESET.setForeground(new java.awt.Color(255, 255, 255));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(0, 0, 0));
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        SOLUTION.setBackground(new java.awt.Color(0, 0, 0));
        SOLUTION.setForeground(new java.awt.Color(255, 255, 255));
        SOLUTION.setText("SHOW SOLUTION");
        SOLUTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOLUTIONActionPerformed(evt);
            }
        });

        CHECK.setBackground(new java.awt.Color(0, 0, 0));
        CHECK.setForeground(new java.awt.Color(255, 255, 255));
        CHECK.setText("CHECK MOVES");
        CHECK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKActionPerformed(evt);
            }
        });

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R3C2.setText("0");
        R3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C2ActionPerformed(evt);
            }
        });

        R1C3.setText("0");
        R1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C3ActionPerformed(evt);
            }
        });

        R3C3.setBackground(new java.awt.Color(51, 51, 51));
        R3C3.setForeground(new java.awt.Color(255, 255, 255));
        R3C3.setText("6");
        R3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C3ActionPerformed(evt);
            }
        });

        R2C2.setText("0");
        R2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C2ActionPerformed(evt);
            }
        });

        R3C1.setBackground(new java.awt.Color(51, 51, 51));
        R3C1.setForeground(new java.awt.Color(255, 255, 255));
        R3C1.setText("7");
        R3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C1ActionPerformed(evt);
            }
        });

        R1C1.setText("0");
        R1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C1ActionPerformed(evt);
            }
        });

        R1C2.setText("0");
        R1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C2ActionPerformed(evt);
            }
        });

        R2C1.setBackground(new java.awt.Color(51, 51, 51));
        R2C1.setForeground(new java.awt.Color(255, 255, 255));
        R2C1.setText("4");
        R2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C1ActionPerformed(evt);
            }
        });

        R2C3.setText("0");
        R2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R3C1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R1C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R3C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R1C2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R2C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R1C3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R3C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R2C3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(R3C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R3C8.setBackground(new java.awt.Color(51, 51, 51));
        R3C8.setForeground(new java.awt.Color(255, 255, 255));
        R3C8.setText("2");
        R3C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C8ActionPerformed(evt);
            }
        });

        R1C9.setBackground(new java.awt.Color(51, 51, 51));
        R1C9.setForeground(new java.awt.Color(255, 255, 255));
        R1C9.setText("4");
        R1C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C9ActionPerformed(evt);
            }
        });

        R3C9.setText("0");
        R3C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C9ActionPerformed(evt);
            }
        });

        R2C8.setText("0");
        R2C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C8ActionPerformed(evt);
            }
        });

        R3C7.setText("0");
        R3C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C7ActionPerformed(evt);
            }
        });

        R1C7.setBackground(new java.awt.Color(51, 51, 51));
        R1C7.setForeground(new java.awt.Color(255, 255, 255));
        R1C7.setText("7");
        R1C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C7ActionPerformed(evt);
            }
        });

        R1C8.setBackground(new java.awt.Color(51, 51, 51));
        R1C8.setForeground(new java.awt.Color(255, 255, 255));
        R1C8.setText("3");
        R1C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C8ActionPerformed(evt);
            }
        });

        R2C7.setBackground(new java.awt.Color(51, 51, 51));
        R2C7.setForeground(new java.awt.Color(255, 255, 255));
        R2C7.setText("5");
        R2C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C7ActionPerformed(evt);
            }
        });

        R2C9.setBackground(new java.awt.Color(51, 51, 51));
        R2C9.setForeground(new java.awt.Color(255, 255, 255));
        R2C9.setText("9");
        R2C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R3C7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R1C7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2C7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R3C8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R1C8, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R2C8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R1C9, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R3C9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2C9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R2C9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(R3C8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R6C2.setBackground(new java.awt.Color(51, 51, 51));
        R6C2.setForeground(new java.awt.Color(255, 255, 255));
        R6C2.setText("6");
        R6C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C2ActionPerformed(evt);
            }
        });

        R4C3.setText("0");
        R4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C3ActionPerformed(evt);
            }
        });

        R6C3.setText("0");
        R6C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C3ActionPerformed(evt);
            }
        });

        R5C2.setBackground(new java.awt.Color(51, 51, 51));
        R5C2.setForeground(new java.awt.Color(255, 255, 255));
        R5C2.setText("3");
        R5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C2ActionPerformed(evt);
            }
        });

        R6C1.setText("0");
        R6C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C1ActionPerformed(evt);
            }
        });

        R4C1.setText("0");
        R4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C1ActionPerformed(evt);
            }
        });

        R4C2.setText("0");
        R4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C2ActionPerformed(evt);
            }
        });

        R5C1.setText("0");
        R5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C1ActionPerformed(evt);
            }
        });

        R5C3.setBackground(new java.awt.Color(51, 51, 51));
        R5C3.setForeground(new java.awt.Color(255, 255, 255));
        R5C3.setText("4");
        R5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R4C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R5C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R4C2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R5C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R4C3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R6C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R5C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R5C3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R6C5.setText("0");
        R6C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C5ActionPerformed(evt);
            }
        });

        R4C6.setText("0");
        R4C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C6ActionPerformed(evt);
            }
        });

        R6C6.setText("0");
        R6C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C6ActionPerformed(evt);
            }
        });

        R5C5.setText("0");
        R5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C5ActionPerformed(evt);
            }
        });

        R6C4.setBackground(new java.awt.Color(51, 51, 51));
        R6C4.setForeground(new java.awt.Color(255, 255, 255));
        R6C4.setText("1");
        R6C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C4ActionPerformed(evt);
            }
        });

        R4C4.setText("0");
        R4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C4ActionPerformed(evt);
            }
        });

        R4C5.setBackground(new java.awt.Color(51, 51, 51));
        R4C5.setForeground(new java.awt.Color(255, 255, 255));
        R4C5.setText("3");
        R4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C5ActionPerformed(evt);
            }
        });

        R5C4.setText("0");
        R5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C4ActionPerformed(evt);
            }
        });

        R5C6.setText("0");
        R5C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R4C4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R5C4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R4C5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R5C5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R4C6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R6C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R5C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R5C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R6C8.setText("0");
        R6C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C8ActionPerformed(evt);
            }
        });

        R4C9.setText("0");
        R4C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C9ActionPerformed(evt);
            }
        });

        R6C9.setText("0");
        R6C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C9ActionPerformed(evt);
            }
        });

        R5C8.setBackground(new java.awt.Color(51, 51, 51));
        R5C8.setForeground(new java.awt.Color(255, 255, 255));
        R5C8.setText("8");
        R5C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C8ActionPerformed(evt);
            }
        });

        R6C7.setText("0");
        R6C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C7ActionPerformed(evt);
            }
        });

        R4C7.setText("0");
        R4C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C7ActionPerformed(evt);
            }
        });

        R4C8.setBackground(new java.awt.Color(51, 51, 51));
        R4C8.setForeground(new java.awt.Color(255, 255, 255));
        R4C8.setText("9");
        R4C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C8ActionPerformed(evt);
            }
        });

        R5C7.setBackground(new java.awt.Color(51, 51, 51));
        R5C7.setForeground(new java.awt.Color(255, 255, 255));
        R5C7.setText("2");
        R5C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C7ActionPerformed(evt);
            }
        });

        R5C9.setText("0");
        R5C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R4C7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R5C7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R4C8, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R5C8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R4C9, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R6C9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R5C9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R5C9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R6C7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R9C2.setBackground(new java.awt.Color(51, 51, 51));
        R9C2.setForeground(new java.awt.Color(255, 255, 255));
        R9C2.setText("8");
        R9C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C2ActionPerformed(evt);
            }
        });

        R7C3.setText("0");
        R7C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C3ActionPerformed(evt);
            }
        });

        R9C3.setBackground(new java.awt.Color(51, 51, 51));
        R9C3.setForeground(new java.awt.Color(255, 255, 255));
        R9C3.setText("9");
        R9C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C3ActionPerformed(evt);
            }
        });

        R8C2.setText("0");
        R8C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C2ActionPerformed(evt);
            }
        });

        R9C1.setBackground(new java.awt.Color(51, 51, 51));
        R9C1.setForeground(new java.awt.Color(255, 255, 255));
        R9C1.setText("6");
        R9C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C1ActionPerformed(evt);
            }
        });

        R7C1.setText("0");
        R7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C1ActionPerformed(evt);
            }
        });

        R7C2.setBackground(new java.awt.Color(51, 51, 51));
        R7C2.setForeground(new java.awt.Color(255, 255, 255));
        R7C2.setText("4");
        R7C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C2ActionPerformed(evt);
            }
        });

        R8C1.setBackground(new java.awt.Color(51, 51, 51));
        R8C1.setForeground(new java.awt.Color(255, 255, 255));
        R8C1.setText("3");
        R8C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C1ActionPerformed(evt);
            }
        });

        R8C3.setText("0");
        R8C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R7C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R7C2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R8C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R7C3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R9C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R8C3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(R9C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R9C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R9C8.setText("0");
        R9C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C8ActionPerformed(evt);
            }
        });

        R7C9.setBackground(new java.awt.Color(51, 51, 51));
        R7C9.setForeground(new java.awt.Color(255, 255, 255));
        R7C9.setText("6");
        R7C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C9ActionPerformed(evt);
            }
        });

        R9C9.setText("0");
        R9C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C9ActionPerformed(evt);
            }
        });

        R8C8.setText("0");
        R8C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C8ActionPerformed(evt);
            }
        });

        R9C7.setText("0");
        R9C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C7ActionPerformed(evt);
            }
        });

        R7C7.setBackground(new java.awt.Color(51, 51, 51));
        R7C7.setForeground(new java.awt.Color(255, 255, 255));
        R7C7.setText("9");
        R7C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C7ActionPerformed(evt);
            }
        });

        R7C8.setText("0");
        R7C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C8ActionPerformed(evt);
            }
        });

        R8C7.setText("0");
        R8C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C7ActionPerformed(evt);
            }
        });

        R8C9.setBackground(new java.awt.Color(51, 51, 51));
        R8C9.setForeground(new java.awt.Color(255, 255, 255));
        R8C9.setText("2");
        R8C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R7C7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8C7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R7C8, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R8C8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R7C9, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R9C9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8C9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R8C9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R9C5.setText("0");
        R9C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C5ActionPerformed(evt);
            }
        });

        R7C6.setText("0");
        R7C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C6ActionPerformed(evt);
            }
        });

        R9C6.setBackground(new java.awt.Color(51, 51, 51));
        R9C6.setForeground(new java.awt.Color(255, 255, 255));
        R9C6.setText("1");
        R9C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C6ActionPerformed(evt);
            }
        });

        R8C5.setBackground(new java.awt.Color(51, 51, 51));
        R8C5.setForeground(new java.awt.Color(255, 255, 255));
        R8C5.setText("6");
        R8C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C5ActionPerformed(evt);
            }
        });

        R9C4.setText("0");
        R9C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C4ActionPerformed(evt);
            }
        });

        R7C4.setText("0");
        R7C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C4ActionPerformed(evt);
            }
        });

        R7C5.setBackground(new java.awt.Color(51, 51, 51));
        R7C5.setForeground(new java.awt.Color(255, 255, 255));
        R7C5.setText("5");
        R7C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C5ActionPerformed(evt);
            }
        });

        R8C4.setBackground(new java.awt.Color(51, 51, 51));
        R8C4.setForeground(new java.awt.Color(255, 255, 255));
        R8C4.setText("9");
        R8C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C4ActionPerformed(evt);
            }
        });

        R8C6.setText("0");
        R8C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R7C4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8C4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R7C5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(R8C5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R7C6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(R9C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R8C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R8C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R9C4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SET1.setBackground(new java.awt.Color(0, 0, 0));
        SET1.setForeground(new java.awt.Color(255, 255, 255));
        SET1.setText("1");
        SET1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET1ActionPerformed(evt);
            }
        });

        SET2.setBackground(new java.awt.Color(0, 0, 0));
        SET2.setForeground(new java.awt.Color(255, 255, 255));
        SET2.setText("2");
        SET2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET2ActionPerformed(evt);
            }
        });

        SET3.setBackground(new java.awt.Color(0, 0, 0));
        SET3.setForeground(new java.awt.Color(255, 255, 255));
        SET3.setText("3");
        SET3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET3ActionPerformed(evt);
            }
        });

        SET4.setBackground(new java.awt.Color(0, 0, 0));
        SET4.setForeground(new java.awt.Color(255, 255, 255));
        SET4.setText("4");
        SET4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET4ActionPerformed(evt);
            }
        });

        SET5.setBackground(new java.awt.Color(0, 0, 0));
        SET5.setForeground(new java.awt.Color(255, 255, 255));
        SET5.setText("5");
        SET5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET5ActionPerformed(evt);
            }
        });

        SET6.setBackground(new java.awt.Color(0, 0, 0));
        SET6.setForeground(new java.awt.Color(255, 255, 255));
        SET6.setText("6");
        SET6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET6ActionPerformed(evt);
            }
        });

        SET7.setBackground(new java.awt.Color(0, 0, 0));
        SET7.setForeground(new java.awt.Color(255, 255, 255));
        SET7.setText("7");
        SET7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET7ActionPerformed(evt);
            }
        });

        SET8.setBackground(new java.awt.Color(0, 0, 0));
        SET8.setForeground(new java.awt.Color(255, 255, 255));
        SET8.setText("8");
        SET8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET8ActionPerformed(evt);
            }
        });

        SET9.setBackground(new java.awt.Color(0, 0, 0));
        SET9.setForeground(new java.awt.Color(255, 255, 255));
        SET9.setText("9");
        SET9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SET9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(123, 123, 123)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SET1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SET2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SET3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SET4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SET5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(SET6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SET7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SET8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SET9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SOLUTION, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SET1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET6, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET8, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SET9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESET)
                    .addComponent(BACK)
                    .addComponent(SOLUTION)
                    .addComponent(CHECK))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R3C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C6ActionPerformed
        // TODO add your handling code here:
        R3C6.setText(turn);
        R3C6.setBackground(white);
    }//GEN-LAST:event_R3C6ActionPerformed

    private void R3C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C9ActionPerformed
        // TODO add your handling code here:
        R3C9.setText(turn);
        R3C9.setBackground(white);
    }//GEN-LAST:event_R3C9ActionPerformed

    private void R3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C3ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C3ActionPerformed

    private void R6C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C3ActionPerformed
        // TODO add your handling code here:
        R6C3.setText(turn);
        R6C3.setBackground(white);
    }//GEN-LAST:event_R6C3ActionPerformed

    private void R6C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C6ActionPerformed
        // TODO add your handling code here:
        R6C6.setText(turn);
        R6C6.setBackground(white);
    }//GEN-LAST:event_R6C6ActionPerformed

    private void R6C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C9ActionPerformed
        // TODO add your handling code here:
        R6C9.setText(turn);
        R6C9.setBackground(white);
    }//GEN-LAST:event_R6C9ActionPerformed

    private void R9C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C3ActionPerformed
        // TODO add your handling code here:
        R9C3.setText(turn);
        R9C3.setBackground(white);
    }//GEN-LAST:event_R9C3ActionPerformed

    private void R9C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C9ActionPerformed
        // TODO add your handling code here:
        R9C9.setText(turn);
        R9C9.setBackground(white);
    }//GEN-LAST:event_R9C9ActionPerformed

    private void R9C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C6ActionPerformed

    private void R1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C1ActionPerformed
        // TODO add your handling code here:
        R1C1.setText(turn);
        R1C1.setBackground(white);
    }//GEN-LAST:event_R1C1ActionPerformed

    private void R1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C2ActionPerformed
        // TODO add your handling code here:
        R1C2.setText(turn);
        R1C2.setBackground(white);
    }//GEN-LAST:event_R1C2ActionPerformed

    private void R1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C3ActionPerformed
        R1C3.setText(turn);
        R1C3.setBackground(white);        // TODO add your handling code here:
    }//GEN-LAST:event_R1C3ActionPerformed

    private void R1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C4ActionPerformed
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);       // TODO add your handling code here:
    }//GEN-LAST:event_R1C4ActionPerformed

    private void R1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C5ActionPerformed
        R1C5.setText(turn);
        R1C5.setBackground(white);        // TODO add your handling code here:
    }//GEN-LAST:event_R1C5ActionPerformed

    private void R1C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C6ActionPerformed
        // TODO add your handling code here:
        R1C6.setText(turn);
        R1C6.setBackground(white);
    }//GEN-LAST:event_R1C6ActionPerformed

    private void R1C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C7ActionPerformed

    private void R1C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C8ActionPerformed
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);      // TODO add your handling code here:
    }//GEN-LAST:event_R1C8ActionPerformed

    private void R1C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C9ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C9ActionPerformed

    private void SET2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET2ActionPerformed
        // TODO add your handling code here:
        assign(SET2);
        turn = "2";
    }//GEN-LAST:event_SET2ActionPerformed

    private void R2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C1ActionPerformed

       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);      // TODO add your handling code here:
    }//GEN-LAST:event_R2C1ActionPerformed

    private void R2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C2ActionPerformed
        // TODO add your handling code here:
        R2C2.setText(turn);
        R2C2.setBackground(white);
    }//GEN-LAST:event_R2C2ActionPerformed

    private void R2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C3ActionPerformed
R2C3.setText(turn);
        R2C3.setBackground(white);    }//GEN-LAST:event_R2C3ActionPerformed

    private void R2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C4ActionPerformed
        // TODO add your handling code here:
        R2C4.setText(turn);
        R2C4.setBackground(white);
    }//GEN-LAST:event_R2C4ActionPerformed

    private void R2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C5ActionPerformed
JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);       // TODO add your handling code here:
    }//GEN-LAST:event_R2C5ActionPerformed

   
    
    
    private void R2C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C6ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C6ActionPerformed

    private void R2C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C7ActionPerformed

    private void R2C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C8ActionPerformed
 R2C8.setText(turn);
        R2C8.setBackground(white);        // TODO add your handling code here:
    }//GEN-LAST:event_R2C8ActionPerformed

    private void R2C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C9ActionPerformed
        // TODO add your handling code here:
     JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C9ActionPerformed

    private void R3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C1ActionPerformed
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);      // TODO add your handling code here:
    }//GEN-LAST:event_R3C1ActionPerformed

    private void R3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C2ActionPerformed
        // TODO add your handling code here:
        R3C2.setText(turn);
        R3C2.setBackground(white); 
    }//GEN-LAST:event_R3C2ActionPerformed

    private void R3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C4ActionPerformed
        // TODO add your handling code here:
        R3C4.setText(turn);
        R3C4.setBackground(white); 
    }//GEN-LAST:event_R3C4ActionPerformed

    private void R3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C5ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C5ActionPerformed

    private void R3C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C7ActionPerformed
        // TODO add your handling code here:
        R3C7.setText(turn);
        R3C7.setBackground(white); 
    }//GEN-LAST:event_R3C7ActionPerformed

    private void R3C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C8ActionPerformed

    private void R4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C1ActionPerformed
        // TODO add your handling code here:
        R4C1.setText(turn);
        R4C1.setBackground(white); 
    }//GEN-LAST:event_R4C1ActionPerformed

    private void R4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C2ActionPerformed
        // TODO add your handling code here:
        R4C2.setText(turn);
        R4C2.setBackground(white);
    }//GEN-LAST:event_R4C2ActionPerformed

    private void R4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C3ActionPerformed
        R4C3.setText(turn);
        R4C3.setBackground(white);// TODO add your handling code here:
    }//GEN-LAST:event_R4C3ActionPerformed

    private void R4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C4ActionPerformed
        // TODO add your handling code here:
        R4C4.setText(turn);
        R4C4.setBackground(white);
    }//GEN-LAST:event_R4C4ActionPerformed

    private void R4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C5ActionPerformed

    private void R4C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C6ActionPerformed
        // TODO add your handling code here:
        R4C6.setText(turn);
        R4C6.setBackground(white);
    }//GEN-LAST:event_R4C6ActionPerformed

    private void R4C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C7ActionPerformed
        // TODO add your handling code here:
        R4C7.setText(turn);
        R4C7.setBackground(white);
    }//GEN-LAST:event_R4C7ActionPerformed

    private void R4C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C8ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C8ActionPerformed

    private void R4C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C9ActionPerformed
        // TODO add your handling code here:
        R4C9.setText(turn);
        R4C9.setBackground(white);
    }//GEN-LAST:event_R4C9ActionPerformed

    private void R5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C1ActionPerformed
        // TODO add your handling code here:
        R5C1.setText(turn);
        R5C1.setBackground(white);
    }//GEN-LAST:event_R5C1ActionPerformed

    private void R5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C2ActionPerformed

    private void R5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C3ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C3ActionPerformed

    private void R5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C4ActionPerformed
        // TODO add your handling code here:
        R5C4.setText(turn);
        R5C4.setBackground(white);
    }//GEN-LAST:event_R5C4ActionPerformed

    private void R5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C5ActionPerformed
        // TODO add your handling code here:
        R5C5.setText(turn);
        R5C5.setBackground(white);
    }//GEN-LAST:event_R5C5ActionPerformed

    private void R5C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C6ActionPerformed
        // TODO add your handling code here:
        R5C6.setText(turn);
        R5C6.setBackground(white);
    }//GEN-LAST:event_R5C6ActionPerformed

    private void R5C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C7ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C7ActionPerformed

    private void R5C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C8ActionPerformed

    private void R5C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C9ActionPerformed
        // TODO add your handling code here:
        R5C9.setText(turn);
        R5C9.setBackground(white);
    }//GEN-LAST:event_R5C9ActionPerformed

    private void R6C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C1ActionPerformed
        // TODO add your handling code here:
        R6C1.setText(turn);
        R6C1.setBackground(white);
    }//GEN-LAST:event_R6C1ActionPerformed

    private void R6C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C2ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C2ActionPerformed

    private void R6C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C4ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C4ActionPerformed

    private void R6C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C5ActionPerformed
        // TODO add your handling code here:
        R6C5.setText(turn);
        R6C5.setBackground(white);
    }//GEN-LAST:event_R6C5ActionPerformed

    private void R6C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C7ActionPerformed
        // TODO add your handling code here:
        R6C7.setText(turn);
        R6C7.setBackground(white);
    }//GEN-LAST:event_R6C7ActionPerformed

    private void R6C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C8ActionPerformed
        // TODO add your handling code here:
        R6C8.setText(turn);
        R6C8.setBackground(white);
    }//GEN-LAST:event_R6C8ActionPerformed

    private void R7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C1ActionPerformed
        // TODO add your handling code here:
        R7C1.setText(turn);
        R7C1.setBackground(white);
    }//GEN-LAST:event_R7C1ActionPerformed

    private void R7C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C2ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C2ActionPerformed

    private void R7C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C3ActionPerformed
        // TODO add your handling code here:
        R7C3.setText(turn);
         R7C3.setBackground(white);
    }//GEN-LAST:event_R7C3ActionPerformed

    private void R7C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C4ActionPerformed
        // TODO add your handling code here:
        R7C4.setText(turn);
         R7C4.setBackground(white);
    }//GEN-LAST:event_R7C4ActionPerformed

    private void R7C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C5ActionPerformed

    private void R7C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C6ActionPerformed
        // TODO add your handling code here:
        R7C6.setText(turn);
         R7C6.setBackground(white);
    }//GEN-LAST:event_R7C6ActionPerformed

    private void R7C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C7ActionPerformed

    private void R7C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C8ActionPerformed
        // TODO add your handling code here:
        R7C8.setText(turn);
         R7C8.setBackground(white);
    }//GEN-LAST:event_R7C8ActionPerformed

    private void R7C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C9ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C9ActionPerformed

    private void R8C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C1ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C1ActionPerformed

    private void R8C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C2ActionPerformed
        // TODO add your handling code here:
        R8C2.setText(turn);
         R8C2.setBackground(white);
    }//GEN-LAST:event_R8C2ActionPerformed

    private void R8C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C3ActionPerformed
        // TODO add your handling code here:
        R8C3.setText(turn);
         R8C3.setBackground(white);
    }//GEN-LAST:event_R8C3ActionPerformed

    private void R8C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C4ActionPerformed

    private void R8C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C5ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C5ActionPerformed

    private void R8C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C6ActionPerformed
        // TODO add your handling code here:
        R8C6.setText(turn);
         R8C6.setBackground(white);
    }//GEN-LAST:event_R8C6ActionPerformed

    private void R8C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C7ActionPerformed
        // TODO add your handling code here:
        R8C7.setText(turn);
         R8C7.setBackground(white);
    }//GEN-LAST:event_R8C7ActionPerformed

    private void R8C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C8ActionPerformed
        // TODO add your handling code here:
        R8C8.setText(turn);
         R8C8.setBackground(white);
    }//GEN-LAST:event_R8C8ActionPerformed

    private void R8C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C9ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C9ActionPerformed

    private void R9C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C1ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C1ActionPerformed

    private void R9C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Fixed value!","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C2ActionPerformed

    private void R9C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C4ActionPerformed
        // TODO add your handling code here:
         R9C4.setText(turn);
         R9C4.setBackground(white);
    }//GEN-LAST:event_R9C4ActionPerformed

    private void R9C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C5ActionPerformed
        // TODO add your handling code here:
        R9C5.setText(turn);
         R9C5.setBackground(white);
    }//GEN-LAST:event_R9C5ActionPerformed

    private void R9C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C7ActionPerformed
        // TODO add your handling code here:
        R9C7.setText(turn);
         R9C7.setBackground(white);
    }//GEN-LAST:event_R9C7ActionPerformed

    private void R9C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C8ActionPerformed
        // TODO add your handling code here:
        R9C8.setText(turn);
         R9C8.setBackground(white);
    }//GEN-LAST:event_R9C8ActionPerformed

    private void SET1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET1ActionPerformed
        assign(SET1);
        turn = "1";
    }//GEN-LAST:event_SET1ActionPerformed

    private void SET3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET3ActionPerformed
        // TODO add your handling code here:
        assign(SET3);
        turn = "3";
    }//GEN-LAST:event_SET3ActionPerformed

    private void SET4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET4ActionPerformed
        // TODO add your handling code here:
        assign(SET4);
        turn = "4";
    }//GEN-LAST:event_SET4ActionPerformed

    private void SET5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET5ActionPerformed
        // TODO add your handling code here:
        assign(SET5);
        turn = "5";
    }//GEN-LAST:event_SET5ActionPerformed

    private void SET6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET6ActionPerformed
        // TODO add your handling code here:
        assign(SET6);
        turn = "6";
    }//GEN-LAST:event_SET6ActionPerformed

    private void SET7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET7ActionPerformed
        // TODO add your handling code here:
        assign(SET7);
        turn = "7";
    }//GEN-LAST:event_SET7ActionPerformed

    private void SET8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET8ActionPerformed
        // TODO add your handling code here:
        assign(SET8);
        turn = "8";
    }//GEN-LAST:event_SET8ActionPerformed

    private void SET9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SET9ActionPerformed
        // TODO add your handling code here:
        assign(SET9);
        turn = "9";
    }//GEN-LAST:event_SET9ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("RESET");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to RESET the game?","SUDOKU", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            resetGame();
    }
    
        
    }//GEN-LAST:event_RESETActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to EXIT the game?","SUDOKU", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_BACKActionPerformed

    private void SOLUTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOLUTIONActionPerformed
        // TODO add your handling code here:
        solution();
        
    }//GEN-LAST:event_SOLUTIONActionPerformed

    private void CHECKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKActionPerformed
        // TODO add your handling code here:
        showw();
        
    }//GEN-LAST:event_CHECKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton CHECK;
    private javax.swing.JButton R1C1;
    private javax.swing.JButton R1C2;
    private javax.swing.JButton R1C3;
    private javax.swing.JButton R1C4;
    private javax.swing.JButton R1C5;
    private javax.swing.JButton R1C6;
    private javax.swing.JButton R1C7;
    private javax.swing.JButton R1C8;
    private javax.swing.JButton R1C9;
    private javax.swing.JButton R2C1;
    private javax.swing.JButton R2C2;
    private javax.swing.JButton R2C3;
    private javax.swing.JButton R2C4;
    private javax.swing.JButton R2C5;
    private javax.swing.JButton R2C6;
    private javax.swing.JButton R2C7;
    private javax.swing.JButton R2C8;
    private javax.swing.JButton R2C9;
    private javax.swing.JButton R3C1;
    private javax.swing.JButton R3C2;
    private javax.swing.JButton R3C3;
    private javax.swing.JButton R3C4;
    private javax.swing.JButton R3C5;
    private javax.swing.JButton R3C6;
    private javax.swing.JButton R3C7;
    private javax.swing.JButton R3C8;
    private javax.swing.JButton R3C9;
    private javax.swing.JButton R4C1;
    private javax.swing.JButton R4C2;
    private javax.swing.JButton R4C3;
    private javax.swing.JButton R4C4;
    private javax.swing.JButton R4C5;
    private javax.swing.JButton R4C6;
    private javax.swing.JButton R4C7;
    private javax.swing.JButton R4C8;
    private javax.swing.JButton R4C9;
    private javax.swing.JButton R5C1;
    private javax.swing.JButton R5C2;
    private javax.swing.JButton R5C3;
    private javax.swing.JButton R5C4;
    private javax.swing.JButton R5C5;
    private javax.swing.JButton R5C6;
    private javax.swing.JButton R5C7;
    private javax.swing.JButton R5C8;
    private javax.swing.JButton R5C9;
    private javax.swing.JButton R6C1;
    private javax.swing.JButton R6C2;
    private javax.swing.JButton R6C3;
    private javax.swing.JButton R6C4;
    private javax.swing.JButton R6C5;
    private javax.swing.JButton R6C6;
    private javax.swing.JButton R6C7;
    private javax.swing.JButton R6C8;
    private javax.swing.JButton R6C9;
    private javax.swing.JButton R7C1;
    private javax.swing.JButton R7C2;
    private javax.swing.JButton R7C3;
    private javax.swing.JButton R7C4;
    private javax.swing.JButton R7C5;
    private javax.swing.JButton R7C6;
    private javax.swing.JButton R7C7;
    private javax.swing.JButton R7C8;
    private javax.swing.JButton R7C9;
    private javax.swing.JButton R8C1;
    private javax.swing.JButton R8C2;
    private javax.swing.JButton R8C3;
    private javax.swing.JButton R8C4;
    private javax.swing.JButton R8C5;
    private javax.swing.JButton R8C6;
    private javax.swing.JButton R8C7;
    private javax.swing.JButton R8C8;
    private javax.swing.JButton R8C9;
    private javax.swing.JButton R9C1;
    private javax.swing.JButton R9C2;
    private javax.swing.JButton R9C3;
    private javax.swing.JButton R9C4;
    private javax.swing.JButton R9C5;
    private javax.swing.JButton R9C6;
    private javax.swing.JButton R9C7;
    private javax.swing.JButton R9C8;
    private javax.swing.JButton R9C9;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SET1;
    private javax.swing.JButton SET2;
    private javax.swing.JButton SET3;
    private javax.swing.JButton SET4;
    private javax.swing.JButton SET5;
    private javax.swing.JButton SET6;
    private javax.swing.JButton SET7;
    private javax.swing.JButton SET8;
    private javax.swing.JButton SET9;
    private javax.swing.JButton SOLUTION;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}

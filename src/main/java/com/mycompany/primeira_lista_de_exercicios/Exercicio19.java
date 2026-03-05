/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio19 {
    
    Exercicio19(){
        float valorItem = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto:"));
        int quantItem = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de itens:"));
        
        JOptionPane.showMessageDialog(null, "O valor total da compra é de "+quantItem*valorItem+" reais.");

    }

    public static void main(String[] args) {
        Exercicio19 ex19 = new Exercicio19();
    }
}
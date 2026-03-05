/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio28 {
    
    Exercicio28(){
        float reais = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor em reais:"));
        float cotacao = Float.parseFloat(JOptionPane.showInputDialog("Insira a cotação atual do dólar:"));
        
        JOptionPane.showMessageDialog(null, "R$"+reais+" reais é igual a $"+reais*cotacao+" dólares.");
    }

    public static void main(String[] args) {
        Exercicio28 ex28 = new Exercicio28();
    }
}
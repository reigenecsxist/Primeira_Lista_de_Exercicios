/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio15 {
    
    Exercicio15(){
        float metros = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida em metros:"));
        
        JOptionPane.showMessageDialog(null, "A medida em centímetros é igual a "+metros*100+" cm.");
    }

    public static void main(String[] args) {
        Exercicio15 ex15 = new Exercicio15();
    }
}
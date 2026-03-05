/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio14 {
    
    Exercicio14(){
        float base = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da base do retângulo:"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da altura do retângulo:"));
        
        JOptionPane.showMessageDialog(null, "O perímetro do retângulo é igual a "+(base+altura)/2);
    }

    public static void main(String[] args) {
        Exercicio14 ex14 = new Exercicio14();
    }
}
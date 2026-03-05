/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio12 {
    
    Exercicio12(){
        float base = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da base do triângulo:"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da altura do triângulo:"));
        
        JOptionPane.showMessageDialog(null, "A área do triângulo é igual a "+((base*altura)/2));
    }

    public static void main(String[] args) {
        Exercicio12 ex12 = new Exercicio12();
    }
}
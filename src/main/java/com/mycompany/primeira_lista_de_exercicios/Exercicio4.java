/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio4 {
    
    Exercicio4(){
        float base = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da base do retângulo:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a medida da altura do retângulo:"));
        
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " +base*altura);
    }

    public static void main(String[] args) {
        Exercicio4 ex4 = new Exercicio4();
    }
}

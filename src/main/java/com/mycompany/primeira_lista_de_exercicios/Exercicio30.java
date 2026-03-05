/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio30 {
    
    Exercicio30(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro número:"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo número:"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Insira o terceiro número:"));
        
        JOptionPane.showMessageDialog(null, "O produto dos números é igual a "+(n1*n2*n3));

    }

    public static void main(String[] args) {
        Exercicio30 ex30 = new Exercicio30();
    }
}
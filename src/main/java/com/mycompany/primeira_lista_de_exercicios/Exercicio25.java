/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio25 {
    
    Exercicio25(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro número:"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo número:"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Insira o terceiro número:"));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Insira o quarto número:"));
        
        JOptionPane.showMessageDialog(null, "A média dos números é igual a "+(n1+n2+n3+n4)/4);

    }

    public static void main(String[] args) {
        Exercicio25 ex25 = new Exercicio25();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio9 {
    
    Exercicio9(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
        
        JOptionPane.showMessageDialog(null, "O resultado da divisão dos números "+n1+" e "+n2+" é "+n1/n2+", e o resto"
                + " da divisão entre eles é "+n1%n2+".");
    }

    public static void main(String[] args) {
        Exercicio9 ex9 = new Exercicio9();
    }
}
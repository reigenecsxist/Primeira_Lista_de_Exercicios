/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio29 {
    
    Exercicio29(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um número:"));
        
        JOptionPane.showMessageDialog(null, +n1+" ao quadrado é igual a "+Math.pow(n1, 2));
    }

    public static void main(String[] args) {
        Exercicio29 ex29 = new Exercicio29();
    }
}
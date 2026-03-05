/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio6 {
    
    Exercicio6(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        
        JOptionPane.showMessageDialog(null, "O número inserido é: "+n1+"\nO número anterior é: "+(n1-1)+"\n"
                + "O número seguinte é: "+(n1+1));
    }

    public static void main(String[] args) {
        Exercicio6 ex6 = new Exercicio6();
    }
}
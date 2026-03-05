/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio3 {
    
    Exercicio3(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota:"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota:"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Insira a terceira nota:"));
        
        JOptionPane.showMessageDialog(null, "A média das notas " +n1+", " +n2+ " e " +n3+ " é: " +(n1+n2+n3)/3);
    }

    public static void main(String[] args) {
        Exercicio3 ex3 = new Exercicio3();
    }
}

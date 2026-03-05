/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio8 {
    
    Exercicio8(){
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida do lado do quadrado:"));
        
        JOptionPane.showMessageDialog(null, "O perímetro do quadrado é: " +lado*4);
    }

    public static void main(String[] args) {
        Exercicio8 ex8 = new Exercicio8();
    }
}

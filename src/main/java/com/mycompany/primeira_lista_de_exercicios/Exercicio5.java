/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio5 {
    
    Exercicio5(){
        float temp = Float.parseFloat(JOptionPane.showInputDialog("Insira a temperatura atual em Celsius:"));
        
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " +((9*temp)/5+32));
    }

    public static void main(String[] args) {
        Exercicio5 ex5 = new Exercicio5();
    }
}

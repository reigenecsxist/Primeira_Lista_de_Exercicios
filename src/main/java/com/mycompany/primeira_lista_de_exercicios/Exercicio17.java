/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio17 {
    
    Exercicio17(){
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de dias:"));
        
        JOptionPane.showMessageDialog(null, dias+" dias são equivalentes a "+dias*24+" horas.");

    }

    public static void main(String[] args) {
        Exercicio17 ex17 = new Exercicio17();
    }
}
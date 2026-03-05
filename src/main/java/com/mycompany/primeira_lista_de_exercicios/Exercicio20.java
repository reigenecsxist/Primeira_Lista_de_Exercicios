/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio20 {
    
    Exercicio20(){
        float distancia = Float.parseFloat(JOptionPane.showInputDialog("Insira a distância em quilômetros:"));
        
        JOptionPane.showMessageDialog(null, distancia+" quilômetros são equivalentes a "+distancia*1000+" metros.");

    }

    public static void main(String[] args) {
        Exercicio20 ex20 = new Exercicio20();
    }
}
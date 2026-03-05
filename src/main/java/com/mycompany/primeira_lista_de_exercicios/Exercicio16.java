/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio16 {
    
    Exercicio16(){
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas:"));
        
        JOptionPane.showMessageDialog(null, horas+" horas são equivalentes a "+horas*60+" minutos.");
    }

    public static void main(String[] args) {
        Exercicio16 ex16 = new Exercicio16();
    }
}
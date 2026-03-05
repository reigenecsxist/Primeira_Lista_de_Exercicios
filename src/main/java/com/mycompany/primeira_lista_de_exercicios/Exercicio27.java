/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio27 {
    
    Exercicio27(){
        float baseMaior = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da base maior do trapézio:"));
        float baseMenor = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da base menor do trapézio:"));        
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da altura do trapézio:"));
        
        JOptionPane.showMessageDialog(null, "A área do trapézio é igual a "+(((baseMaior+baseMenor)*altura)/2));
    }

    public static void main(String[] args) {
        Exercicio27 ex27 = new Exercicio27();
    }
}
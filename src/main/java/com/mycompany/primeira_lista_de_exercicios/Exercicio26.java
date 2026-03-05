/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio26 {
    
    Exercicio26(){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade em anos:"));
        
        JOptionPane.showMessageDialog(null, "A sua idade em meses é igual a "+idade*12+", e em dias é igual a "+idade*365);

    }

    public static void main(String[] args) {
        Exercicio26 ex26 = new Exercicio26();
    }
}
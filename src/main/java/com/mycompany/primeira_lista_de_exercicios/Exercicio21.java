/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio21 {
    
    Exercicio21(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um número:"));
        
        JOptionPane.showMessageDialog(null, "O dobro de "+n1+" é igual a "+n1*2);

    }

    public static void main(String[] args) {
        Exercicio21 ex21 = new Exercicio21();
    }
}
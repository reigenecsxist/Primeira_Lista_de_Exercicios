/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio23 {
    
    Exercicio23(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um número:"));
        
        JOptionPane.showMessageDialog(null, "A metade de "+n1+" é igual a "+n1/2);

    }

    public static void main(String[] args) {
        Exercicio23 ex23 = new Exercicio23();
    }
}
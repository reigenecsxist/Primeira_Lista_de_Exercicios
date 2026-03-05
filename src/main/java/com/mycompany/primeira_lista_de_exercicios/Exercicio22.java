/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio22 {
    
    Exercicio22(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um número:"));
        
        JOptionPane.showMessageDialog(null, "O triplo de "+n1+" é igual a "+n1*3);

    }

    public static void main(String[] args) {
        Exercicio22 ex22 = new Exercicio22();
    }
}
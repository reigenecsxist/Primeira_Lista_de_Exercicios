/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio13 {
    
    Exercicio13(){
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira a medida do raio do círculo:"));
        
        JOptionPane.showMessageDialog(null, "A área do círculo é igual a: "+(Math.PI*Math.pow(raio, 2)));
    }

    public static void main(String[] args) {
        Exercicio13 ex13 = new Exercicio13();
    }
}
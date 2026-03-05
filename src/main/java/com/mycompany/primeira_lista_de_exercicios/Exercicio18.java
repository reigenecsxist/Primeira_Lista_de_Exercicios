/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio18 {
    
    Exercicio18(){
        float comprimento = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida do comprimento da caixa:"));
        float largura = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da largura da caixa:"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a medida da altura da caixa:"));
        
        JOptionPane.showMessageDialog(null, "O volume da caixa é igual "+comprimento*largura*altura);

    }

    public static void main(String[] args) {
        Exercicio18 ex18 = new Exercicio18();
    }
}
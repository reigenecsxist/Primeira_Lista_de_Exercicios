/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio7 {
    
    Exercicio7(){
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de sua hora de trabalho:"));
        float quantHoras = Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas no mês:"));
        
        JOptionPane.showMessageDialog(null, "Seu salário será: "+valorHora*quantHoras+" reais.");
        
    }

    public static void main(String[] args) {
        Exercicio7 ex7 = new Exercicio7();
    }
}

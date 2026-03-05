/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio2 {
    
    Exercicio2(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
        
        JOptionPane.showMessageDialog(null, "O resultado das operações entre "+n1+" e "+n2+" é:\n"
                + "\tAdição: "+ (n1+n2) +"\n"
                        + "\tSubtração: "+ (n1-n2) +"\n"
                                + "\tMultiplicação: "+ (n1*n2) +"\n"
                                        + "\tDivisão: "+ (n1/n2) +"\n"
                                                + "\tResto da divisão: "+ (n1%n2));
    }

    public static void main(String[] args) {
        Exercicio2 ex2 = new Exercicio2();
    }
}

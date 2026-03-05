/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio10 {
    
    Exercicio10(){
        int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade média em km/h:"));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo gasto na viagem:"));
        
        JOptionPane.showMessageDialog(null, "No período de " +tempo+ " horas foram percorridos " +velocidade*tempo+ " "
                + "quilômetros.");
    }

    public static void main(String[] args) {
        Exercicio10 ex10 = new Exercicio10();
    }
}
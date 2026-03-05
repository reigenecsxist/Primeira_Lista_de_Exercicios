/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira_lista_de_exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio11 {
    
    Exercicio11(){
        float distancia = Float.parseFloat(JOptionPane.showInputDialog("Insira a distância percorrida:"));
        float combGasto = Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade de combustível gasta no percurso:"));
        
        JOptionPane.showMessageDialog(null, "A autonomia do seu veículo foi de " +distancia/combGasto+ " km/l.");
    }

    public static void main(String[] args) {
        Exercicio11 ex11 = new Exercicio11();
    }
}
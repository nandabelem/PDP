/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Informatica
 */
public class Credenciais {
    
    private String nome = "usuario";
    private String senha = "senha";
    
    public void confereCredencial(String usuario, String key){
        
        if(usuario == this.nome && key == this.senha){
            JOptionPane.showMessageDialog(null, "CORRETO!");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRADO! Tente de novo");
            
        }
    }
    
    
}

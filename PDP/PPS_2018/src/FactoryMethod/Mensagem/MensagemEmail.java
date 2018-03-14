/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.Mensagem;

/**
 *
 * @author Informatica
 */
public class MensagemEmail implements Mensagem{

    @Override
    public void envia(String mensagem) {
        System.out.println("Email");
        System.out.println(mensagem);
    }
    
    
    
}

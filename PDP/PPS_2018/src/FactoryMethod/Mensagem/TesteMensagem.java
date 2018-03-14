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
public class TesteMensagem {
    
    public static void main(String args[]){
        Mensagem msn = MensagemFactory.enviarMensagem(TipoCliente.Intermediario);
                
       msn.envia("Promoção de carnes e bebidas!");
                
    }
    
}

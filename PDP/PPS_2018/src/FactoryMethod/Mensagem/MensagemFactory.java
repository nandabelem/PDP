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
public class MensagemFactory {
    
        public static Mensagem enviarMensagem(TipoCliente cliente){
        if(cliente.equals(TipoCliente.Avancado)){
            return new MensagemWhats();    
        }
        else if(cliente.equals(TipoCliente.Top)){
            return new MensagemEmail();
        }
        else if(cliente.equals(TipoCliente.Intermediario)){
            return new MensagemSMS();
        }

        throw new IllegalArgumentException("O cliente não é válido!");
    }
    
    
}

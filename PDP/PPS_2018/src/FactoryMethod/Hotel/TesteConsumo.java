/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.Hotel;

/**
 *
 * @author alunos-linux
 */
public class TesteConsumo {
    
    public static void main(String args[]){
        Consumo consumo = ConsumoFactory.RegistraConsumo(TipoConsumo.Refeicao);
        
        consumo.descricaoConsumo("Foi consumido:");
    }
    
}

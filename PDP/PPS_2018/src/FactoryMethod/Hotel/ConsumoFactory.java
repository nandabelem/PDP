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
public class ConsumoFactory {
    
    public static Consumo RegistraConsumo(TipoConsumo tipoConsumo){
       if(tipoConsumo.equals(TipoConsumo.Bebida)){
           return new ProdutoBebida();
       }
       else if(tipoConsumo.equals(TipoConsumo.Lavanderia)){
           return new ServicoLavanderia();
       }
       else if(tipoConsumo.equals(TipoConsumo.Refeicao)){
           return new ProdutoRefeicao();
       }
       throw new IllegalArgumentException("Tipo de consumo invalido!");
    }
    
}

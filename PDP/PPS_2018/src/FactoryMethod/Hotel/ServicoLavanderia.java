/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.Hotel;

/**
 *
 * @author Informatica
 */
public class ServicoLavanderia implements Consumo{

    @Override
    public void descricaoConsumo(String descricaoConsumo) {
        System.out.println(descricaoConsumo);
        System.out.println("Serviço: Lavanderia");
    }
    
}

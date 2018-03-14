/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.Moeda;

/**
 *
 * @author Informatica
 */
public class MoedaFactory {
    
    public static Moeda criarMoeda(Pais pais){
        if(pais.equals(Pais.BRASIL)){
            return new Real();
        }
        else if(pais.equals(Pais.EUA)){
            return new Dolar();
        }
        else{
            System.out.println("País inválido");
        }
        throw new IllegalArgumentException("Não existe esse fucking país");
    }
    
}

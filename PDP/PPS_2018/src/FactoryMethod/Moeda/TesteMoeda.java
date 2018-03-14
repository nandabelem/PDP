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
public class TesteMoeda {
    
    public static void main(String args[]){
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        
        System.out.println(moeda.getSimbolo() );
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Informatica
 */
public class MinhaApp2 {
    
    public static void main(String[] args){
    
        Configuracao conf = Configuracao.getInstance();
    
        System.out.println(conf.getPropriedade("time-zone"));
        System.out.println(conf.getPropriedade("currency-code"));
    
    }
}

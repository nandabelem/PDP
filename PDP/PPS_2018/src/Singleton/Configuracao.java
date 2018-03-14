/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Informatica
 */
public class Configuracao {
    
    private Map <String, String> propriedades;
    
    //Mágica do Singleton
    private static Configuracao instancia;
    
    private Configuracao(){
        this.propriedades = new HashMap<>();
        this.propriedades.put("time-zone", "America/SaoPaulo");
        this.propriedades.put("currency-code", "BRL");
        
    }
    
    public static Configuracao getInstance(){
        if(Configuracao.instancia == null){
            Configuracao.instancia = new Configuracao();
        }
        
        return Configuracao.instancia;
    }
    
    public String getPropriedade(String nomeDaPropriedade){
        return this.propriedades.get(nomeDaPropriedade);
    }
    
}

package Singleton;

/**
 *
 * @author Informatica
 */
public class MinhaApp {
    
    public static void main(String[] args){
        
        Janela j = Janela.getInstance();
        j.pack();
        j.setVisible(true);

    }
    
}

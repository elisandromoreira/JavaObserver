package br.com.elisandro.observer.ecommerce;

public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public void update(Object obj){
         System.out.println("Caro cliente " + this.nome + ", a loja enviou uma notificação"
                 + " : " + (String)obj);
     }
}
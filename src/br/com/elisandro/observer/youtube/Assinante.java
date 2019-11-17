package br.com.elisandro.observer.youtube;

public class Assinante implements Observer {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }
    
    public void update(Object obj){
         System.out.println("Caro assinante " + this.nome + ", o canal enviou uma notificação"
                 + " : " + (String)obj);
     }
}
package br.com.elisandro.observer.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Subject {
    
    private List <Observer> observers;
    private String promocao;

    public Loja() {
        this.observers = new ArrayList<Observer>();
        promocao = "Nenhuma Promo��o Dispon�vel";
    }
    
    public void attach(Observer obs){
        this.observers.add(obs);
        obs.update("Parab�ns!! Voc� Assinou Nossa Newsletter de Promo��es");
        System.out.println("\n");
    }
    
    public void setPromocao (String promocao){
        this.promocao = promocao;
        notifyObservers();
    }

    public void detach(Observer obs){
        obs.update("Voc� deixou de ser assinante da nossa Newsletter\n---------\n");
        this.observers.remove(obs);
    }

    public void notifyObservers(){
        for(Observer obs : this.observers){
            obs.update("Nova Promo��o: " + promocao);
        }
        System.out.println("---------\n");
    }
    
}

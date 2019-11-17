package br.com.elisandro.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class Canal implements Subject {
    
    private List <Observer> observers;
    private String video;

    public Canal() {
        this.observers = new ArrayList<Observer>();
        video = "Sem nenhum vídeo";
    }
    
    public void attach(Observer obs){
        this.observers.add(obs);
        obs.update("Parabéns!! Assinatura realizada com sucesso.");
        System.out.println("\n");
    }
    
    public void setVideo (String video){
        this.video = video;
        notifyObservers();
    }

    public void detach(Observer obs){
        obs.update("Você deixou de ser assinante\n---------\n");
        this.observers.remove(obs);
    }

    public void notifyObservers(){
        for(Observer obs : this.observers){
            obs.update("Novo Vídeo: " + video);
        }
        System.out.println("---------\n");
    }
    
}

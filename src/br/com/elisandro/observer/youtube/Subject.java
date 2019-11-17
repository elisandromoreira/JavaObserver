package br.com.elisandro.observer.youtube;

public interface Subject {
	
	public void attach(Observer obs);
	 
    public void detach(Observer obs);
 
    public void notifyObservers();

}

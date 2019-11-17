package br.com.elisandro.observer.ecommerce;

public interface Subject {
	
	public void attach(Observer obs);
	 
    public void detach(Observer obs);
 
    public void notifyObservers();

}

package br.com.elisandro.observer.ecommerce;

public class Main {

	public static void main(String[] args) {

		Loja l = new Loja();
		Cliente c1 = new Cliente("Leanderson André");
        l.attach(c1);
        Cliente c2 = new Cliente("Elisandro Moreira");
        l.attach(c2);
        Cliente c3 = new Cliente("Jon Snow");
        l.attach(c3);
        l.setPromocao("Notebook Gamer i7, 16GB, NVIDIA GTX1050 4GB - R$ 2899,00");
        
        l.detach(c2);
        
        l.setPromocao("Trono de Ferro por Apenas R$ 1000,00");
        

	}

}

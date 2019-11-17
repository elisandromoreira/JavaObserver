package br.com.elisandro.observer.youtube;

public class Main {

	public static void main(String[] args) {

		Canal c = new Canal();
		Assinante a1 = new Assinante("Leanderson André");
        c.attach(a1);
        Assinante a2 = new Assinante("Elisandro Moreira");
        c.attach(a2);
        Assinante a3 = new Assinante("Zeca Urubu");
        c.attach(a3);
        c.setVideo("Professor de POO da Univille aprova todos os alunos");
        
        c.detach(a3);
        
        c.setVideo("Tutorial - Design Patterns com Java");
        

	}

}

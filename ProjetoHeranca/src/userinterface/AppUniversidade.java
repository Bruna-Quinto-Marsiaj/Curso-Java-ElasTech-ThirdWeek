package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Isidro", "isidro@isidro.com", "987654321");
		//p.setNome("Isidro"); VER PQ FEZ ISSO
		//p.setEmail("isidro@isidro.com");
		//p.setTelefone("987654321");
		
		System.out.println(p.exibirInfo());
		
		Estudante e = new Estudante("Jose" , "jose@jose.com" , "912345678" , 12345, "Computacao");
		//e.setNome("Jose"); ver pq fez aqui tbm e como comentar todos ao msm tempo
		//e.setEmail("jose@jose.com");
		//e.setTelefone("912345678");
		//e.setNumeroMatricula(12345);
		//e.setCurso("Computacao");
		
		System.out.println(e.exibirInfo());
		
	}

}

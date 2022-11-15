package app;

import model.Conta; //n vai automático? checar se esse n era o erro nos outros projetos
import model.ContaEspecial;

public class PIBank {
	public static void main(String[] args) {
		Conta c1 = new Conta("Isidro" , "123.456.789-00" , 1234, 100);
		Conta c2 = new ContaEspecial("Jose", "987.654.321-00", 9876,100.00,100.00); //conta especial é uma conta, n preciso escrever conta especial
		// a declaração/referencia (conta cx) é importante, mas o que define é o instanciamento (new...). Isso é o polimorfismo: a forma de chamar é a msm,a maneira, o codigo/algoritmo que vou executar é diferente depende da instancia, ex acelerar fusca e ferrari, msm processo comportamento diferente 
		
		
		//System.out.println(c1.exibirInfo());
		//2 System.out.println(c1);// para imprimir o objeto. mostra: pacote, classe, endereço de memoria	
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.debitar(80); //chamada é a msm
		c2.debitar(180);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}

}

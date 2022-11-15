package pacote3;

import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		/*Produto lista[]; //aqui é somente uma lista de refenrencia, ainda não criei os obj
		lista = new Produto[5];//ainda não tenho os produtos, são só referencias, variaveis
		
		lista[0] = new Produto(1, "Computador", 1500.0);
		lista[1] = new Produto(2, "Mouse", 30.0);
		lista[2] = new Produto(3, "Teclado", 80.0);
		lista[3] = new Produto(4, "Monitor", 400.0);
		lista[4] = new Produto(5, "Monitor", 650.0);	*/
		
		//for (int i=0; i< lista.length; i++) {//mostrará todos os elementos
		//	System.out.println(lista[i]);
		
		// for each: só serve para percorrer a lista da primeira a última posição, para outras situações: percorrer de trás pra frente, só paress. usar o for de cima (de cabeçalho completo)
			
		//for(Produto p : lista) { //declaro uma variavel, nesse caso do tipo produto p..Como leio: para cada p do tipo produto dentro da lista
		    //System.out.println(p);
		    
		    ArrayList<Produto>lista;
		    lista = new ArrayList<Produto>();
		    
		    lista.add(new Produto(1, "Computador", 1500.0));
		    lista.add(new Produto(2, "Mouse", 30.0));
		    lista.add(new Produto(3, "Teclado", 80.0));
		    lista.add(new Produto(4, "Monitor", 400.0));
		    lista.add(new Produto(5, "Monitor", 650.0));
		    
		    for(Produto p : lista) { 
			    System.out.println(p);    
		}
	}
}

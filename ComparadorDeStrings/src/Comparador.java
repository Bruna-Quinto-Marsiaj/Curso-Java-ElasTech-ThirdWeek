
public class Comparador {
	public static void main(String[] args) {
		String s1,s2;// string, Double, Float, Integer, Long (classes)... sofre boxing, n preciso dar new
		
		s1 = "Oi tudo bem?"; //colocando um new string antes de string ele cria 2 em lugares diferentes, checar
		s2 = "Oi tudo bem?";
		
		if (s1 == s2) {//estou comparando se s1 e s2 apontam pra mesma região da memória e n seus conteúdos
			System.out.println("mesmo endereço de memória");
		}
		else {
			System.out.println("endereços diferentes");
		}	
		
		if (s1.equals(s2)) { //compara conteudo
			System.out.println("conteudos iguais";)
		}
		else {
			System.out.println("conteudos diferentes");
		}
		
		s2 = "Agora vai";
		
		System.out.println(s1);
		System.out.println(s1); //não mudará o s1 pq string em java é obj imutável, se eu mudo ele automaticamente cria uma nova área de memoria
		
	}
}

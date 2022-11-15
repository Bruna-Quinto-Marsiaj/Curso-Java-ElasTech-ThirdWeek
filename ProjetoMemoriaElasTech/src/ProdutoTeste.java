package;
public class ProdutoTeste {
	public static void main(String[]args) {
		Produto p1, p2;// ps são apontadores
		
		p1 = new Produto(123, "Computador",1000.0);//new=reserva de memória
		System.out.println("P1 = "+p1.exibir());
		
		p1 = new Produto(456,"Mouse", 70.0);
		System.out.println("P1 = "+p1.exibir());
		
		/*p2 = p1;//n tem reserva de memoria, apontam para o msm objeto
		
		p2.setPreco(1500.00);
		System.out.println("P1 = "+p1.exibir());
		System.out.println("P2 = "+p2.exibir());*/
	}
}

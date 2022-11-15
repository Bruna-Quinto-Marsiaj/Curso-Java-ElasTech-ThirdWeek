package pacote1;

public class MeuSistema {
	public static void main(String[] args) {
		InterfaceBD ibd;//supondo que tenho um banco de dados access*. Declaro como interface e instancio como obj, assim como uma classe abstrata. ESSE É O USO MAIS FREQUENTE DE INTERFACE
		
		ibd = new BDMysql();//instancio como obj
		//ibd = new BDAccess(); para usar outro banco de dados só mudo aqui, n preciso mudar abaixo. UMA MESMA FORMA(MSM ENCAIXE/MSM ESPECIFICAÇÃO) DE CHAMAR DIFERENTES IMPLEMENTAÇÕES. PODERIAMOS USAR COM IF, TIPO 1 PARA MYSQL, 2 PARA ACCESS
		
		//vou conectar no banco de dados
		ibd.conectar();
		
		//vou recuperar dados
		ibd.executar("SELECT * FROM tb_clientes");//comando de bd
					
		//vou desconectar
		ibd.desconectar();
		
		//ta dando erro pq falta implementar, n dei new em lugar nenhum, mas n posso dar new na interface
		
	}

}

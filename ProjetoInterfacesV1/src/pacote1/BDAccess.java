package pacote1;

public class BDAccess implements InterfaceBD {//implements ao inves de extends. gerei os metodos a partir da sugestão de erro que apareceu em BDAccess

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectando no banco ACCESS");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Desconectando do banco ACCESS");
		
	}

	@Override
	public void executar(String comando) {
		// TODO Auto-generated method stub
		System.out.println("ms-access> "+comando);
		
	} 

}

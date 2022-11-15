package pacote2; //

public class ObjetoQueCalcula implements InterfaceModulo1, InterfaceModulo2 { //outro modo de usar interfaces: multifacetar o uso de objetos. ex: tenho um obj que faz determinado calculo, ele pode implementar quantas interfaces forem necessárias no caso de cada uma quiser fazer um uso diferente dele, ex, um calculo diferente com ele, checar""
	public void realizaAlgumCalculo() {
		System.out.println("Pronto...calculei!");
		
		
	}

@Override
public void efetivarContas() {
	// TODO Auto-generated method stub
	realizaAlgumCalculo();
	
}

@Override
public void calcularValores() {
	// TODO Auto-generated method stub
	realizaAlgumCalculo();
	
}

}

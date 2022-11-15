package pacote2;

public class AplicacaoQueUsaCalculos {
	public static void main(String[] args) {
		
		//situação 1 - preciso chamar o método do objeto do jeito que ele é
		
		ObjetoQueCalcula o = new ObjetoQueCalcula();
		o.realizaAlgumCalculo();
		
		//situacao 2 - o modulo x só consegue chamar via método calcularValores()
		InterfaceModulo1 i1 = o;
		i1.calcularValores();
		
		//situacao 3 - o modulo y so consegue chamar via metodo efetivarContas();
		InterfaceModulo2 i2 = o;
		i2.efetivarContas();
	}
}

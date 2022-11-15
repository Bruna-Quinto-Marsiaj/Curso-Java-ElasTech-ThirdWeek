package pacote1; //INTERFACES SERVEM PARA ESPECIFICAR QUAIS FUNCIONALIDADES EU PRECISO

public interface InterfaceBD { // interface só tem cabeçalhos de métodos, tipo uma classe abstrata com método abstrato. Interface é uma classe abstrata que contem metodos abstratos,poderia ter constantes, mas n é mt usual. qual a diferença entao? esse tipo de interface se parece com a classe abstrata, os outros vamos ver, qual o uso?
	public void conectar();
	public void desconectar();
	public void executar(String comando);
	// n pode ter logica: public void teste, por ex

}

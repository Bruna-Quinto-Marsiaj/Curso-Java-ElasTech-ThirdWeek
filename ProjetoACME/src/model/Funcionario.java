package model;

public abstract class Funcionario { //quando usar abstrato
	protected int numRegistro;
	protected String nome;
	
	public Funcionario(int numRegistro, String nome) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
	}

	//as classes abstratas me permitem criar as cláusulas contratuais" para
	//que as subclasses se comprometam a implementar
	
	public abstract double calcularSalario(); //metodo sem corpo para as subclasses fazerem...
	
	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}

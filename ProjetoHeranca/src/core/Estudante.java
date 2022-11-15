package core;

public class Estudante extends Pessoa {// extends é uma "ferramenta" de herança que amplia Pessoa, nesse caso. Estudante, subclasse, classe filha,n dá pra remover nada da classe mãe só dá pra add
    private int numeroMatricula;
    private String curso;
    
    //construtor na classe filha
    public Estudante(String nome, String email, String telefone, int numMat, String curso) { //se tenho construtor na classe mãe tenho que criar aqui tbm. entender essa "criação"
    	super(nome,email,telefone); //ou eu ponho:   ("","",""), n sei como ficaria o resto * chamada ao construtor da classe pai
    	this.numeroMatricula = numMat;
    	this.curso = curso; 	
    }
    
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//sobrescrita do método da superclasse, redefinição
	public String exibirInfo() {
		return super.nome+"/"+super.email+"/"+super.telefone+"/"+this.numeroMatricula+"/"+this.curso; //usei o get antes dos 3 primeiros pq a classe pessoa já tinha usado esses nomes antes, porém usando o protected na super classe n preciso do get,getNome()..., posso usar ´so os nomes ou fazer a distinção de super antes da mãe e this na filha. Sobrecarga, varios métodos na mesma classe, varios set, varios construtores, sobrecarrega,a mesma definição mudando a lista de parametros,seja em numero ou tipo  .
	}
    
    
}

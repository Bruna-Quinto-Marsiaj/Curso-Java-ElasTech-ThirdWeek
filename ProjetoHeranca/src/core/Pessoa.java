package core;

public class Pessoa extends Object { //superclasse, classepai, classe mãe. VER SE TENHO QUE BOTAR ISSO NA CLASSE CLIENTE DO PROJETO
	protected String nome; // se eu colocar protetec, antes estavam private, nesse e nos dois abaixo, a classe filha pode acessar os outros não, e quando eu dou na classe filha o exibir info, eu n preciso botar o get antes do que vem da classe mae, posso botar o super e na frente dos atributos da classe filha eu posso botar o this.(faço uma sobrescrita de metodo, redefinição.
	protected String email;
	protected String telefone;
	
	//construtor:
	public Pessoa(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	//getter and setters, pra dar certo tive que colocar o "cursor" na linha abaixo de telefone, ver**
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//criar o método
	public String exibirInfo() {
		return nome + "/" + email +"/" + telefone; // ver return ou sysout
	}
	

}

package classe;

public class Registro {
	private String nome;
	private String email;
	private int quarto;
	
	public Registro(String nome, String email, int quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

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

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	public void alugandoQuarto() {
		
	}
	
	public String toString() {
		return "\nHospedeiro: " + nome 
				+ "\nE-mail: " + email 
				+ "\nQuarto: " + quarto;
	}
	
	
	
}

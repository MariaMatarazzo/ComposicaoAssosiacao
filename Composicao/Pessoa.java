package RelacionamentoClasse.Composicao;

public class Pessoa {

	private String nome;
	private coracao coracao;// Composição


	// Construtor
	public Pessoa (String nome, int coracao) {
		this. nome = nome;
		this.coracao = new coracao ();
	}

	public String getNome () {
		return nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public int getCoracao () {
			return coracao.getBatimentos () ;

}
}

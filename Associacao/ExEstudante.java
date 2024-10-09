package RelacionamentoClasse.Associacao;

public class ExEstudante {
	
	private String nome;
	private Exuniversidade universidade;

    public ExEstudante (String nome,Exuniversidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }

    public String getNome() {
    	return nome;
    }

    public void setNome (String getNome) {
        this.nome= nome;
    }

}



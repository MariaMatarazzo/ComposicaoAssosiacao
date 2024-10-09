package RelacionamentoClasse.Composicao;

public class MainPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa ("João", 80);
		System.out.println(pessoa.getNome () + " tem a média de " + pessoa.getCoracao () +  "batimentos");
	}
}

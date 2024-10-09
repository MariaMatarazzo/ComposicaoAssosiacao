package RelacionamentoClasse.Associacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exuniversidade universidade = new Exuniversidade("USP");
		
		ExEstudante estudante = new ExEstudante ("João",universidade);
		
		System.out.println("Estudante: "+estudante.getNome()+"\nUniversidade "+universidade.getNome());

	}

}

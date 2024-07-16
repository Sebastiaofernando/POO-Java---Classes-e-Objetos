package introducaoclasses.dominio;
import introducaoclasses.Estudante;
public class EstudanteTeste {
	public static void main(String[] args) {
	
		Estudante estudante = new Estudante();
		estudante.nome = "Sebastião";
		estudante.idade  = 22;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
		
}
}
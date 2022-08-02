import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	
	private Long id;
	private String nome;
	List<Devs> devs = new ArrayList<>();
	
	
	

	public Bootcamp(String nome, List<Devs> devs) {
		
		this.nome = nome;
		this.devs = devs;
	}




	public Bootcamp() {
		// TODO Auto-generated constructor stub
	}

}

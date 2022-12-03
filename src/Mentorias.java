import java.util.ArrayList;
import java.util.List;

public class Mentorias {
	private Long id;
	private String nomeMentoria;
	public Mentorias(String nomeMentoria, Cursos cursos, List<Devs> devs) {
		
		this.nomeMentoria = nomeMentoria;
		this.cursos = cursos;
		this.devs = devs;
	}


	private Cursos cursos;
	List<Devs> devs = new ArrayList<>();
	
	
	public Mentorias() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeMentoria() {
		return nomeMentoria;
	}


	public void setNomeMentoria(String nomeMentoria) {
		this.nomeMentoria = nomeMentoria;
	}


	public Cursos getCursos() {
		return cursos;
	}


	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}


	public List<Devs> getDevs() {
		return devs;
	}


	public void setDevs(List<Devs> devs) {
		this.devs = devs;
	}
	
}

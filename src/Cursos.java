import java.time.LocalDateTime;

public class Cursos {

	private Long id;
	private String nomeCurso;
	private String descricao;
	private LocalDateTime tempo;
	
	
	
	public Cursos(String nomeCurso, String descricao, LocalDateTime tempo) {
		
		this.nomeCurso = nomeCurso;
		this.descricao = descricao;
		this.tempo = tempo;
	}



	public Cursos() {
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNomeCurso() {
		return nomeCurso;
	}



	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public LocalDateTime getTempo() {
		return tempo;
	}



	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}

}

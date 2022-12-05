import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	
	private Long id;
	private String nome;
	private LocalDateTime duracao;
	List<Devs> devs = new ArrayList<>();
	
	
	





	public Bootcamp(String nome, LocalDateTime duracao, List<Devs> devs) {
		
		this.nome = nome;
		this.duracao = duracao;
		this.devs = devs;
	}




	public Bootcamp() {
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public LocalDateTime getDuracao() {
		return duracao;
	}




	public void setDuracao(LocalDateTime duracao) {
		this.duracao = duracao;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public List<Devs> getDevs() {
		return devs;
	}




	public void setDevs(List<Devs> devs) {
		this.devs = devs;
	}

	
}


public class Devs {
	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private String usuario;
	private String senha;
	
	
	
	
	
	
	public Devs(String nome, String email, String cpf, String telefone, String usuario, String senha) {
		
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.usuario = usuario;
		this.senha = senha;
	}


	public Devs() {
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}






	public String getTelefone() {
		return telefone;
	}






	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}






	public String getUsuario() {
		return usuario;
	}






	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}






	public String getSenha() {
		return senha;
	}






	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}

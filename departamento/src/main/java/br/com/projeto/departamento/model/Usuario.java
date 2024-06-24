package br.com.projeto.departamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codUsuario;
	
	
	private String email;
	
	
	private String senha;
	
	
	private String nome;


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Usuario(Integer codUsuario, String email, String senha, String nome) {
		super();
		this.codUsuario = codUsuario;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}


	public Integer getCodUsuario() {
		return codUsuario;
	}


	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", email=" + email + ", senha=" + senha + ", nome=" + nome + "]";
	}
	
	

}

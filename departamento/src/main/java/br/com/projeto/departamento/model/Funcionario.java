package br.com.projeto.departamento.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codFuncionario;
	
	
	private String nomeFuncionario;
	
	
	private LocalDate dataNascimento;
	
	
	private Integer cpf;
	
	
	private Integer rg;
	
	@ManyToOne
	@JoinColumn(name = "cargo_codigo")
	private Cargo cargo;

	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Funcionario(Integer codFuncionario, String nomeFuncionario, LocalDate dataNascimento, Integer cpf,
			Integer rg, Cargo cargo) {
		super();
		this.codFuncionario = codFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.cargo = cargo;
	}


	public Integer getCodFuncionario() {
		return codFuncionario;
	}


	public void setCodFuncionario(Integer codFuncionario) {
		this.codFuncionario = codFuncionario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	public Integer getRg() {
		return rg;
	}


	public void setRg(Integer rg) {
		this.rg = rg;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


	
	
	
}

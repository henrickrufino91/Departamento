package br.com.projeto.departamento.DTO;

import java.time.LocalDate;

import br.com.projeto.departamento.model.Cargo;
import br.com.projeto.departamento.model.Departamento;
import br.com.projeto.departamento.model.Funcionario;

public class FuncionarioDTO {

	
	private Integer codFuncionario;
	
	
	private String nomeFuncionario;
	
	
	private LocalDate dataNascimento;
	
	
	private Cargo cargo;
		
	private Departamento departamento;


	public FuncionarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FuncionarioDTO(Integer codFuncionario, String nomeFuncionario, LocalDate dataNascimento, Cargo cargo,
			Departamento departamento) {
		super();
		this.codFuncionario = codFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.dataNascimento = dataNascimento;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public FuncionarioDTO(Funcionario funcionario) {
		
		this.codFuncionario = funcionario.getCodFuncionario();
		this.nomeFuncionario = funcionario.getNomeFuncionario();
		this.dataNascimento = funcionario.getDataNascimento();
		this.cargo = funcionario.getCargo();
		this.departamento = funcionario.getCargo().getDepartamento();
				
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	
	
		
}

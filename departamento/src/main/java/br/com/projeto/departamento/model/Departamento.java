package br.com.projeto.departamento.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codDepartamento;
	
	
	private String nomeDepartamento;
	
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;


	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Departamento(Integer codDepartamento, String nomeDepartamento, List<Cargo> cargos) {
		super();
		this.codDepartamento = codDepartamento;
		this.nomeDepartamento = nomeDepartamento;
		this.cargos = cargos;
	}
	

	public Integer getCodDepartamento() {
		return codDepartamento;
	}


	public void setCodDepartamento(Integer codDepartamento) {
		this.codDepartamento = codDepartamento;
	}


	public String getNomeDepartamento() {
		return nomeDepartamento;
	}


	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}


	public List<Cargo> getCargos() {
		return cargos;
	}


	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}


	
	
	
}

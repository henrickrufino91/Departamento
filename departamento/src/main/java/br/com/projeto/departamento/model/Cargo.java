package br.com.projeto.departamento.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCargo;
	
	
	private String nomeCargo;
	
		
	private Double salarioCargo;
	
	@ManyToOne
	@JoinColumn(name = "departamento_codigo")
	private Departamento departamento;
	
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;


	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cargo(Integer codCargo, String nomeCargo, Double salarioCargo, Departamento departamento,
			List<Funcionario> funcionarios) {
		super();
		this.codCargo = codCargo;
		this.nomeCargo = nomeCargo;
		this.salarioCargo = salarioCargo;
		this.departamento = departamento;
		this.funcionarios = funcionarios;
	}


	public Integer getCodCargo() {
		return codCargo;
	}


	public void setCodCargo(Integer codCargo) {
		this.codCargo = codCargo;
	}


	public String getNomeCargo() {
		return nomeCargo;
	}


	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}


	public Double getSalarioCargo() {
		return salarioCargo;
	}


	public void setSalarioCargo(Double salarioCargo) {
		this.salarioCargo = salarioCargo;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}


	@Override
	public String toString() {
		return "Cargo [codCargo=" + codCargo + ", nomeCargo=" + nomeCargo + ", salarioCargo=" + salarioCargo
				+ ", departamento=" + departamento + ", funcionarios=" + funcionarios + "]";
	}
	
	
	
}

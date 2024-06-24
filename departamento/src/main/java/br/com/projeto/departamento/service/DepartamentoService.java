package br.com.projeto.departamento.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.departamento.model.Departamento;
import br.com.projeto.departamento.repository.DepartamentoRepository;



@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	
	
	
	public Departamento inserir(Departamento departamento) {
		
		return departamentoRepository.save(departamento);
	}
	
	public List<Departamento> listarDepartamentos(){
		
		return departamentoRepository.findAll();
	}
	
	public Departamento listarPorId(Integer codigo) {
		
		return departamentoRepository.findById(codigo).get();
	}
	
	
	
	public void remover(Departamento departamento) {
		
		departamentoRepository.delete(departamento);
	}
	
		
	
}

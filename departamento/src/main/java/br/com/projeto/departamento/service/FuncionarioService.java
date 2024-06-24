package br.com.projeto.departamento.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.departamento.DTO.FuncionarioDTO;
import br.com.projeto.departamento.model.Funcionario;
import br.com.projeto.departamento.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	
	
	public Funcionario inserir(Funcionario funcionario) {
		
		return funcionarioRepository.save(funcionario);
	}
	
	public List<Funcionario> listarFuncionarios(){
		
		return funcionarioRepository.findAll();
	}
	
	public Funcionario listarPorId(Integer codigo) {
		
		return funcionarioRepository.findById(codigo).get();
	}
	
	
	
	public void remover(Funcionario funcionario) {
		
		funcionarioRepository.delete(funcionario);
	}
	
	
	public FuncionarioDTO listar(Integer codigo) {
		
		Funcionario funcionario = funcionarioRepository.getReferenceById(codigo) ;
		
		FuncionarioDTO dto = new FuncionarioDTO(funcionario);
		
		return dto;
	}
	
	
	public Funcionario editar(Integer codigo) {
		
		  Optional<Funcionario> us = funcionarioRepository.findById(codigo);
			
		  Funcionario funcionario = null;
		  
		  if (us.isPresent()) {
			  
			  funcionario = us.get();
			  
		  }else {
			  
			  throw new RuntimeException(" Funcionario não existe :: " + codigo);
		  }
		  
		  return funcionario;
		}
	
	
	
	
	
	
	
}

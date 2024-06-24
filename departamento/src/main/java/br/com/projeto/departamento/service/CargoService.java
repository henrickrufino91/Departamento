package br.com.projeto.departamento.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.departamento.model.Cargo;
import br.com.projeto.departamento.repository.CargoRepository;


@Service
public class CargoService {

	@Autowired
	private CargoRepository cargoRepository;
	
	
	
	
	public Cargo inserir(Cargo cargo) {
		
		return cargoRepository.save(cargo);
	}
	
	public List<Cargo> listarCargos(){
		
		return cargoRepository.findAll();
	}
	
	public Cargo listarPorId(Integer codigo) {
		
		return cargoRepository.findById(codigo).get();
	}
	
	
	
	public void remover(Cargo cargo) {
		
		cargoRepository.delete(cargo);
	}
	
		
	
}

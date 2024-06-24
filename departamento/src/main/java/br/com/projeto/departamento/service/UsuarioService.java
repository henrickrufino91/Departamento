package br.com.projeto.departamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.departamento.model.Usuario;
import br.com.projeto.departamento.repository.UsuarioRepository;

@Service
public class UsuarioService {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario login(String email,String senha) {
		
		return usuarioRepository.buscarLogin(email, senha);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
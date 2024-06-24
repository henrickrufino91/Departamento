package br.com.projeto.departamento.controller;

import java.security.NoSuchAlgorithmException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.departamento.exception.ServiceEXC;
import br.com.projeto.departamento.model.Usuario;
import br.com.projeto.departamento.service.UsuarioService;
import jakarta.servlet.http.HttpSession;

@RestController
public class UsuarioController {

	
	@Autowired
	private UsuarioService usuarioService;
	
	
	
	@GetMapping(value = "/")
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("usuario", new Usuario());	
		
		return mv;
	}
	
	@GetMapping(value = "/index")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("usuario", new Usuario());	
		
		return mv;
	}
	
	
	
	
	@PostMapping(value = "/logar")
	 public ModelAndView login(@Valid Usuario usuario, BindingResult br,
	                              HttpSession session) throws NoSuchAlgorithmException, ServiceEXC {
	      
		 		 
	        Usuario userLogin = usuarioService.login(usuario.getEmail(), usuario.getSenha());
	       
	       
	        if(userLogin != null) {
	        	
	        	ModelAndView mv = new ModelAndView("index");
	        	        	
	        	session.setAttribute("usuarioLogado", userLogin);
	        	  
	        	return mv;
	        	
	        } else {
	        	
	        	ModelAndView mv = new ModelAndView("login");
	        	
	        	mv.addObject("msg", "Login ou senha está incorreto");
	       
	            return mv;
	        }

	     
	    }
	
	
		@GetMapping("/logout")
		public ModelAndView logout(HttpSession session) {
			
			ModelAndView mv = new ModelAndView("login");
			
			mv.addObject("usuario", new Usuario());
			
			session.invalidate();
        
        return mv;
		}
	
	
	
	
	
	
	
	
	
	
	
	
}

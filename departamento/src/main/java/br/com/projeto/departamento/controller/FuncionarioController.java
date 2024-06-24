package br.com.projeto.departamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.departamento.model.Cargo;
import br.com.projeto.departamento.model.Funcionario;
import br.com.projeto.departamento.service.CargoService;
import br.com.projeto.departamento.service.FuncionarioService;

@RestController

public class FuncionarioController {

	
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private CargoService cargoService;
	
		
	
	
	@GetMapping(value = "/novoFuncionario")
	public ModelAndView novo() {
		
		ModelAndView mv = new ModelAndView("novoFuncionario");
		mv.addObject("funcionario", new Funcionario());
		mv.addObject("carg", cargoService.listarCargos());
		
		return mv;
	}
	
	@PostMapping(value = "/salvarFuncionario")
	public ModelAndView novo(@Valid Funcionario funcionario) {
		
		try {
			
			if (funcionario.getCodFuncionario() == null) {
				funcionarioService.inserir(funcionario);
			} else {
				Funcionario funcionario2 = funcionarioService.listarPorId(funcionario.getCodFuncionario());
				funcionario2.setNomeFuncionario(funcionario.getNomeFuncionario());
				funcionario2.setCpf(funcionario.getCpf());
				funcionario2.setRg(funcionario.getRg());
				funcionario2.setDataNascimento(funcionario.getDataNascimento());
				funcionario2.setCargo(funcionario.getCargo());
			
				funcionarioService.inserir(funcionario2);
				
			}
						
			ModelAndView mv = new ModelAndView("redirect:/novoFuncionario");
			mv.addObject("funcionario", funcionario);
						
			return mv;
			
		} catch (Exception e) {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("msg", "Erro ao inserir funcionario!");
			return mv;
		}
		
	}
	
	
	@GetMapping("/removerFuncionario")
    public ModelAndView remover(@RequestParam Integer codigo){
        
		ModelAndView mv = new ModelAndView("redirect:/listarFuncionarios");
		
		Funcionario funcionario = funcionarioService.listarPorId(codigo);
		funcionarioService.remover(funcionario);
		
        return mv;
    }
	
	
	@GetMapping("/editarFuncionario")
    public ModelAndView editar(@RequestParam Integer codigo){
        
        ModelAndView mv = new ModelAndView("editarFuncionario");
    
        Funcionario funcionario = funcionarioService.listarPorId(codigo);
        mv.addObject("funcionario",  funcionario);
        mv.addObject("carg",  cargoService.listarCargos());
       
        return mv;
   
    }
	
	
	
	
	
	
	
	
	
	@GetMapping(value = "/pesquisar")
	public ModelAndView pesquisa() {
		
		ModelAndView mv = new ModelAndView("pesquisa");
		
		
		return mv;
	}
	
	@PostMapping(value = "/pesquisarPorCodigo")
	public ModelAndView lista(@RequestParam("codigo") Integer codigo) {
		
		ModelAndView mv = new ModelAndView("listaFuncionarios");
		mv.addObject("funcionarios", funcionarioService.listar(codigo));
		mv.addObject("funcionario", new Funcionario());
		
		return mv;
	}
	
	
	@GetMapping("/listarFuncionarios")
    public ModelAndView listar(){
        
        ModelAndView mv = new ModelAndView("listarFuncionarios");
        
        mv.addObject("func",  funcionarioService.listarFuncionarios());
        mv.addObject("funionario",  new Funcionario());
        
        return mv;
   
    }
	
	
	
	
	
	
	
}

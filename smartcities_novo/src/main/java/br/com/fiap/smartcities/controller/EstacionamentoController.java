package br.com.fiap.smartcities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.smartcities.dao.EstacionamentoDAO;
import br.com.fiap.smartcities.entity.Estacionamento;

@Controller
@RequestMapping("estacionamento")
public class EstacionamentoController {
	
	private EstacionamentoDAO dao;


	@GetMapping("cadastrar")
	public String abrirForm(Estacionamento estacionamento) {
		return "estacionamento/cadastro";
		}

	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Estacionamento estacionamento, RedirectAttributes redirect) {
	  try {
		dao.cadastrar(estacionamento);
		System.out.println(estacionamento);
	  }catch(Exception e) {
		  e.printStackTrace();
	    return new ModelAndView("estacionamento/cadastro").addObject("msg", e.getMessage());
	  }
	  redirect.addFlashAttribute("msg", "Estacionamento cadastrado");
	  return new ModelAndView("redirect:/estacionamento/cadastrar");	  
	}


}
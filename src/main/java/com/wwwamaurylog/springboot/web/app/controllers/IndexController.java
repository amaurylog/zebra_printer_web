package com.wwwamaurylog.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.wwwamaurylog.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	// Métodos Handler
	
	// Mapear el Método a una Ruta (Url)
	// Model -- Más utilizada
	// ModelMap
	// Map<String,Object>
	// ModelAndView
	@GetMapping(value = {"/index", "/", "/home"})
	public String index(Model model)
	{
		model.addAttribute("titulo", "Hola Spring Framework");
		model.addAttribute("titulo_h1", "Hola desde el Controller");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model)
	{
		Usuario usuario = new Usuario();
		usuario.setNombre("Alan Amaury");
		usuario.setApellido("Escobedo García");
		//usuario.setEmail("amaury.escobedo29@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de Usuario: " . concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model)
	{
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Alan", "Escobedo", "amaury.escobedo29@gmail.com"));
		usuarios.add(new Usuario("Joshua", "Escobedo", "joshua@gmail.com"));
		usuarios.add(new Usuario("Renata", "Uvario", "renata@gmail.com"));
		usuarios.add(new Usuario("Uriel", "Uvario", "uriel@gmail.com"));
		usuarios.add(new Usuario("Isabela", "Uvario", "isabela@gmail.com"));
		
		model.addAttribute("usuarios", usuarios);
		
		model.addAttribute("titulo", "Listado de Usuarios");
		return "listar";
	}
	
	@RequestMapping("/otralista")
	public String otralista(Model model)
	{		
		model.addAttribute("titulo", "Otro Listado de Usuarios");
		return "otralista";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios()
	{
		List<Usuario> usuarios = Arrays.asList(new Usuario("Isabela", "Uvario", "isabela@gmail.com"),
				new Usuario("Uriel", "Uvario", "uriel@gmail.com"),
				new Usuario("Renata", "Uvario", "renata@gmail.com"),
				new Usuario("Joshua", "Escobedo", "joshua@gmail.com"),
				new Usuario("Alan", "Escobedo", "amaury.escobedo29@gmail.com"));
		
		return usuarios;
	}
	
}

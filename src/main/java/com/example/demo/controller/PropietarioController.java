package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.PropietarioService;

@Controller
@RequestMapping("/propietarios") //debe estar en plural el controlador
public class PropietarioController {
	@Autowired
	private PropietarioService propietarioService;
	
	//http://localhost:8080/concesionario/propietarios/buscar
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Propietario> lista=this.propietarioService.buscarTodos();
		modelo.addAttribute("propietarios",lista);
		return"vistaListaPropietarios";
	}
}

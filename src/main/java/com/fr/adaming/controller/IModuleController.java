package com.fr.adaming.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fr.adaming.dto.ModuleDtoCreate;
import com.fr.adaming.dto.ResponseDto;

@RequestMapping (path = "module/")
public interface IModuleController {
	

	
	
	
	//create module
	@PostMapping
	public ResponseEntity<ResponseDto> create(@RequestBody @Valid ModuleDtoCreate dto);
	
	//read module by id
	@GetMapping (path = "{id}")
	public ResponseEntity<ResponseDto> findById (@PathVariable(name = "id", required = false) int id);
	
	
	//read all
	@GetMapping (path = "all")
	public  ResponseEntity<ResponseDto> findAll();
	
	//update module
	@PutMapping
	public ResponseEntity<ResponseDto> update (@RequestBody @Valid ModuleDtoCreate dto);
		
	//delete module by id
	@DeleteMapping (path = "{id}")
	public ResponseEntity<ResponseDto> deleteById (@PathVariable(name = "id") int id);
	
	

}

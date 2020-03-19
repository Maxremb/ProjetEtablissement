package com.fr.adaming.dto;

import java.util.List;

import com.fr.adaming.entity.Matiere;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ModuleDto {
	private String nom;
	
	private List<Matiere> matiere;

	public ModuleDto(String nom) {
		super();
		this.nom = nom;
	}
	

}

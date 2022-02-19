package com.controllers;

import com.dtos.DogDto;
import com.dtos.VacataireDto;
import com.services.impl.DogServiceImpl;
import com.services.impl.VacataireServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacataires")
public class VacataireController {

	private final VacataireServiceImpl vacataireService;

	public VacataireController(VacataireServiceImpl vacataireService) {
		this.vacataireService = vacataireService;
	}

	/**
	 * <p>Get all vacataires in the system</p>
	 * @return List<VacataireDto>
	 */
	@GetMapping
	public List<VacataireDto> getVacataires() {
		return vacataireService.getAllVacataires();
	}

	/**
	 * Method to get the vacataire based on the ID
	 */
	@GetMapping("/{id}")
	public VacataireDto getVacataire(@PathVariable Long id){
		return vacataireService.getVacataireById(id);
	}

	/**
	 * Create a new Vacataire in the system
	 */
	@PostMapping
	public VacataireDto saveVacataire(final @RequestBody VacataireDto vacataireDto){
		return vacataireService.saveVacataire(vacataireDto);
	}

	/**
	 * Delete a vacataire by it's id
	 */
	@DeleteMapping("/{id}")
	public Boolean deleteVacataire(@PathVariable Long id){
		return vacataireService.deleteVacataire(id);
	}
	
}

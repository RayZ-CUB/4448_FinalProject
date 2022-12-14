package com.zr.librarymanagementsystem.controller;

import java.util.List;

import com.zr.librarymanagementsystem.entity.Region;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zr.librarymanagementsystem.service.RegionService;

@Controller
public class RegionController {

	private final RegionService regionService;

	public RegionController(RegionService regionService) {
		this.regionService = regionService;
	}

	@RequestMapping("/regions")
	public String findAllRegions(Model model) {
		final List<Region> regions = regionService.findAllRegions();

		model.addAttribute("regions", regions);
		return "list-regions";
	}

	@RequestMapping("/region/{id}")
	public String findRegionById(@PathVariable("id") Long id, Model model) {
		final Region region = regionService.findRegionById(id);

		model.addAttribute("region", region);
		return "list-regions";
	}

	@GetMapping("/addRegion")
	public String showCreateForm(Region region) {
		return "add-region";
	}

	@RequestMapping("/add-region")
	public String createRegion(Region region, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-region";
		}

		regionService.createRegion(region);
		model.addAttribute("region", regionService.findAllRegions());
		return "redirect:/regions";
	}

	@GetMapping("/updateRegion/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
		final Region region = regionService.findRegionById(id);

		model.addAttribute("region", region);
		return "update-region";
	}

	@RequestMapping("/update-region/{id}")
	public String updateRegion(@PathVariable("id") Long id, Region region, BindingResult result, Model model) {
		if (result.hasErrors()) {
			region.setId(id);
			return "update-regions";
		}

		regionService.updateRegion(region);
		model.addAttribute("region", regionService.findAllRegions());
		return "redirect:/regions";
	}

	@RequestMapping("/remove-region/{id}")
	public String deleteRegion(@PathVariable("id") Long id, Model model) {
		regionService.deleteRegion(id);

		model.addAttribute("region", regionService.findAllRegions());
		return "redirect:/regions";
	}

}

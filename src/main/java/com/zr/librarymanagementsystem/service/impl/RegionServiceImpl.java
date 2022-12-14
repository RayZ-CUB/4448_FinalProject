package com.zr.librarymanagementsystem.service.impl;

import java.util.List;

import com.zr.librarymanagementsystem.entity.Region;
import com.zr.librarymanagementsystem.exception.NotFoundException;
import com.zr.librarymanagementsystem.repository.RegionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zr.librarymanagementsystem.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService {

	private final RegionRepository regionRepository;

	public RegionServiceImpl(RegionRepository regionRepository) {
		this.regionRepository = regionRepository;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Region> findAllRegions() {
		return regionRepository.findAll();
	}

	@Override
	public Region findRegionById(Long id) {
		return regionRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Region not found  with ID %d", id)));
	}

	@Override
	public void createRegion(Region region) {
		regionRepository.save(region);
	}

	@Override
	public void updateRegion(Region region) {
		regionRepository.save(region);
	}

	@Override
	public void deleteRegion(Long id) {
		final Region region = regionRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Region not found  with ID %d", id)));

		regionRepository.deleteById(region.getId());
	}

}

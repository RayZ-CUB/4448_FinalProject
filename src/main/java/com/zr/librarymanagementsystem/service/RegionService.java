package com.zr.librarymanagementsystem.service;

import java.util.List;

import com.zr.librarymanagementsystem.entity.Region;

public interface RegionService {

	public List<Region> findAllRegions();

	public Region findRegionById(Long id);

	public void createRegion(Region region);

	public void updateRegion(Region region);

	public void deleteRegion(Long id);

}

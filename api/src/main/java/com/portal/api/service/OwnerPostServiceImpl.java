package com.portal.api.service;

import com.portal.api.dto.OwnerPostDTO;

public class OwnerPostServiceImpl implements OwnerPostService {

    private final CarPostStoreService carPostStoreService;

    public OwnerPostServiceImpl(CarPostStoreService carPostStoreService) {
        this.carPostStoreService = carPostStoreService;
    }

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDto) {
        carPostStoreService.ownerPostsClient(ownerPostDto);
    }
}

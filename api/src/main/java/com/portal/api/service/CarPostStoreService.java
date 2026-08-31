package com.portal.api.service;

import com.portal.api.dto.CarPostDTO;
import com.portal.api.dto.OwnerPostDTO;

import java.util.List;

public interface CarPostStoreService {
    List<CarPostDTO> getCarForSales();

    public void ownerPostsClient(OwnerPostDTO newUser);

    void changeCarForSale(CarPostDTO carPost, String id);

    void removeCarForSale(String id);
}

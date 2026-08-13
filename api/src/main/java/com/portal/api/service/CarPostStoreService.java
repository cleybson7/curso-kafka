package com.portal.api.service;

import com.portal.api.dto.CarPostDto;

import java.util.List;

public interface CarPostStoreService {
    List<CarPostDto> getCarForSales();

    void changeCarForSale(CarPostDto carPost, String id);

    void removeCarForSale(String id);
}

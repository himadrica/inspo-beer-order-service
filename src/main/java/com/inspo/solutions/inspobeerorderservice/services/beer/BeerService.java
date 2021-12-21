package com.inspo.solutions.inspobeerorderservice.services.beer;

import com.inspo.solutions.inspobeerorderservice.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {
    Optional<BeerDto> getBeerById(UUID uuid);
    Optional<BeerDto> getBeerByUpc(String upc);
}

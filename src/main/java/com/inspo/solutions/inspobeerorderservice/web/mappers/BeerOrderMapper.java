package com.inspo.solutions.inspobeerorderservice.web.mappers;

import com.inspo.solutions.inspobeerorderservice.domain.BeerOrder;
import com.inspo.solutions.inspobeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
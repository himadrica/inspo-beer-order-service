package com.inspo.solutions.inspobeerorderservice.web.mappers;

import com.inspo.solutions.inspobeerorderservice.domain.BeerOrderLine;
import com.inspo.solutions.inspobeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}

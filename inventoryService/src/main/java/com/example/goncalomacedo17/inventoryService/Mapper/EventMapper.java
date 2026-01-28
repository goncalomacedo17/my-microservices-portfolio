package com.example.goncalomacedo17.inventoryService.Mapper;

import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy  = NullValuePropertyMappingStrategy.IGNORE)
public interface EventMapper {

}

package com.example.goncalomacedo17.inventoryService.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.goncalomacedo17.inventoryService.Domain.Venue;
import com.example.goncalomacedo17.inventoryService.Model.VenueInventoryResponseDto;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy  = NullValuePropertyMappingStrategy.IGNORE)
public interface VenueMapper {

    VenueInventoryResponseDto toDto(Venue venue);
}

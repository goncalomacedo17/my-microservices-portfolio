package com.example.goncalomacedo17.inventoryService.Mapper;

import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.goncalomacedo17.inventoryService.Domain.Event;
import com.example.goncalomacedo17.inventoryService.Model.EventInventoryResponseDto;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy  = NullValuePropertyMappingStrategy.IGNORE)
public interface EventMapper {

    EventInventoryResponseDto toDto(Event event);

    List<EventInventoryResponseDto> toDtos(List<Event> events);
}

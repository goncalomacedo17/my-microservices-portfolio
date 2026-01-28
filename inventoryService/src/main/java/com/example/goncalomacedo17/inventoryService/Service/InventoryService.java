package com.example.goncalomacedo17.inventoryService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.goncalomacedo17.inventoryService.Domain.Event;
import com.example.goncalomacedo17.inventoryService.Model.EventInventoryResponseDto;
import com.example.goncalomacedo17.inventoryService.Repository.EventRepository;
import com.example.goncalomacedo17.inventoryService.Repository.VenueRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final EventRepository eventRepository;
    private final VenueRepository venueRepository;
    
    private final EventMapper eventMapper;
    
    public List<EventInventoryResponseDto> getAllEvents() {
        List<Event> events = eventRepository.findAll();

        return eventMapper.toDtos(events);
    }

}

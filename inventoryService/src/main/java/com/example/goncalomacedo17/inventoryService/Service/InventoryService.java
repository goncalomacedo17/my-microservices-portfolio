package com.example.goncalomacedo17.inventoryService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.goncalomacedo17.inventoryService.Domain.Event;
import com.example.goncalomacedo17.inventoryService.Domain.Venue;
import com.example.goncalomacedo17.inventoryService.Mapper.EventMapper;
import com.example.goncalomacedo17.inventoryService.Mapper.VenueMapper;
import com.example.goncalomacedo17.inventoryService.Model.EventInventoryResponseDto;
import com.example.goncalomacedo17.inventoryService.Model.VenueInventoryResponseDto;
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
    private final VenueMapper venueMapper;
    
    public List<EventInventoryResponseDto> getAllEvents() {
        List<Event> events = eventRepository.findAll();

        return eventMapper.toDtos(events);
    }

    public VenueInventoryResponseDto getVenueInformation(Long venueId) {
        Optional<Venue> venue = venueRepository.findById(venueId);

        if(venue.isPresent()) return venueMapper.toDto(venue.get());
        else throw new UnsupportedOperationException();
    }

    public EventInventoryResponseDto getEventInventory(final Long eventId) {
        Event event = eventRepository.findById(eventId).orElse(null);
        return EventInventoryResponseDto.builder()
                .name(event.getName())
                .totalCapacity(event.getTotalCapacity())
                .leftCapacity(event.getLeftCapacity())
                .venue(event.getVenue())
                .ticketPrice(event.getTicketPrice())
                .eventId(event.getId())
                .build();
    }
}

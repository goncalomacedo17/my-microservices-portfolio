package com.example.goncalomacedo17.inventoryService.Model;

import java.math.BigDecimal;

import com.example.goncalomacedo17.inventoryService.Domain.Venue;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventInventoryResponseDto {

    private Long eventId;
    private String name;
    private Long totalCapacity;
    private Long leftCapacity;
    private Venue venue;
    private BigDecimal ticketPrice;

}

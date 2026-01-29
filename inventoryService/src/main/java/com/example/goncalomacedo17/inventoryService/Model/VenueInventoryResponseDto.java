package com.example.goncalomacedo17.inventoryService.Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VenueInventoryResponseDto {

    private String name;
    private String address;
    private Long totalCapacity;
}

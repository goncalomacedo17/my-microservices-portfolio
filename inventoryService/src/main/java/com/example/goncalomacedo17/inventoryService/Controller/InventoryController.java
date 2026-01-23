package com.example.goncalomacedo17.inventoryService.Controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.goncalomacedo17.inventoryService.Model.EventInventoryResponseDto;
import com.example.goncalomacedo17.inventoryService.Service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/events")
    public List<EventInventoryResponseDto> getAllEvents(){
        return inventoryService.getAllEvents();
    }
}

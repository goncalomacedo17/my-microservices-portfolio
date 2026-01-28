package com.example.goncalomacedo17.inventoryService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.goncalomacedo17.inventoryService.Domain.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long>{

}

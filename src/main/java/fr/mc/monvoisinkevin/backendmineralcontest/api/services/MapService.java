package fr.mc.monvoisinkevin.backendmineralcontest.api.services;

import fr.mc.monvoisinkevin.backendmineralcontest.api.dtos.MapDTO;

import java.util.List;

/**
 * Service used to retrieve every maps.
 */
public interface MapService {

    public List<MapDTO> findAll();

}

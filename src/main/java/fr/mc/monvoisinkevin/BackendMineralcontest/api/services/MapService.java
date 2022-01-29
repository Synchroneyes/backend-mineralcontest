package fr.mc.monvoisinkevin.BackendMineralcontest.api.services;

import fr.mc.monvoisinkevin.BackendMineralcontest.api.dtos.MapDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service used to retrieve every maps.
 */
public interface MapService {

    public List<MapDTO> findAll();

}

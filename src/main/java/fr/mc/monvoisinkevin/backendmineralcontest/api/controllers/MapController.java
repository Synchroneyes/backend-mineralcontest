package fr.mc.monvoisinkevin.backendmineralcontest.api.controllers;

import fr.mc.monvoisinkevin.backendmineralcontest.api.dtos.MapDTO;
import fr.mc.monvoisinkevin.backendmineralcontest.api.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/map")
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping(value = "/all")
    public List<MapDTO> getAllMaps(){
        return mapService.findAll();
    }
}

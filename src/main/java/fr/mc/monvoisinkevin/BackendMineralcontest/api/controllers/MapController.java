package fr.mc.monvoisinkevin.BackendMineralcontest.api.controllers;

import fr.mc.monvoisinkevin.BackendMineralcontest.api.dtos.MapDTO;
import fr.mc.monvoisinkevin.BackendMineralcontest.api.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/map")
public class MapController {

    @Autowired
    private MapService mapService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<MapDTO> getAllMaps(){
        return mapService.findAll();
    }
}

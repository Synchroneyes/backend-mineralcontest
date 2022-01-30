package fr.mc.monvoisinkevin.backendmineralcontest.api.services.impl;

import fr.mc.monvoisinkevin.backendmineralcontest.api.dtos.MapDTO;
import fr.mc.monvoisinkevin.backendmineralcontest.api.services.MapService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MapServiceImpl implements MapService {


    @Override
    public List<MapDTO> findAll() {

        ArrayList<MapDTO> list = new ArrayList<>();
        MapDTO map = new MapDTO();

        map.setMapName("Ma Map");
        map.setMapSize(12471545184L);
        map.setMapUrl("http://lol/fr");
        map.setMapFolderName("folderName");
        map.setMapFileName("map.zip");
        map.setMapSizeDisplay("1234Mo");
        map.setMapDescription("Description");

        list.add(map);

        map.setMapName("Ma Map");
        map.setMapSize(12471545184L);
        map.setMapUrl("http://lol/fr");
        map.setMapFolderName("folderName");
        map.setMapFileName("map.zip");
        map.setMapSizeDisplay("1234Mo");
        map.setMapDescription("Description");

        list.add(map);
        return list;
    }
}

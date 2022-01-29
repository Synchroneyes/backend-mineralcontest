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

        map.setMap_name("Ma Map");
        map.setMap_size(12471545184L);
        map.setMap_url("http://lol/fr");
        map.setMap_folder_name("folderName");
        map.setMap_file_name("map.zip");
        map.setMap_size_display("1234Mo");
        map.setMap_description("Description");

        list.add(map);

        map.setMap_name("Ma Map");
        map.setMap_size(12471545184L);
        map.setMap_url("http://lol/fr");
        map.setMap_folder_name("folderName");
        map.setMap_file_name("map.zip");
        map.setMap_size_display("1234Mo");
        map.setMap_description("Description");

        list.add(map);
        return list;
    }
}

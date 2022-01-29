package fr.mc.monvoisinkevin.BackendMineralcontest.api.dtos;

import lombok.Data;

@Data
public class MapDTO {


    private String map_name;

    private String map_url;

    private String map_description;

    private String map_size_display;

    private Long map_size;

    private String map_file_name;

    private String map_folder_name;


}

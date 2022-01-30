package fr.mc.monvoisinkevin.backendmineralcontest.api.dtos;

import lombok.Data;

@Data
public class MapDTO {


    private String mapName;

    private String mapUrl;

    private String mapDescription;

    private String mapSizeDisplay;

    private Long mapSize;

    private String mapFileName;

    private String mapFolderName;


}

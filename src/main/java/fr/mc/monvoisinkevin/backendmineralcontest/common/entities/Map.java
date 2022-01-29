package fr.mc.monvoisinkevin.backendmineralcontest.common.entities;

import lombok.Data;

/**
 * This class is being used to represent a Map.
 */
@Data
public class Map {

    private Long id;

    private String mapName;

    private String mapUrl;

    private String mapDescription;

    private Long mapSize;

    private String mapFileName;

    private String mapFolderName;



}

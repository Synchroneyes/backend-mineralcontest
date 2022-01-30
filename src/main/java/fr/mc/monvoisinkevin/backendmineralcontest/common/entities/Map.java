package fr.mc.monvoisinkevin.backendmineralcontest.common.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is being used to represent a Map.
 */
@Data
@Entity
public class Map {

    @Id
    private Long id;

    private String mapName;

    private String mapUrl;

    private String mapDescription;

    private Long mapSize;

    private String mapFileName;

    private String mapFolderName;



}

package fr.mc.monvoisinkevin.backendmineralcontest.common.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
/**
 * This class is used to define the user that will browse the website
 */
public class User {

    @Id
    private Long id;

    private String email;

    private String password;

    private String username;

    private boolean acceptsToReceiveMails;

    private boolean accountVerified;

    @ManyToOne(targetEntity = UserRole.class)
    private UserRole role;

}



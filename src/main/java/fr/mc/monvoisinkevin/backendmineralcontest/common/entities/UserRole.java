package fr.mc.monvoisinkevin.backendmineralcontest.common.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
/**
 * This class is used to define a user role.
 * User role should have an GID (Group ID).
 * The lower, the highest privileges it has
 */
public class UserRole {

    @Id
    private Long id;

    private Long groupId;

    private String groupName;

    private String description;

    @OneToMany(mappedBy = "role")
    private Set<User> users;
}

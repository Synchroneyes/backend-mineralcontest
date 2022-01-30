package fr.mc.monvoisinkevin.backendmineralcontest.common.repositories;

import fr.mc.monvoisinkevin.backendmineralcontest.common.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}

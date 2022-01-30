package fr.mc.monvoisinkevin.backendmineralcontest.common.repositories;

import fr.mc.monvoisinkevin.backendmineralcontest.common.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

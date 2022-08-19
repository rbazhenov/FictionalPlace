package world.food.fictionalplace.menu.kitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.food.fictionalplace.menu.kitchen.domain.Soup;

@Repository
public interface SoupRepository extends JpaRepository<Soup, Long> {
}

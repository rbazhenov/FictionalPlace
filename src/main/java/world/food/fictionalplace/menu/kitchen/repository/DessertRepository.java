package world.food.fictionalplace.menu.kitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.food.fictionalplace.menu.kitchen.domain.Dessert;

@Repository
public interface DessertRepository extends JpaRepository<Dessert, Long> {
}

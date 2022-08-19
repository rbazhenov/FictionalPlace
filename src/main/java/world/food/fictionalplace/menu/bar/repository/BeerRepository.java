package world.food.fictionalplace.menu.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.food.fictionalplace.menu.bar.domain.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
}

package world.food.fictionalplace.menu.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.food.fictionalplace.menu.bar.domain.Cocktail;

@Repository
public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
}

package world.food.fictionalplace.menu.kitchen.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(Soup.FOOD_KIND_DISCRIMINATOR)
@Table(name = Soup.TABLE_NAME)
public class Soup extends AbstractFood {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "food_soup";

    /**
     * Значение идентификатора, означающего, что хранимое значение - вид блюда.
     *
     * @see AbstractFood.ColumnName#AF_CN_DISCRIMINATOR
     */
    public static final String FOOD_KIND_DISCRIMINATOR = "soup";

    /**
     * Класс констант, содержащих наименования колонок {@link Soup#TABLE_NAME}.
     */
    static class ColumnName {
    }
}

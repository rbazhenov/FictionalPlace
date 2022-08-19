package world.food.fictionalplace.menu.kitchen.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Дессерт.
 */
@Entity
@DiscriminatorValue(Dessert.FOOD_KIND_DISCRIMINATOR)
@Table(name = Dessert.TABLE_NAME)
public class Dessert extends AbstractFood {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "food_dessert";

    /**
     * Значение идентификатора, означающего, что хранимое значение - вид блюда.
     *
     * @see AbstractFood.ColumnName#AF_CN_DISCRIMINATOR
     */
    public static final String FOOD_KIND_DISCRIMINATOR = "dessert";

    /**
     * Класс констант, содержащих наименования колонок {@link Dessert#TABLE_NAME}.
     */
    static class ColumnName {
    }
}

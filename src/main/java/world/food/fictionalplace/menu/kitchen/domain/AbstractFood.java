package world.food.fictionalplace.menu.kitchen.domain;

import world.food.fictionalplace.dictionary.DishOrder;
import world.food.fictionalplace.menu.domain.AbstractItem;

import javax.persistence.*;

/**
 * Базовый класс для еды.
 */
@Entity
@Table(name = AbstractFood.TABLE_NAME)
public abstract class AbstractFood extends AbstractItem {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "food_common";

    /**
     * Класс констант, содержащих наименования колонок {@link AbstractFood#TABLE_NAME}.
     */
    static class ColumnName {

        /**
         * {@link AbstractFood#id}.
         */
        public static final String AF_CN_ID = "id";

        /**
         * {@link AbstractFood#isSpicy}.
         */
        public static final String AF_CN_IS_SPICY = "is_spicy";

        /**
         * {@link AbstractFood#dishOrder}.
         */
        public static final String AF_CN_DISH_ORDER = "dish_order";

    }

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.AF_CN_ID, nullable = false)
    private Long id;

    /**
     * Острота.
     * <p/>
     * true - острая, false - неострая.
     */
    @Column(name = ColumnName.AF_CN_IS_SPICY)
    protected boolean isSpicy;

    /**
     * Номер блюда.
     */
    @Column(name = ColumnName.AF_CN_DISH_ORDER)
    protected DishOrder dishOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public DishOrder getDishOrder() {
        return dishOrder;
    }

    public void setDishOrder(DishOrder dishOrder) {
        this.dishOrder = dishOrder;
    }
}

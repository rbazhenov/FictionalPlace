package world.food.fictionalplace.menu.kitchen.domain;

import javax.persistence.*;

/**
 * Базовый класс для еды.
 */
@Entity
@Table(name = AbstractFood.TABLE_NAME)
public abstract class AbstractFood {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "food_common";
    /**
     * Название.
     */
    @Column(name = ColumnName.AF_CN_NAME)
    protected String name;
    /**
     * Цена.
     */
    @Column(name = ColumnName.AF_CN_PRICE)
    protected Double price;
    /**
     * Острота.
     * <p/>
     * true - острая, false - неострая.
     */
    @Column(name = ColumnName.AF_CN_IS_SPICY)
    protected boolean isSpicy;
    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.AF_CN_ID, nullable = false)
    private Long id;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

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
         * {@link AbstractFood#name}.
         */
        public static final String AF_CN_NAME = "name";

        /**
         * {@link AbstractFood#price}.
         */
        public static final String AF_CN_PRICE = "price";

    }
}

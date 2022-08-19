package world.food.fictionalplace.menu.bar.domain;

import javax.persistence.*;

/**
 * Коктейл.
 */
@Entity
@Table(name = Cocktail.TABLE_NAME)
public class Cocktail extends AbstractDrink {

    /**
     * Наименование таблицы хранения.
     */
    public final static String TABLE_NAME = "drink_cocktail";

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.C_CN_ID, nullable = false)
    protected Long id;

    /**
     * Цвет.
     */
    @Column(name = ColumnName.C_CN_COLOR)
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Класс констант, содержащих наименования колонок {@link Cocktail#TABLE_NAME}.
     */
    static class ColumnName {
        /**
         * {@link Cocktail#id}.
         */
        public static final String C_CN_ID = "id";

        /**
         * {@link Cocktail#color}.
         */
        public static final String C_CN_COLOR = "color";
    }
}

package world.food.fictionalplace.menu.bar.domain;

import javax.persistence.*;

/**
 * Чай.
 */
@Entity
@Table(name = Tee.TABLE_NAME)
public class Tee extends AbstractDrink {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "drink_tee";

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.T_CN_ID, nullable = false)
    private Long id;

    /**
     * Цвет.
     */
    @Column(name = ColumnName.T_CN_COLOR)
    private String color;

    /**
     * Количество сахара.
     */
    @Column(name = ColumnName.T_CN_SUGAR_AMOUNT)
    private int sugarAmount;

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

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    /**
     * Класс констант, содержащих наименования колонок {@link Tee#TABLE_NAME}.
     */
    static class ColumnName {

        /**
         * {@link Tee#id}.
         */
        public static final String T_CN_ID = "id";

        /**
         * {@link Tee#color}.
         */
        public static final String T_CN_COLOR = "color";
        /**
         * {@link Tee#sugarAmount}.
         */
        public static final String T_CN_SUGAR_AMOUNT = "sugar_amount";
    }
}

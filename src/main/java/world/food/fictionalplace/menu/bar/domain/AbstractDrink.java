package world.food.fictionalplace.menu.bar.domain;

import world.food.fictionalplace.menu.domain.AbstractItem;

import javax.persistence.*;

/**
 * Базовый класс для напитков.
 */
@Entity
@Table(name = AbstractDrink.TABLE_NAME)
public abstract class AbstractDrink extends AbstractItem {

    /**
     * Наименование таблицы.
     */
    public static final String TABLE_NAME = "drink_common";

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.AD_CN_ID, nullable = false)
    private Long id;

    /**
     * Количество алкоголя.
     */
    @Column(name = ColumnName.AD_CN_ALCOHOL_AMOUNT)
    protected double alcoholAmount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAlcoholAmount() {
        return alcoholAmount;
    }

    public void setAlcoholAmount(double alcoholAmount) {
        this.alcoholAmount = alcoholAmount;
    }


    /**
     * Класс констант, содержащих наименования колонок {@link AbstractDrink#TABLE_NAME}.
     */
    static class ColumnName {
        /**
         * {@link AbstractDrink#id}.
         */
        public static final String AD_CN_ID = "id";

        /**
         * {@link AbstractDrink#alcoholAmount}.
         */
        public static final String AD_CN_ALCOHOL_AMOUNT = "alcohol_amount";
    }
}

package world.food.fictionalplace.menu.bar.domain;

import javax.persistence.*;

import static javax.persistence.InheritanceType.JOINED;

/**
 * Базовый класс для напитков.
 */
@Entity
@Inheritance(strategy = JOINED)
@DiscriminatorColumn(name = AbstractDrink.ColumnName.AD_CN_DISCRIMINATOR, length = 32)
@Table(name = AbstractDrink.TABLE_NAME)
public abstract class AbstractDrink {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "drink_common";
    /**
     * Название.
     */
    @Column(name = ColumnName.AD_CN_NAME)
    protected String name;
    /**
     * Цена.
     */
    @Column(name = ColumnName.AD_CN_PRICE)
    protected Double price;
    /**
     * Количество алкоголя.
     */
    @Column(name = ColumnName.AD_CN_ALCOHOL_AMOUNT)
    protected double alcoholAmount;
    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.AD_CN_ID, nullable = false)
    private Long id;

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
     * Класс констант, содержащих наименования колонок {@link AbstractDrink#TABLE_NAME}.
     */
    static class ColumnName {

        /**
         * Колонка, в которой хранится идентификатор модели напитка.
         */
        public static final String AD_CN_DISCRIMINATOR = "dtype";

        /**
         * {@link AbstractDrink#id}.
         */
        public static final String AD_CN_ID = "id";

        /**
         * {@link AbstractDrink#alcoholAmount}.
         */
        public static final String AD_CN_ALCOHOL_AMOUNT = "alcohol_amount";

        /**
         * {@link AbstractDrink#name}.
         */
        public static final String AD_CN_NAME = "name";

        /**
         * {@link AbstractDrink#price}.
         */
        public static final String AD_CN_PRICE = "price";
    }
}

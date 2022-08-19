package world.food.fictionalplace.menu.bar.domain;

import world.food.fictionalplace.dictionary.domain.ColorDict;

import javax.persistence.*;

/**
 * Коктейл.
 */
@Entity
@DiscriminatorValue(Cocktail.DRINK_KIND_DISCRIMINATOR)
@Table(name = Cocktail.TABLE_NAME)
public class Cocktail extends AbstractDrink {

    /**
     * Наименование таблицы хранения.
     */
    public final static String TABLE_NAME = "drink_cocktail";

    /**
     * Значение идентификатора, означающего, что хранимое значение - вид напитка.
     *
     * @see AbstractDrink.ColumnName#AD_CN_DISCRIMINATOR
     */
    public static final String DRINK_KIND_DISCRIMINATOR = "cocktail";

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
    @ManyToOne
    @JoinColumn(name = ColumnName.C_CN_COLOR)
    private ColorDict color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ColorDict getColor() {
        return color;
    }

    public void setColor(ColorDict color) {
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
        public static final String C_CN_COLOR = "color_id";
    }
}

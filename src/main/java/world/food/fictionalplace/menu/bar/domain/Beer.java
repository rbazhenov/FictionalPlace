package world.food.fictionalplace.menu.bar.domain;

import javax.persistence.*;

/**
 * Пиво.
 */
@Entity
@DiscriminatorValue(Beer.DRINK_KIND_DISCRIMINATOR)
@Table(name = Beer.TABLE_NAME)
public class Beer extends AbstractDrink {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "drink_beer";

    /**
     * Значение идентификатора, означающего, что хранимое значение - вид напитка.
     *
     * @see AbstractDrink.ColumnName#AD_CN_DISCRIMINATOR
     */
    public static final String DRINK_KIND_DISCRIMINATOR = "beer";

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.B_CN_ID, nullable = false)
    private Long id;

    /**
     * Является ли фильтрованным.
     * <p/>
     * true - да, false - нет.
     */
    @Column(name = ColumnName.B_CN_IS_FILTERED)
    private boolean isFiltered;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isFiltered() {
        return isFiltered;
    }

    public void setFiltered(boolean filtered) {
        isFiltered = filtered;
    }

    /**
     * Класс констант, содержащих наименования колонок {@link Beer#TABLE_NAME}.
     */
    static class ColumnName {
        /**
         * {@link Beer#id}.
         */
        public static final String B_CN_ID = "id";

        /**
         * {@link Beer#isFiltered}.
         */
        public static final String B_CN_IS_FILTERED = "is_filtered";
    }
}

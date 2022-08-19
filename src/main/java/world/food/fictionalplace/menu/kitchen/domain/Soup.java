package world.food.fictionalplace.menu.kitchen.domain;

import javax.persistence.*;

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
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.S_CN_ID, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Класс констант, содержащих наименования колонок {@link Soup#TABLE_NAME}.
     */
    static class ColumnName {

        /**
         * {@link Soup#id}.
         */
        public static final String S_CN_ID = "id";
    }
}

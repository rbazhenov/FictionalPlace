package world.food.fictionalplace.menu.kitchen.domain;

import javax.persistence.*;

/**
 * Дессерт.
 */
@Entity
@Table(name = Dessert.TABLE_NAME)
public class Dessert extends AbstractFood {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "food_dessert";

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.D_CN_ID, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Класс констант, содержащих наименования колонок {@link Dessert#TABLE_NAME}.
     */
    static class ColumnName {

        /**
         * {@link Dessert#id}.
         */
        public static final String D_CN_ID = "id";
    }
}

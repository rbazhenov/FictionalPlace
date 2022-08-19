package world.food.fictionalplace.dictionary.domain;

import javax.persistence.*;

@Entity
@Table
public class ColorDict {

    /**
     * Наименование таблицы хранения.
     */
    public static final String TABLE_NAME = "dict_color";

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ColumnName.CD_CN_ID, nullable = false)
    private Long id;

    /**
     * Наименование.
     */
    @Column(name = ColumnName.CD_CN_NAME)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Класс констант, содержащий наименования колонок {@link ColorDict#TABLE_NAME}.
     */
    static class ColumnName{
        /**
         * {@link ColorDict#id}
         */
        public static final String CD_CN_ID = "id";
        public static final String CD_CN_NAME = "name";
    }
}

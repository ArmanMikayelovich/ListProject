package am.aca.list.entityes;

import javax.persistence.*;

@Entity
@Table(name = "Categoryes")
public class CategoryEntity {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "category_id_seq")
    @SequenceGenerator(name = "category_id_seq",catalog = "category_seq")
    private int caregoryId;
    @OneToMany
    @JoinColumn()
    @Column(name = "category_name",unique = true)
    private String categoryName;



    public int getCaregoryId() {
        return caregoryId;
    }

    public void setCaregoryId(int caregoryId) {
        this.caregoryId = caregoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}

package am.aca.list.entityes;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Table(name = "Categoryes")
public class CategoryEntity {

    public CategoryEntity() {

    }

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caregoryId;
    @Column(name = "category_name",unique = true)
    private String categoryName;

    @ManyToOne
    private CategoryGroupEntity categoryGroupEntity;





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

    @Override
    public String toString() {
        return "\nCategoryEntity{" +
                "caregoryId=" + caregoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

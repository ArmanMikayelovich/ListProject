package am.aca.list.entityes;

import javax.persistence.*;

@Entity
@Table(name = "Categoryes")
public class CategoryEntity {
    @Id
    @Column(name = "category_id")


    private int caregoryId;

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

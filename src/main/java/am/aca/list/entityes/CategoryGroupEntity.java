package am.aca.list.entityes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoryGroup")
public class CategoryGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @Column
    private String name;

    public CategoryGroupEntity() {
    }
    @OneToMany(mappedBy = "categoryGroupEntity",fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CategoryEntity> categoryes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryEntity> getCategoryes() {
        return categoryes;
    }

    public void setCategoryes(List<CategoryEntity> categoryes) {
        this.categoryes = categoryes;
    }
}

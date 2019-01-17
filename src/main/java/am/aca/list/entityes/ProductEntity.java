package am.aca.list.entityes;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Products")
public class ProductEntity {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int productId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @ManyToOne
    private UserEntity userEntity;

    public UserEntity getUser() {
        return userEntity;
    }

    public void setUser(UserEntity user) {
        this.userEntity = user;
    }

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @OneToMany(mappedBy = "productEntity",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ImageEntity> imgList;

    @Column(name = "create_date")
    private Date create_date;

    @Column(name = "title")
    private String title;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public CategoryEntity getCategory() {
        return categoryEntity;
    }

    public void setCategory(CategoryEntity category) {
        this.categoryEntity = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<ImageEntity> getImgList() {
        return imgList;
    }

    public void setImgList(List<ImageEntity> imgList) {
        this.imgList = imgList;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nProductEntity{" +
                "productId=" + productId +
                ", categoryEntity=" + categoryEntity +
                ", userEntity=" + userEntity +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imgList=" + imgList +
                ", create_date=" + create_date +
                ", title='" + title + '\'' +
                '}';
    }
}

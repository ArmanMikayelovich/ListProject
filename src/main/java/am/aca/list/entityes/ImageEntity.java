package am.aca.list.entityes;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Images")
public class ImageEntity {

    public ImageEntity() {
    }

    @Id
    @Column(name = "img_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }




    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @ManyToOne
    private ProductEntity productEntity;

    @Column(name = "img_source")
    private String imgSource;

    public ProductEntity getProduct() {
        return productEntity;
    }

    public void setProduct(ProductEntity product) {
        this.productEntity = product;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    @Override
    public String toString() {
        return "\nImageEntity{" +
                "imageId=" + imageId +
                ", productEntity=" + productEntity.getProductId() +
                ", imgSource='" + imgSource + '\'' +
                '}';
    }
}

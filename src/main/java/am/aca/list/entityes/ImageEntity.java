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
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "img_id_seq")
    @SequenceGenerator(name = "img_id_seq",catalog = "img_seq")
    private int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Column(name = "product_id")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @Column(name = "img_source")
    private String imgSource;

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }
}

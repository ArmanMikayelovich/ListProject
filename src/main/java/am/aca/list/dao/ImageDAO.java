package am.aca.list.dao;

import am.aca.list.entityes.ImageEntity;
import am.aca.list.entityes.ProductEntity;
import am.aca.list.entityes.UserEntity;
import am.aca.list.util.HibernateSessionFactory;
import org.hibernate.Session;

import java.util.List;

//DATA ACCESS OBJECT == DAO
public class ImageDAO {
    public static void addImage(ProductEntity product, String imgSource) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ImageEntity image = new ImageEntity();
        image.setImgSource(imgSource);
        image.setProduct(product);
        session.save(image);
        product.getImgList().add(image);
        session.update(product);
//        session.flush();
        session.close();
    }

    public static void deleteImage(ImageEntity image) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.delete(image);
    }

}

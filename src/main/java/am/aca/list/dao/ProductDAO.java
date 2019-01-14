package am.aca.list.dao;

import am.aca.list.entityes.CategoryEntity;
import am.aca.list.entityes.ImageEntity;
import am.aca.list.entityes.ProductEntity;
import am.aca.list.entityes.UserEntity;
import am.aca.list.util.HibernateSessionFactory;
import org.hibernate.Session;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class ProductDAO {
    public static ProductEntity addProduct(UserEntity user, CategoryEntity category, List<ImageEntity> imgSource,
                                  String title, String description, int price ) {
        ProductEntity product = new ProductEntity();
        product.setUser(user);
        product.setCategory(category);
        product.setImgList(imgSource);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setCreate_date(new java.sql.Date(new java.util.Date().getTime()));

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.save(product);
        user.getProductList().add(product);
        session.save(user);
        session.flush();
        session.close();
        return product;

    }
    public static void updateProduct(ProductEntity product) {
      Session session = HibernateSessionFactory.getSessionFactory().openSession();
      session.update(product);
        session.flush();
        session.close();
    }
    public static void deleteProduct(ProductEntity product) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.delete(product);
        session.flush();
        session.close();

    }

    public static void addImage(ProductEntity product,ImageEntity image) {
        product.getImgList().add(image);
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.save(product);
        session.flush();
        session.close();
    }



}

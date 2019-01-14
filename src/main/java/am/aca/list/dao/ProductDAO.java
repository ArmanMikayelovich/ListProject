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
    public static void addProduct(UserEntity user, CategoryEntity category, List<ImageEntity> imgSource,
                                  String title, String description, int price ) {
        ProductEntity product = new ProductEntity();
        product.setUser(user);
        product.setCategory(category);
        product.setImgList(imgSource);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setCreate_date(new java.sql.Date(new java.util.Date().getTime()));
//        TODO
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.save(product);
        user.getProductList().add(product);
        session.save(user);
        session.close();

    }
    public static void updateProduct(ProductEntity product) {
      Session session = HibernateSessionFactory.getSessionFactory().openSession();
      session.update(product);

    }
    public static void deleteProduct(ProductEntity product) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.delete(product);
    }

}

package am.aca.list.dao;

import am.aca.list.entityes.CategoryEntity;
import am.aca.list.entityes.ImageEntity;
import am.aca.list.entityes.ProductEntity;
import am.aca.list.entityes.UserEntity;
import am.aca.list.util.HibernateSessionFactory;
import org.hibernate.Session;
import java.util.ArrayList;

import java.util.List;

public class UserDAO {



    public static UserEntity addUser(String firstName, String lastName, String password, String email, String phone) {
        UserEntity user = new UserEntity();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setProductList(new ArrayList<ProductEntity>());
        saveUser(user);
        return  user;
    }

    public static void saveUser(UserEntity user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.flush();
        session.getTransaction().commit();
        session.close();
    }

    public static void updateUser(UserEntity user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(user);
        session.flush();
        session.getTransaction().commit();
        session.close();

    }

    public static void deleteUser(UserEntity user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.flush();
        session.getTransaction().commit();

        session.close();

    }

    public static List<ProductEntity> getProducts(UserEntity user) {
        return user.getProductList();
    }



}

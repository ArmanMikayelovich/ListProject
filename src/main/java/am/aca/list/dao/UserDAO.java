package am.aca.list.dao;

import am.aca.list.dta.ProductView;
import am.aca.list.dta.UserView;
import am.aca.list.entityes.CategoryEntity;
import am.aca.list.entityes.ImageEntity;
import am.aca.list.entityes.ProductEntity;
import am.aca.list.entityes.UserEntity;
import am.aca.list.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

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

    public static List<UserEntity> getAllUsers() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        return session.createQuery("from UserEntity ").list();


    }

    public static List<UserView> getUserIdName() {
        return getAllUsers().stream()
                .map(u -> new UserView(u.getUser_id(),u.getFirstName(),u.getLastName()))
                .collect(Collectors.toList());


    }

    public static List<ProductView> getProductsView(UserEntity user) {
        return user.getProductList().stream()
                .map(p -> new ProductView(
                        p.getProductId(), p.getTitle(), p.getDescription())
                    ). collect(Collectors.toList());

    }

    public static UserEntity getUserById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
       return  session.get(UserEntity.class, id);

    }





}

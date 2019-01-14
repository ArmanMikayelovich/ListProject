package am.aca.list.dao;

import am.aca.list.entityes.CategoryEntity;
import am.aca.list.util.HibernateSessionFactory;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class CategoryDAO {
    public static CategoryEntity addCategory(String categoryName) {
        CategoryEntity category = new CategoryEntity();
        category.setCategoryName(categoryName);
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.save(category);
        session.flush();
        session.close();
        return category;
    }

    public static void editCategory(CategoryEntity category, String categoryName) {
        category.setCategoryName(categoryName);
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.update(category);
        session.flush();
        session.close();
    }
    public static void deleteCategory(CategoryEntity category) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.delete(category);
        session.flush();
        session.close();
    }
}

package am.aca.list;

import am.aca.list.dao.CategoryDAO;
import am.aca.list.dao.ImageDAO;
import am.aca.list.dao.ProductDAO;
import am.aca.list.dao.UserDAO;
import am.aca.list.entityes.CategoryEntity;
import am.aca.list.entityes.ImageEntity;
import am.aca.list.entityes.ProductEntity;
import am.aca.list.entityes.UserEntity;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

     UserEntity Mikayelovich =   UserDAO.addUser("Ani","Galajyan",
                    "Parol999","ArmanMikayelovich@gmail.com","+37444676676");
        CategoryEntity cars = CategoryDAO.addCategory("Cars");

        ProductEntity nissanAlmera =  ProductDAO.addProduct(Mikayelovich,cars,new ArrayList<ImageEntity>(),
                "Nissan Almera 2000Year 2000$$$","1,8 mator, 1.1 balon, 400.000 drived",1_000_000);
        ImageDAO.addImage(nissanAlmera,"http://www.google.com/nissan.jpg");
        System.out.println("ALL IS OK!!!!");
        System.out.println(UserDAO.getProducts(Mikayelovich));

    }
}

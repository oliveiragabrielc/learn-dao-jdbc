package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1,"Bola");
        System.out.println(obj);

        Seller seller = new Seller(1,"Gabriel","gabriel@gmail.com", LocalDate.now(),3000.0,obj);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
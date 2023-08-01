package application;

import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department obj = new Department(1,"Bola");
        System.out.println(obj);

        Seller seller = DaoFactory.createSellerDao().findById(3);
        System.out.println(seller);

        Department dp = new Department(2,null);
        List<Seller> listSeller = DaoFactory.createSellerDao().findAll();

        //Seller seller1 = new Seller(null,"Gabriel","gabriel@gmail.com",LocalDate.parse("04/04/1994", fmt),3000.00,dp);
        //DaoFactory.createSellerDao().insert(seller1);
       // System.out.println("Inserted! New id = " + seller1.getId());
        System.out.println();

        Seller seller1 = DaoFactory.createSellerDao().findById(14);
        seller1.setEmail("gabs@gmail.com");
        DaoFactory.createSellerDao().update(seller1);
        System.out.println("Altered! New id = " + seller1.getId());

    }
}
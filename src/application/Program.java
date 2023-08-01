package application;

import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1,"Bola");
        System.out.println(obj);

        Seller seller = DaoFactory.createSellerDao().findById(3);
        System.out.println(seller);

        Department dp = new Department(2,null);
        List<Seller> listSeller = DaoFactory.createSellerDao().findAll();


        for (Seller seller1 : listSeller) {
            System.out.println(seller1);
        }
    }
}
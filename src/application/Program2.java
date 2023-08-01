package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        Department department = new Department();
//        department.setName("TI");
//        departmentDao.insert(department);
//
//        Department department2 = new Department();
//        department2.setId(5);
//        department2.setName("Tecnologia da Informação");
//        departmentDao.update(department2);
//
//        Department department3 = departmentDao.findById(5);
//        departmentDao.deleteById(10);

        List<Department> list = DaoFactory.createDepartmentDao().findAll();
        for (Department dp : list){
            System.out.println(dp);
        }
    }
}
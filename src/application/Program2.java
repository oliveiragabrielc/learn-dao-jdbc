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

        Department department = new Department();
        department.setName("TI");

        departmentDao.insert(department);
    }
}
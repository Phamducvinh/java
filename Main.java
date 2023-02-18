package week4;

import java.util.Scanner;
import week4.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Họ và tên đệm: ");
            String firstName = scanner.nextLine();

            System.out.print("Tên: ");
            String lastName = scanner.nextLine();

            System.out.print("Lương: ");
            int salary = scanner.nextInt();

            employees[i] = new Employee(id, firstName, lastName, salary);
        }

        System.out.println("Danh sách nhân viên:");
        for (int i = 0; i < n; i++) {
            Employee employee = employees[i];
            System.out.println("ID: " + employee.getId());
            System.out.println("Họ và tên: " + employee.getName());
            System.out.println("Lương: " + employee.getSalary());
            System.out.println();
        }
         // In danh sách nhân viên
         System.out.println("Danh sach nhan vien:");
         for (Employee employee : employees) {
             System.out.println(employee.toString());
         }
 
    }
}

        
       

         
    


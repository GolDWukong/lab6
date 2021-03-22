
/**
 *
 * @author tatev
 */

public class employee {
    

 private String employeeName;

 private int idNumber;

 private String department;

 private String position;

 public void Employee() {

   employeeName = "";

   idNumber = 0;

   department = "";

   position = "";

 }

 public void Employee(String name, int id, String dept, String pos) {

   employeeName = name;

   idNumber = id;

   department = dept;

   position = pos;

 }

 public void Employee(String name, int id) {

   employeeName = name;

   idNumber = id;

   department = "";

   position = "";

 }

 public void set_employee_name(String empName) {

   employeeName = empName;

 }

 public String get_employee_name() {

   return employeeName;

 }

 public void set_employeeId(int empId) {

   idNumber = empId;

 }

 public int get_employeeId() {

   return idNumber;

 }      

       

 public void set_department(String dept) {

   department = dept;

 }          

 public String get_department() {

   return department;

 }

   

 public void set_position(String pos) {

   position = pos;

 }

   

 public String get_position() {

   return position;

 }

}

import Employee.java;

public class EmployeeProgram {

 public static void main(String args[]) {

   Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

   Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");

   Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

   System.out.println(emp1.get_employee_name());

   System.out.println(emp2.get_employee_name());

   System.out.println(emp3.get_employee_name());

 }
}

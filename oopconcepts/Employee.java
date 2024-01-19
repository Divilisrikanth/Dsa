package completedetails;
 interface Employeemethods {
          int id ;
          String name = "Srikanth";
          String designation = "Software Engineer";
          double salary = 4000000;
 }
public class Employee implements Employeemethods{
        public int getemployeeid(){
           return id;
        }
        public String getemployeename(){
             return name;
        }
        public String getdesignation(){
             return designation;
        }

        public double getsalary(){
             return salary;
        }
    }

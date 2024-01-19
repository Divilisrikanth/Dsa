package fields;
interface methods{
    
      abstract int getid(int id);
      abstract String getname(String name);
      abstract String getdesignation(String designation);
      abstract String getcompanyname(String companyname);
      abstract double getsalary(double salary);

    
}
public class ListofEmployees implements methods{
private int id;   
private String companyname;
private String designation;
private double salary;
private String name;


   public int getid(int id){
      this.id = id;
      return id;
   }
   public String getname(String name){
      this.name = name;
      return name;
   }
   public String getdesignation(String designation){
      this.designation = designation;
      return designation;
   }
   public String getcompanyname(String companyname){
      this.companyname = companyname;
      return companyname;
   }
   public double getsalary(double salary){
      this.salary = salary;
      return salary;
   }
   public void display(){
      System.out.println(id +" "+ name +" " + companyname +" "+ designation +" " + salary);
   }
}



   

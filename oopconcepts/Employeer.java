package employeerdetails;
public class Employeer {
    private int id ;
    private String name;
    private String designation;
    private String company;
    private double salary;

    public  void setid(int id){
        this.id = id;
         
    }
    public  int  getid(){

        return id;
          
    }
     
     public void setname(String name){
        this.name = name;
    }

    public  String getname(){
        return name;
    }

    public void setdesignation(String designation){
        this.designation = designation;
    }

    public  String getdesignation(){
        return designation;
    }
    
    public void setcompany(String company){
        this.company = company;
    }

    public  String  getcompany(){
        return company;
    }

    public void setsalary(double salary){
        this.salary = salary;
    }

    public  double getsalary(){
        return salary;
    }

    public void show(){
        System.out.println(id +" "+ name +"  "+ company+"  "+ designation +" "+ salary );
    }
}
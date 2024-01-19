import fields.ListofEmployees;
public class Field{
    public static void main(String[] args){
        ListofEmployees listofemployees = new ListofEmployees();
         listofemployees.getid(5421);
         listofemployees.getname("Srikanth");
        listofemployees.getcompanyname("Google");
        listofemployees.getdesignation("Software Engineer");
        listofemployees.getsalary(4000000);
        listofemployees.display();
        
        

    }
}
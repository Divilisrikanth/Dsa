public class Exampleusingstaticmethod{
    static int getid(int id){
        return id;
    }
    static String getname(String name){
        return name;
    }
    static String getcompanyname(String companyname){
        return companyname;
    }
    static String getdesignation(String designation){
        return designation;
    }
    static double getsalary(double salary){
        return salary;
    }
    public static void main(String[] args){
       int empid = getid(83491);
       String empname = getname("Srikanth");
       String empcompany = getcompanyname("Google");
       String empdesignation = getdesignation("Software Engineer");
       double empsalary = getsalary(4000000);
       
       System.out.println(empid +" " + empname + " " + empcompany + " " + empdesignation + " "+ " " + empsalary);
    }
}
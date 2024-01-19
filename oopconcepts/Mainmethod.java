import employeerdetails.Employeer;
class Mainmethod{
    public static void main(String[] args){
        Employeer empl = new Employeer();
        empl.setid(1596);
        empl.getid();
        empl.setname("Srikanth");
        empl.getname();
        empl.setcompany("Google inc");
        empl.getcompany();
        empl.setdesignation("Software Engineer");
        empl.getdesignation();
        empl.setsalary(4000000);
        empl.getsalary();
        empl.show();
    }
}
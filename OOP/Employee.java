public class Employee {
    private String name;
    private String position;
    private double salary;
    public void setName(String name){
        this.name=name;
    }  
    public String getName(){
        return name;
    }
    public void setPosition(String position){
        this.position=position;
    }  
    public String getPosition(){
        return position;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }  
    public double getSalary(){
        return salary;
    }
}
class EmployeeDriver{
    public static void main(String[] args) {
        Employee department=new Employee();

        department.setName("Sukrant Kharel");
        System.out.println(department.getName());

        department.setPosition("Bathroom Cleaner");
        System.out.println(department.getPosition());
        
        department.setSalary(200.20);
        System.out.println(department.getSalary());
        

    }
}
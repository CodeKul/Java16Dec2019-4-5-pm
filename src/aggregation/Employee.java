package aggregation;

public class Employee {

    int id;
    String name;
    Double salary;
    String address;
    Company company;

    public Employee(int id, String name, Double salary, String address, Company company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.company = company;
    }

    private void showData(){

        System.out.println(
                "Emp name  : "+name+"\n"+
                "Emp id  : "+id+"\n"+
                "Emp salary  : "+salary+"\n"+
                "Emp address  : "+address+"\n"+
                "cmp id  : "+company.id+"\n"+
                "cmp name  : "+company.name+"\n"+
                "cmp address  : "+company.address+"\n"
        );



    }


    public static void main(String[] args) {
        Company  company=new Company(1,"Codekul","Kothrud depot");
        Employee employee=new Employee(1,"Xyz",30000.00,"Bavhan",company);
        employee.showData();
    }

}

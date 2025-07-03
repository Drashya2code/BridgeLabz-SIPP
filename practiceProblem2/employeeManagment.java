package practiceProblem2;

abstract class Employee{
    String id;
    String name;
    private int baseSalary;

    Employee(String id, String name, int baseSalary){
        this.name = name;
        this.id = id;
        setBaseSalary(baseSalary);
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }


    public int getBaseSalary(){
        return baseSalary;
    }


    public void setBaseSalary(int baseSalary){
        if(baseSalary >=0 ){
            this.baseSalary = baseSalary;
        }else{
            System.out.println("Base Salary can not be -ve");
        }
    }
}

public class employeeManagment {
    
}

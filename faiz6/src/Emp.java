public class Emp {

    int empId;
    String empName;
    String designation;
    double basic;
    private double hra;

    public Emp(int empId,String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;

        if(basic < 500){
            throw  new LowSalException();
        }

    }

    public void printDET(){
        System.out.println(this.empId);
        System.out.println(this.empName);
        System.out.println(this.designation);
        System.out.println("Basic Salary : "+this.basic);


    }
    public void calculateHRA(){
        if(designation.equals("manager")){
           this.hra =  0.10 * basic;
            System.out.println(hra);

        } else if (designation.equals("officer")) {
            this.hra = 0.12 * basic;
            System.out.println(hra);

        } else if (designation.equals("clerk")) {
            this.hra = 0.05 * basic;
            System.out.println(hra);

        }else{
            System.err.println("HRA is Not available for this designation");
        }

    }
}

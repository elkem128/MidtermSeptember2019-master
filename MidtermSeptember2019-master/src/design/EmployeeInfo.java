package design;

import java.util.Scanner;

public class EmployeeInfo  {

    /* This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;
    private int id;
    private String name;
    private String dep;
    public static final int Salary = 65000;
    public int year = 0;

    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId){
        this.id= employeeId;

    }
    public EmployeeInfo(String name, int employeeId){
        this.name= name;
        this.id= employeeId;

    }


    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public double calculateEmployeeBonus(){

        double performence = 0;
        if(year>= 10){
            performence = .20;
        }
        else if(year< 10 && year >= 5){
            performence= .10;
        }else if(year <5 && year >= 1){
            performence = .05;
        }else{
            System.out.println("Sorry , Bounes are only for employees that have woked more that a year");
        }
        double total = (Salary * performence);
        System.out.println("Bouns : " + total);
        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public  int calculateEmployeePension(){
        int total=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        //Calculate pension
        try{
            this.year= Integer.parseInt(convertedTodaysDate.substring(convertedTodaysDate.indexOf('/')) + 1, convertedJoiningDate.indexOf('/'));
            if(this.year <1){
                System.out.println("Sorry Pension are only for employees that have worked more that a year only");
                return 0;
            }
        }catch(Exception e){
            System.out.println("there is an error , try agian");
        }

        return total;
    }

   // @Override
    public int employeeId() {
        return this.id;
    }

   // @Override
    public String employeeName() {
        return this.name;
    }


    public void assignDepartment(String d) {
        this.dep = d;

    }

    //@Override
    public int calculateSalary() {
        return this.Salary;
    }

  //  @Override
    public void benefitLayout() {
        System.out.println("Empoyees has dental ,medical ,Stock ,401K");

    }

    //@Override
    public double groceryBudget() {
        System.out.println("My yearly bill is " + (double)(this.Salary* .05)+ "Dollars");
        return this.Salary * .05;
    }

    private static class DateConversion {

        public DateConversion(Months months){}
        public static String convertDate(String date) {
            String [] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
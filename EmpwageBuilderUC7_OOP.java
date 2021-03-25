import java.util.Random;

public class EmpwageBuilderUC7_OOP {

    public static void main(String[] args) {
        // Creating an Instance of class Employee_check
        Employee_check first_emp = new Employee_check(20,10,15);
        Employee_check reliance_emp = new Employee_check(20, 12, 16);
        // Calling the attendance method on first_emp
        System.out.println("FIRST EMPLOYEE :");
        first_emp.attendance();
        System.out.println("RELIANCE EMPLOEE:");
        reliance_emp.attendance();
    }



        public static class Employee_check {

            int working_hours;
            int work_days; 
            int absent_counter;
            int part_time_counter;
            int full_time_counter ;
            int wage_per_hr ;
            //Initializing part time hours
            int part_time_hrs ;
            int wage_today ;
            int total_work_hrs;

            Employee_check(int a, int b, int c){

                this.working_hours = a;
                this.work_days = 0;
                this.absent_counter = 0;
                this.part_time_counter = 0;
                this.full_time_counter =0;
                this.wage_per_hr = c;
                this.part_time_hrs = b;
                this.total_work_hrs = 0;
                this.wage_today = 0;
            }
                
            Random check = new Random();
            //Defining attendacne method
            public void attendance() {
                
                //int checker =check.nextInt(3);

                while(total_work_hrs < 100 && work_days < 20 ){

                    int checker =check.nextInt(3);
                    // Using switch to mark attendance
                    switch(checker){
                        // Absent case
                        case 0:
                            absent_counter += 1;
                            break;
                        // Full time Case    
                        case 1:
                            wage_today = working_hours * wage_per_hr;
                            total_work_hrs += 8;
                            full_time_counter += 1;
                            work_days += 1;
                            break;
                        // Part time Case    
                        case 2 :
                            wage_today = working_hours * wage_per_hr;
                            total_work_hrs += 4;
                            part_time_counter += 1;
                            work_days += 1;
                            break;
                        default:
                            break;            
                    }
            
           
             }

             int wage_total = total_work_hrs * wage_per_hr;
             System.out.println("THE EMPLOYE WORKED FOR "+work_days+" DAYS AND "+total_work_hrs+" HOURS");
             System.out.println("THE EMPLOYE WAS ABSENT FOR "+absent_counter+" DAYS");
             System.out.println("THE EMPLOYEE WORKED "+part_time_counter+" PART TIME DAYS");
             System.out.println("THE EMPLOYEE WORKED "+full_time_counter+" FULL TIME DAYS");
             System.out.println("THE TOTAL WAGE IN THIS MONTH IS "+wage_total+"\n");

            } 
            
        }
    
}

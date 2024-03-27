public class SeniorDeveloper extends Developer
{
    private double salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
public SeniorDeveloper (String platform, String interviewer_name,int working_hour,double salary, int contractPeriod){
    super(platform,interviewer_name,working_hour);
    this.salary=salary;
    this.contractPeriod=contractPeriod;
    joiningDate="";
    staffRoomNumber="";
    advanceSalary=0.0;
    appointed=false;
    terminated=false;
}
public double getSalary()
    {
        return this.salary;
    }
public void setSalary(double salary)
    {
        this.salary=salary;
    }    
public String getJoiningDate()
    {
        return this.joiningDate;
    }
public void setJoiningDate(String joiningDate)
    {
        this.joiningDate=joiningDate;
    }    
public String getStaffRoomNumber()
    {
        return this.staffRoomNumber;
    }
public void setStaffRoomNumber(String staffRoomNumber)
    {
        this.staffRoomNumber=staffRoomNumber;
    } 
public int getContractPeriod()
    {
        return this.contractPeriod;
    }
public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    } 
public double getAdvanceSalary()
    {
        return this.advanceSalary;
    }
public void setAdvanceSalary(double advanceSalary)
    {
        this.advanceSalary=advanceSalary;
    } 
public boolean getAppointed()
    {
        return this.appointed;
    }
public void setAppointed(boolean appointed)
    {
        this.appointed=appointed;
    } 
public boolean getTerminated()
    {
        return this.terminated;
    }
public void setTerminated(boolean terminated)
    {
        this.terminated=terminated;
    } 


public void hire (String developer_name,String joiningDate,double advanceSalary,String staffRoomNumber){

    if(appointed){
        System.out.println("The developer has already been appointed");
        System.out.println("Developer is appointed and his/her name is   "  +this.getDeveloper_name()+ " \n");
        
        System.out.println("His/her Room number is   "   +this.staffRoomNumber+ " \n");
    } 
    else{
        this.setDeveloper_name(developer_name);
        
        this.joiningDate=joiningDate;
        this.staffRoomNumber= staffRoomNumber;
        this.advanceSalary=advanceSalary;
        appointed=true; 
        terminated=false;  
    }
}


public void termination(){
    if (terminated){
        System.out.println("Developer is terminated \n");

    }
    else{
        this.setDeveloper_name("");
        this.joiningDate="";
        this.advanceSalary=0.0f;
        appointed=false;
        terminated=true;

    }  
}
public void printing(){
    System.out.println("Platform of  senior developer :  "+ " \n" + this.getPlatform()+ " \n");
    System.out.println("Interviewer name : " +" \n" + this.getInterviewer_name()+ " \n");
    System.out.println("Salary :   "  +" \n" + this.getSalary()+ " \n");
}
public void display(){
    super.display();
    if (this.appointed){
        System.out.println("Developer Name:  "+ this.getDeveloper_name()+ " \n");
        System.out.println("The status of developer termination :   "+ this.getTerminated()+ " \n");
        System.out.println("Developer joined on   "  + this.getJoiningDate()+ " \n");
        System.out.println("Advance salary :   "  + this.getAdvanceSalary()+ " \n");


    }
 




}
}// end of class
    
        








 











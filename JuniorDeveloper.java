public class JuniorDeveloper extends Developer{
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

public JuniorDeveloper(String platform, String interviewer_name,int working_hour,double salary,String appointedBy,String terminationDate){
    super(platform,interviewer_name,working_hour);
    this.salary=salary;
    this.appointedBy=appointedBy;
    this.terminationDate=terminationDate;
    appointedDate="";
    evaluationPeriod="";
    specialization="";
    joined=false;
} 
public double getSalary()
    {
        return this.salary;
    }
public void setSalary(double salary)
    {
        this.salary=salary;
    }    
public String getAppointedDate()
    {
        return this.appointedDate;
    }
public void setAppointedDate(String appointedDate)
    {
        this.appointedDate=appointedDate;
    } 
public String getEvaluationPeriod()
    {
        return this.evaluationPeriod;
    }
public void setEvaluationPeriod(String evaluationPeriod)
    {
        this.evaluationPeriod=evaluationPeriod;
    } 
public String getTerminationDate()
    {
        return this.terminationDate;
    }
public void setTrminationDate(String terminationDate)
    {
        this.terminationDate=terminationDate;
    } 
public String getSpecialization()
    {
        return this.specialization;
    }
public void setSpecialization(String specialization)
    {
        this.specialization=specialization;
    } 
public String getAppointedBy()
    {
        return this.appointedBy;
    }
public void setAppointedBy(String appointedBy)
    {
        this.appointedBy=appointedBy;
    } 
public boolean getJoined()
    {
        return this.joined;
    }
public void setJoined(boolean joined)
    {
        this.joined=joined;
    } 
public void setsalary(double salary){ 
    if (this.joined==false){
        this.salary=salary;

    }
    else{
        System.out.println("Sorry! junior developer is already joined so we cannot change salary");
    }
}
public void appoint(String developer_name, String appointedDate,String terminationDate,String specialization,String evaluationPeriod){
    if (joined){
        
        System.out.println("Developer is already joined on"+ appointedDate);
         
    }
    else{
        this.setDeveloper_name(developer_name);
        joined=true;
    }
        this.appointedDate=appointedDate;
        this.terminationDate=terminationDate;
        this.specialization=specialization;
        this.evaluationPeriod=evaluationPeriod;
    
}
public void display(){
    super.display();
    if(joined==true){
        System.out.println("Developer Name : " + this.getDeveloper_name()+ " \n");
        System.out.println("Evaluation period : "+ this.getEvaluationPeriod()+ " \n");
        System.out.println("Developer joined on"+ this.getAppointedDate()+ " \n");
        System.out.println("Salary " + this.getSalary()+ " \n");
        System.out.println("Termination date "+ this.getTerminationDate()+ " \n");
        System.out.println("Developer is appointed by "+this.getAppointedBy()+ " \n");
        System.out.println("Developer have special skill of "+this.getSpecialization()+ " \n");
    
    }

} 
}


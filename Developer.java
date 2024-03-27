
public class Developer 
{
   private String platform;
   private String interviewer_name;
   private String developer_name;
   private  float working_hour;
public Developer(String platform , String interviewer_name ,int working_hour){ 
    this.platform=platform;
    this.interviewer_name=interviewer_name;
    developer_name="";
    this.working_hour=working_hour;

}
public String getPlatform()
    {
        return this.platform;
    }
public void setPlatform(String platform)
    {
        this.platform= platform;
    }
public String getInterviewer_name()
    {
        return this.interviewer_name;
    }
public void setInterviewer_name(String interviewer_name)
    {
        this.interviewer_name= interviewer_name;
    }
public String getDeveloper_name()
    {
        return this.developer_name;
    }    
public void setDeveloper_name(String developer_name)
    {
        this.developer_name= developer_name;
    }   
public float getWorking_hour()
    {
        return this.working_hour;
    }
public void setWorking_hour(Float working_hour)
    {
        this.working_hour= working_hour;
    }
public void display(){
     System.out.println("Platform :"+ this.getPlatform()+ " \n");
     System.out.println("Interviewer name :"+ this.getInterviewer_name()+" \n");
     System.out.println("working hour : "+this.getWorking_hour()+ " \n");
    if((developer_name.equals("")))
    {
        System.out.println("Name of developer is "+ this.getDeveloper_name()+ " \n");
    }
    
       

}
}
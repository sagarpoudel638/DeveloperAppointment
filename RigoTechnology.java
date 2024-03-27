import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.util.*;

public class RigoTechnology implements ActionListener
{
    JFrame frame;
    JLabel lblPlatform, lblWorkinghr, lblInterviewerName,lblSalary,lblAppointedBy,lblTermiDate1,lblName,lblJoiningDate,lblDevNo,lblRoomNo,lblAdvSalary,lblNameJ,lblSpecialization,lblEvaluationPeriod,lblAppointDate,lblTermiDate,lblDevNoJ,lblContractPeriod;
    JTextField txtPlatform, txtWorkinghr, txtInterviewerName,txtAppointedBy,txtSalary,txtTermiDate1,txtName,txtJoiningDate,txtDevNo,txtRoomNo,txtAdvSalary,txtNameJ,txtSpecialization,txtEvaluationPeriod,txtAppointDate,txtTermiDate,txtDevNoJ,txtContractPeriod;
    JButton btnJunior, btnSenior,btnAppoint, btnTerminate,btnAppointJ,btnDisplay, btnClear;
    JPanel mainpanel,firstpanel,secondpanel,thirdpanel;
    int workingHourText;
    double salaryText;
    int contractPeriod;
    int devno;
    
    double advsalary;
    ArrayList <Developer> list= new ArrayList <Developer>();
    public void form(){
        frame = new JFrame("Rigo Technology");
        frame.setBounds(400,100,500,650);
        frame.setSize(700,680);
        
        // creating panel and adding panel to frame for border
        mainpanel=new JPanel();
        mainpanel.setBounds(10,10,665,635);
        mainpanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainpanel.setLayout(null);
        frame.add(mainpanel);
        
        Border thisBorder= BorderFactory.createRaisedBevelBorder();// for titled raised border
        // sub panels which is to be added on main panel
        firstpanel=new JPanel();
        firstpanel.setBounds(13,13,640,220);
        firstpanel.setBorder(BorderFactory.createTitledBorder(thisBorder,"Add Platform for Senior/Junior Developer"));
        firstpanel.setLayout(null);
        mainpanel.add(firstpanel);
         
        secondpanel=new JPanel();
        secondpanel.setBounds(13,240,640,180);
        secondpanel.setBorder(BorderFactory.createTitledBorder(thisBorder,"Appoint/Terminate Senior Developer"));
        secondpanel.setLayout(null);
        mainpanel.add(secondpanel);
        
        thirdpanel=new JPanel();
        thirdpanel.setBounds(13,425,640,155);
        thirdpanel.setBorder(BorderFactory.createTitledBorder(thisBorder,"Appoint Junior Developer"));
        thirdpanel.setLayout(null);
        mainpanel.add(thirdpanel);
        
        // making of platform
        lblPlatform= new JLabel("Platform :");
        lblPlatform.setBounds(20,20,60,25);
        firstpanel.add(lblPlatform);
        //making of text field
        txtPlatform= new JTextField();
        txtPlatform.setBounds(140,20,200,25);
        firstpanel.add(txtPlatform);
        
        lblWorkinghr= new JLabel("Working Hour :");
        lblWorkinghr.setBounds(350,20,130,25);
        firstpanel.add(lblWorkinghr);

        txtWorkinghr= new JTextField();
        txtWorkinghr.setBounds(490,20,130,25);
        firstpanel.add(txtWorkinghr);
        
        lblInterviewerName= new JLabel("Interviewer Name :");
        lblInterviewerName.setBounds(20,60,120,25);
        firstpanel.add(lblInterviewerName);
        
        txtInterviewerName= new JTextField();
        txtInterviewerName.setBounds(140,60,200,25);
        firstpanel.add(txtInterviewerName);
        
        lblSalary= new JLabel("Salary :");
        lblSalary.setBounds(350,60,130,25);
        firstpanel.add(lblSalary);

        txtSalary= new JTextField();
        txtSalary.setBounds(490,60,130,25);
        firstpanel.add(txtSalary);
        
        lblAppointedBy= new JLabel("Appointed by:");
        lblAppointedBy.setBounds(20,100,120,25);
        firstpanel.add(lblAppointedBy);
        
        
        txtAppointedBy= new JTextField();
        txtAppointedBy.setBounds(140,100,200,25);
        firstpanel.add(txtAppointedBy);
        
        lblTermiDate1= new JLabel("Termination Date :");
        lblTermiDate1.setBounds(350,100,130,25);
        firstpanel.add(lblTermiDate1);
        
        txtTermiDate1= new JTextField();
        txtTermiDate1.setBounds(490,100,130,25);
        firstpanel.add(txtTermiDate1);
        
        lblContractPeriod= new JLabel("Contract Period:");
        lblContractPeriod.setBounds(20,140,120,25);
        firstpanel.add(lblContractPeriod);
        
        txtContractPeriod= new JTextField();
        txtContractPeriod.setBounds(140,140,200,25);
        firstpanel.add(txtContractPeriod);
        
        btnJunior= new JButton("Add for Junior");// adding button
        btnJunior.setBounds(350,180,130,25);
        firstpanel.add(btnJunior);
        btnJunior.addActionListener(this);
        
        btnSenior= new JButton("Add for Senior");
        btnSenior.setBounds(490,180,130,25);
        firstpanel.add(btnSenior);
        btnSenior.addActionListener(this);
        
        lblName= new JLabel("Name :");
        lblName.setBounds(20,40,60,25);
        secondpanel.add(lblName);
        
        txtName= new JTextField();
        txtName.setBounds(140,40,200,25);
        secondpanel.add(txtName);
        
        
        lblJoiningDate= new JLabel("Joining Date :");
        lblJoiningDate.setBounds(350,40,130,25);
        secondpanel.add(lblJoiningDate);
        
        txtJoiningDate= new JTextField();
        txtJoiningDate.setBounds(490,40,130,25);
        secondpanel.add(txtJoiningDate);
        
        lblDevNo= new JLabel("Developer No :");
        lblDevNo.setBounds(20,80,110,25);
        secondpanel.add(lblDevNo);
        
        txtDevNo= new JTextField();
        txtDevNo.setBounds(140,80,50,25);
        secondpanel.add(txtDevNo);
        
        lblRoomNo= new JLabel("Room No :");
        lblRoomNo.setBounds(200,80,60,25);
        secondpanel.add(lblRoomNo);
        
        txtRoomNo= new JTextField();
        txtRoomNo.setBounds(290,80,50,25);
        secondpanel.add(txtRoomNo);
        
        lblAdvSalary= new JLabel("Advance Salary :");
        lblAdvSalary.setBounds(350,80,130,25);
        secondpanel.add(lblAdvSalary);
        
        txtAdvSalary= new JTextField();
        txtAdvSalary.setBounds(490,80,130,25);
        secondpanel.add(txtAdvSalary);
        
        btnAppoint= new JButton("Appoint");
        btnAppoint.setBounds(350,120,130,25);
        secondpanel.add(btnAppoint);
        btnAppoint.addActionListener(this);
        
        btnTerminate= new JButton("Terminate");
        btnTerminate.setBounds(490,120,130,25);
        secondpanel.add(btnTerminate);
        btnTerminate.addActionListener(this);
         
        lblNameJ= new JLabel("Name :");
        lblNameJ.setBounds(20,20,60,25);
        thirdpanel.add(lblNameJ);
        
        txtNameJ= new JTextField();
        txtNameJ.setBounds(140,20,200,25);
        thirdpanel.add(txtNameJ);
        
        
        lblSpecialization= new JLabel("Specialization :");
        lblSpecialization.setBounds(350,20,130,25);
        thirdpanel.add(lblSpecialization);
        
        txtSpecialization= new JTextField();
        txtSpecialization.setBounds(490,20,130,25);
        thirdpanel.add(txtSpecialization);
        
        lblEvaluationPeriod= new JLabel("Evaluation Period:");
        lblEvaluationPeriod.setBounds(20,60,110,25);
        thirdpanel.add(lblEvaluationPeriod);
        
        txtEvaluationPeriod= new JTextField();
        txtEvaluationPeriod.setBounds(140,60,50,25);
        thirdpanel.add(txtEvaluationPeriod);
        
        lblAppointDate= new JLabel("Appoint Date :");
        lblAppointDate.setBounds(200,60,80,25);
        thirdpanel.add(lblAppointDate);
        
        txtAppointDate= new JTextField();
        txtAppointDate.setBounds(290,60,50,25);
        thirdpanel.add(txtAppointDate);
        
        lblTermiDate= new JLabel("Termination Date :");
        lblTermiDate.setBounds(350,60,130,25);
        thirdpanel.add(lblTermiDate);
        
        txtTermiDate= new JTextField();
        txtTermiDate.setBounds(490,60,130,25);
        thirdpanel.add(txtTermiDate);
        
        lblDevNoJ= new JLabel("Developer No :");
        lblDevNoJ.setBounds(20,100,110,25);
        thirdpanel.add(lblDevNoJ);
        
        txtDevNoJ= new JTextField();
        txtDevNoJ.setBounds(140,100,50,25);
        thirdpanel.add(txtDevNoJ);
        
        btnAppointJ= new JButton("Appoint Junior Developer");
        btnAppointJ.setBounds(350,100,270,25);
        thirdpanel.add(btnAppointJ);
        btnAppointJ.addActionListener(this);
        
        btnDisplay= new JButton("Display All");
        btnDisplay.setBounds(363,585,130,25);
        mainpanel.add(btnDisplay);
        btnDisplay.addActionListener(this);
        
        btnClear= new JButton("Clear");
        btnClear.setBounds(504,585,130,25);
        mainpanel.add(btnClear);
        btnClear.addActionListener(this);
        
        mainpanel.setVisible(true);
        firstpanel.setVisible(true);
        secondpanel.setVisible(true);
        thirdpanel.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    // start of codes realted to buttons and text field
    
    public void actionPerformed(ActionEvent e)
    {// for making button work
        // for add to junior  
        
       
         if(e.getSource()==btnJunior)
            {
              try
        { 
             String platformText= txtPlatform.getText();
             String interviewerNameText= txtInterviewerName.getText();
             String appointedByText=txtAppointedBy.getText();
             String termiDateText1=txtTermiDate1.getText();
             
             String workingHour=txtWorkinghr.getText();
             String salary=txtSalary.getText();
             int workingHourText=Integer.parseInt(workingHour);
             double salaryText=Double.parseDouble(salary);
                if(txtPlatform.getText().isEmpty()||txtWorkinghr.getText().isEmpty()||txtInterviewerName.getText().isEmpty()||txtSalary.getText().isEmpty()||txtAppointedBy.getText().isEmpty()||txtTermiDate1.getText().isEmpty())
                 {
                           JOptionPane.showMessageDialog(frame,"All Fields are compulsory!!");   
                 
                 
                }
                else
                {
                    
                    
                    
                        if (salaryText<20000||salaryText>400000)
                        {
                            JOptionPane.showMessageDialog(null,"Developer Salary must lie between 20000-400000");
                        }
                        else if ( !(platformText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))||!(appointedByText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))||!(interviewerNameText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))) 
                        {
                            JOptionPane.showMessageDialog(null,"Only alphabets  allowed in Platform/appointedBy/InterviewerName");
                            
                        }
                        
                    
                   
                    
                    
                    
                    
                        else if ( (termiDateText1.matches("[a-zA-Z]+"))) 
                        {
                            JOptionPane.showMessageDialog(null,"date format invalid");
                            
                        }
                        else 
                        {
                        JuniorDeveloper developer1= new JuniorDeveloper(platformText,interviewerNameText,workingHourText,salaryText,appointedByText,termiDateText1);
                        list.add(developer1);
                        JOptionPane.showMessageDialog(frame,"Junior developer successfully added");
                        
                    }
                    
                    
                    
                
                
            }
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Field Empty or Valid Insertion Required!");   
        }
    }       
       
        // for add to senior button
        if(e.getSource()==btnSenior)
        {  
            try
            {
                String platformText= txtPlatform.getText();
                String interviewerNameText= txtInterviewerName.getText();
             
                String contractPeriodText=txtContractPeriod.getText();
                String workingHour=txtWorkinghr.getText();
                String salary=txtSalary.getText();
                int workingHourText=Integer.parseInt(workingHour);
                double salaryText=Double.parseDouble(salary);
                int contractPeriod=Integer.parseInt(contractPeriodText);
            
            if(txtPlatform.getText().isEmpty()||txtWorkinghr.getText().isEmpty()||txtInterviewerName.getText().isEmpty()||txtSalary.getText().isEmpty()||txtContractPeriod.getText().isEmpty())
                 {
                           JOptionPane.showMessageDialog(frame,"All Fields are compulsory!!");   
                 
                 
                }
                else
                {
                    
                    
                    
                        if (salaryText<20000||salaryText>400000)
                        {
                            JOptionPane.showMessageDialog(null,"Developer Salary must lie between 20000-400000");
                        }
                        else if ( !(platformText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))||!(interviewerNameText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))) 
                        {
                            JOptionPane.showMessageDialog(null,"Only alphabets  allowed in Platform/InterviewerName");
                            
                        }
                        
                    
                   
                    
                    
                    
                    
                        else if ( contractPeriodText.matches("[a-zA-Z]+"))
                        {
                            JOptionPane.showMessageDialog(null,"date format invalid");
                            
                        }
                        else 
                        {
                        SeniorDeveloper developer= new SeniorDeveloper(platformText,interviewerNameText,workingHourText,salaryText,contractPeriod);
                        list.add(developer);
                        JOptionPane.showMessageDialog(frame,"Senior developer successfully added");
                        
                    }
                    }
                    
                
                
            
        }
        
        
        
    

        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Field Empty or Valid Insertion Required!");   
        }
    }

  
      
      if(e.getSource()==btnAppoint)
      {
     try
      {
          String NameText= txtName.getText();
          String JoiningDateText=txtJoiningDate.getText();
          String DevNoText=txtDevNo.getText();
          String RoomNoText=txtRoomNo.getText();
          String AdvSalaryText=txtAdvSalary.getText();
          int devno = Integer.parseInt(DevNoText);
      
          double advsalary = Double.parseDouble(AdvSalaryText);
          
       if(DevNoText.isEmpty()||NameText.isEmpty()||JoiningDateText.isEmpty()||RoomNoText.isEmpty()||AdvSalaryText.isEmpty())
       {
           JOptionPane.showMessageDialog(frame,"All Fields are compulsory!!");   
        }
        else
        {
            if (advsalary<10000||advsalary>100000)
                        {
                            JOptionPane.showMessageDialog(null,"Developer Salary must lie between 10000-100000");
                        }
            else if ( !(NameText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))) 
                        {
                            JOptionPane.showMessageDialog(null,"Only alphabets  allowed in Developer name/room no");
                            
                        }
            else if ( DevNoText.matches("[a-zA-Z]+")||JoiningDateText.matches("[a-zA-Z]+")||AdvSalaryText.matches("[a-zA-Z]+"))
                        {
                            JOptionPane.showMessageDialog(null,"Invalid Input");
                            
                        }
            else
            {
            
                if (devno>=0 && devno<list.size())
                {    
           
                    if(list.get(devno) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper developer=(SeniorDeveloper) list.get(devno);
                        if(developer.getAppointed()==false)
                        { 
                            developer.hire(NameText, JoiningDateText,advsalary, RoomNoText);
                            JOptionPane.showMessageDialog(frame,"Senior Developer Appointed");   
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"Sorry developer is already appointed"); 
                        }
                }
                    else
                    {
             
                        JOptionPane.showMessageDialog(frame,"Platform is not for Senior Developer");     
                    }
                }
                else
                {
           
                    JOptionPane.showMessageDialog(frame,"Platform not Available");   
                }
    }
    }
       }
        
    catch(Exception exp)
       {
            JOptionPane.showMessageDialog(frame,"Field Empty or Valid Insertion Required!");   
       }
    }
    if(e.getSource()==btnTerminate)
    {
        try
        {
        String DevNoText=txtDevNo.getText();
        int devno = Integer.parseInt(DevNoText);
        
      
        if (devno>=0 && devno<list.size())
       {
           if(list.get(devno) instanceof SeniorDeveloper)
           {
             SeniorDeveloper developer=(SeniorDeveloper) list.get(devno);
                if(developer.getAppointed())
                {   
                    developer.termination();
                    JOptionPane.showMessageDialog(frame,"Developer terminated");   
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"Developer not available ");   
                }
        }
           else
           {
             JOptionPane.showMessageDialog(frame,"Platform is not for Senior Developer");     
            }
        }
        else
       {
           JOptionPane.showMessageDialog(frame,"Platform not Available");   
        }
        }
        
        catch( Exception exp)
        {
            JOptionPane.showMessageDialog(frame,"Field Empty or Valid Insertion Required!");      
        }
    }
    // for junior developer appoint
    if(e.getSource()==btnAppointJ)
      {
     try
      {
           String NameTextJ= txtNameJ.getText();
          String termiDateText=txtTermiDate.getText();
          String EvaluationPeriodText=txtEvaluationPeriod.getText();
          String AppointDateText=txtAppointDate.getText();
          String SpecializationText=txtSpecialization.getText();
          String DevNoJText=txtDevNoJ.getText();
          int devnoj = Integer.parseInt(DevNoJText);
      
       if(EvaluationPeriodText.isEmpty()||NameTextJ.isEmpty()||termiDateText.isEmpty()||AppointDateText.isEmpty()||SpecializationText.isEmpty())
       {
           JOptionPane.showMessageDialog(frame,"All Fields are compulsory!!");   
        }
        else
        {
            
            if ( !(NameTextJ.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))||!(SpecializationText.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))) 
                        {
                            JOptionPane.showMessageDialog(null,"Only alphabets  allowed in Developer name/room no");
                            
                        }
            else if ( termiDateText.matches("[a-zA-Z]+")||AppointDateText.matches("[a-zA-Z]+"))
                        {
                            JOptionPane.showMessageDialog(null,"Invalid Input");
                            
                        }
            else
            {
            
                if (devnoj>=0 && devnoj<list.size())
                {    
           
                    if(list.get(devnoj) instanceof JuniorDeveloper)
                    {
                     JuniorDeveloper developer=(JuniorDeveloper) list.get(devnoj);
                     developer.appoint(NameTextJ,AppointDateText,termiDateText,SpecializationText,EvaluationPeriodText);
                     JOptionPane.showMessageDialog(frame,"Junior Developer Appointed");   
                    }
                    else
                    {
             
                        JOptionPane.showMessageDialog(frame,"Platform is not for Junior Developer");     
                    }
                }
                else
                {
           
                    JOptionPane.showMessageDialog(frame,"Platform not Available");   
                }
    }
    }
       }
        
    catch(Exception exp)
       {
            JOptionPane.showMessageDialog(frame,"Field Empty or Valid Insertion Required!");   
       }
    }
        if(e.getSource()==btnClear)
        {
          txtPlatform.setText(""); 
          txtWorkinghr.setText("");
          txtInterviewerName.setText("");
          txtAppointedBy.setText("");
          txtSalary.setText("");
          txtTermiDate1.setText("");
          txtName.setText("");
          txtJoiningDate.setText("");
          txtDevNo.setText("");
          txtRoomNo.setText("");
          txtAdvSalary.setText("");
          txtNameJ.setText("");
          txtSpecialization.setText("");
          txtEvaluationPeriod.setText("");
          txtAppointDate.setText("");
          txtTermiDate.setText("");
          txtDevNoJ.setText("");
          txtContractPeriod.setText("");
        }
        if(e.getSource()==btnDisplay)
        {
            if(list.size()<0)
            {
              JOptionPane.showMessageDialog(frame,"Developer has not been appointed ");  
            }
            else
            {
                for(Developer each : list)
                {
                    if(each instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper developer=(SeniorDeveloper) each;
                        developer.display();
                    }
                    else
                    {
                        JuniorDeveloper developer1=(JuniorDeveloper) each;
                        developer1.display();
                    }
                }
            }
            
        }
    }
       public static void main(String[] args){
        new RigoTechnology().form();
        
    }

}
package student.softwaredesign;


public class NewMain 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        StudentSoftwareDesign s1 = new StudentSoftwareDesign();
        StudentSoftwareDesign s2 = new StudentSoftwareDesign(2,"Bravo");
        
        System.out.println("Name of s1 is "+ s1.getStuName());
        System.out.println("Name of s2 is "+ s2.getStuName());
    }
    
}

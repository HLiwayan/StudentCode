package student.softwaredesign;

/**
 *
 * @author Harry_Liwayan
 */

import java.util.Scanner;

public class StudentSoftwareDesign 
{

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    
    private int stuID;
    private String stuName;
    
    public StudentSoftwareDesign()
    {
        stuID = 1;
        stuName = "Henry";
    }
    
    //Constructor for student
    public StudentSoftwareDesign(int id, String name)
    {
        stuID = id;
        stuName = name;
    }
}

 



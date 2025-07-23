
package com.mycompany.esystem;

public class Subject {
    int SubjID;
    String SubjCode;
    String SubjDesc;
    int SubjUnits;
    String Sched;
    
    
    public void SaveRecord(){
        System.out.print("Saved Clicked");
    }
    public void DeleteRecord(){
        System.out.print("Delete Clicked");
    }
    public void UpdateRecord(){
        System.out.print("Update Clicked");
    }
}

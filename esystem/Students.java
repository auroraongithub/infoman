package com.mycompany.esystem;

public class Students {
    int Studid;
    String name;
    String Address;
    String Contact;
    String Gender;
    String Yrlvl;
    
    public void SaveRecord(){
        System.out.print("Saved Clicked");
        ESystem queryConnect = new ESystem();
        queryConnect.DBConnect();
        String addQuery = ()
    }
    public void DeleteRecord(){
        System.out.print("Delete Clicked");
    }
    public void UpdateRecord(){
        System.out.print("Update Clicked");
    }
}

import java.util.Scanner;
class CreateOrUpdate {
    ApleSarkaar a;
     
    // Project Number - 1.
    // Project Type - Small.
    // Project On - New Aadhaar Generation / Existing Aadhaar Modification.
    // Project Reference - UIDAI Website.
    // Project Reason - Logic Building.
    // Project Covered Concept's - Covered The Basics Of Java Programming & Object Oriented Programming System Core Concepts.

    public void createNewOrModifyExistingAdhaarDetails(int choice) {
        Scanner sc = new Scanner (System.in);
        if (this.a==null) {
            if(choice==1) {
                ApleSarkaar a1 = new ApleSarkaar();
                System.out.println("What You Want Modify \n1. Aadhaar name\n2. Mobile Number\n3. Address\n4. status\n5. I Want All Update");
                int modify = sc.nextInt();
                switch (modify) {
                    case 1 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails u = new UpdateAdhaarDetails ();
                            System.out.println("Enter New Name");
                            String name = sc.next();
                            a=new UpdateAdhaarDetails(name,u.getMobNo(),u.getAddress(),u.getStatus());
                            System.out.println("The Your Modification is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 2 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails u = new UpdateAdhaarDetails ();
                            System.out.println("Enter New Mobile Number");
                            long mobNo = sc.nextLong();
                            a=new UpdateAdhaarDetails(u.getAdhaarName(),mobNo,u.getAddress(),u.getStatus());
                            System.out.println("The Your Modification is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }                    
                    }
                    break;
                    case 3 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails u = new UpdateAdhaarDetails ();
                            System.out.println("Enter New Address");
                            String address = sc.next();
                            a=new UpdateAdhaarDetails(u.getAdhaarName(),u.getMobNo(),address,u.getStatus());
                            System.out.println("The Your Modification is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 4 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails u = new UpdateAdhaarDetails ();
                            System.out.println("Enter New Status");
                            String status = sc.next();
                            a=new UpdateAdhaarDetails(u.getAdhaarName(),u.getMobNo(),u.getAddress(),status);
                            System.out.println("The Your Modification is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 5 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            System.out.println("Enter New Name");
                            String name = sc.next();
                            System.out.println("Enter New Mobile Number");
                            long mobNo = sc.nextLong();
                            System.out.println("Enter New Address");
                            String address = sc.next();
                            System.out.println("Enter New Status");
                            String status = sc.next();
                            a=new UpdateAdhaarDetails(name,mobNo,address,status);
                            System.out.println("The Your Modification is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    default : {
                        System.out.println("This Service Not Available :(");
                        System.out.println("--------------------------");
                    }
                }               
            } 
            
            else if (choice == 2) {
                ApleSarkaar a1 = new ApleSarkaar();
                System.out.println("Welcome Here For New Registration :)");
                System.out.println("Press Enter fot Further Process");
                String enter = sc.next();
                if (enter.equalsIgnoreCase("Enter")) {
                    System.out.println("Enter The Your Appoinment Number First (Gen Id)");
                    long appointNumber = sc.nextLong();                    
                    if (a1.getAppointNumber() == appointNumber) {            
                        System.out.println("Enter Your Full Name");
                        String name = sc.next();
                        System.out.println("Enter Your Full Address");
                        String address = sc.next();
                        System.out.println("Enter Your Gender : M / F >>");
                        char gender = sc.next().charAt(0);
                        System.out.println("Enter Your Mobile Number");
                        long mobNo = sc.nextLong();
                        System.out.println("Enter Your Age");
                        int age = sc.nextInt();
                        System.out.println("Enter Your Relational Status");
                        String status = sc.next();
                        a = new NewRegistration (name,address,gender,mobNo,age,status);
                        System.out.println("Your Registration is Completed (Adhaar Generate Successully)...Now You Can Update/Modify Your Details AS PER YOUR DEMAND\nThank you...... :)");
                        System.out.println("--------------------------------");
                    }
                    else {
                        System.out.println("You Entered Wrong Appoint Number...Please Enter Correct Appointment Number");
                        System.out.println("-------------------------------------------");
                    }
                }
                else {
                    System.out.println("Please Try Again With Pressing Enter");
                }
            }
            else {
                System.out.println("This Service are not available :(....Try With Valid Input");
                System.out.println("-----------------------------------");
            }  
        }
        else {
            System.out.println("Your Are Already Registered / Updated Your Details...\n(If You Want Change Again, First CANCEL your Existing Modification/Regestration)");
        }
    }



    public void cancelModificationOrRegistration() {
        Scanner sc = new Scanner (System.in);
        if (this.a==null) {
            System.out.println("First Create/Update Adhaar");
            System.out.println("-------------------------------");           
        }
        else {
            ApleSarkaar a1 = new ApleSarkaar();
            System.out.println("Enter The Your Appoinment Number First (Gen Id)");
            long appointNumber = sc.nextLong();
            if (a1.getAppointNumber() == appointNumber) { 
                this.a=null;
                System.out.println("Your all Existing Updates And Registration are Cancelled Successfully.");
                System.out.println("--------------------------------");
            }
            else {
                System.out.println("You Entered Wrong Appoint Number...Please Enter Correct Appointment Number");
                System.out.println("-------------------------------------------");
            }
        }
    }



    public void checkRegistrationOrModificationProcessDoneOrNot () {
        Scanner sc = new Scanner (System.in);
        if (this.a == null) {
            System.out.println("First Create/Update Adhaar....it's Not Done..!");
            System.out.println("-------------------------------");
        }
        else {
            ApleSarkaar a1 = new ApleSarkaar();
            if (a instanceof UpdateAdhaarDetails) {
                System.out.println("Enter The Your Aadhaar Number First..");
                long aadhaarNum = sc.nextLong();
                if (a1.getAadhaarNumber()==aadhaarNum) {
                    System.out.println("Your Addhar Details Update Process is Done..!(You Can Track Your Application By Using Appointment Number)");
                    System.out.println("-------------------------------");
                }
                else {
                   System.out.println("you Enterd Wrong Aadhaar number :(");
                   System.out.println("--------------------------------"); 
                }
            }
            else {
                System.out.println("Enter The Your Appoinment Number First (Gen Id)");
                long appointNumber = sc.nextLong();
                if (a1.getAppointNumber() == appointNumber) { 
                    System.out.println("Your Registration Process Is Done...!(You Can Track Your Application By Using Appointment Number)");
                    System.out.println("-------------------------------");
                }
                else {
                    System.out.println("You Entered Wrong Appoint Number...Please Enter Correct Appointment Number");
                    System.out.println("-------------------------------------------");
                }
            }
        }
    }



    public void updateRegistratedOrModifiableDetailsOfAadhaar (int choice) {
        Scanner sc = new Scanner (System.in);
        if (this.a==null) {
            System.out.println("Create Or Modify Aadhaar First");
            System.out.println("-------------------------------");
        }
        else {
            ApleSarkaar a1 = new ApleSarkaar();
            if (choice == 1) {
                System.out.println("What you Want Update in Existing Modifieds Details\n1.adhaar name\n2. Mobile Number\n3. Address\n4. status\n5. I Want All Update");
                int update = sc.nextInt();
                switch (update) {
                    case 1 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                            System.out.println("Enter New Name");
                            String name = sc.next();
                            ref.setAdhaarName(name);
                            System.out.println("Name Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 2 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                            System.out.println("Enter New Mobile Number");
                            long mobNo = sc.nextLong();
                            ref.setMobno(mobNo);
                            System.out.println("Mobile Number Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 3 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                            System.out.println("Enter New Address");
                            String address = sc.next();
                            ref.setAddress(address);
                            System.out.println("Addreaa Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 4 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                            System.out.println("Enter New Status");
                            String status = sc.next();
                            ref.setStatus(status);
                            System.out.println("Status Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 5 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                            System.out.println("Enter New Name");
                            String name = sc.next();
                            ref.setAdhaarName(name);
                            System.out.println("Enter New Mobile Number");
                            long mobNo = sc.nextLong();
                            ref.setMobno(mobNo);
                            System.out.println("Enter New Address");
                            String address = sc.next();
                            ref.setAddress(address);
                            System.out.println("Enter New Status");
                            String status = sc.next();
                            ref.setStatus(status);
                            System.out.println("The Your Updation For All is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    default : {
                        System.out.println("This Service Not Available :(");
                        System.out.println("--------------------------");
                    }
                }
            }

            else if (choice == 2) {
                System.out.println("What you Want Update in Existing Registered Details\n1.adhaar name\n2. Address\n3. Mobile Number\n4. Status\n5. I want Update All");
                int update = sc.nextInt();
                switch (update) {
                    case 1 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            NewRegistration newRef = (NewRegistration)a;
                            System.out.println("Enter New Name");
                            String name = sc.next();
                            newRef.setName(name);
                            System.out.println("Name Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 2 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            NewRegistration newRef = (NewRegistration)a;
                            System.out.println("Enter New Address");
                            String address = sc.next();
                            newRef.setAddress(address);
                            System.out.println("Address Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 3 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            NewRegistration newRef = (NewRegistration)a;
                            System.out.println("Enter New Mobile Number");
                            long mobNo = sc.nextLong();
                            newRef.setMobNum(mobNo);
                            System.out.println("Mobile Number Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 4 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            NewRegistration newRef = (NewRegistration)a;
                            System.out.println("Enter New Status");
                            String status = sc.next();
                            newRef.setStatus(status);
                            System.out.println("Status Updated Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    case 5 : {
                        System.out.println("Enter The Your Aadhaar Number First..");
                        long aadhaarNum = sc.nextLong();
                        if (a1.getAadhaarNumber()==aadhaarNum) {
                            NewRegistration newRef = (NewRegistration)a;
                            System.out.println("Enter New Name");
                            String name = sc.next();
                            newRef.setName(name);
                            System.out.println("Enter New Address");
                            String address = sc.next();
                            newRef.setAddress(address);
                            System.out.println("Enter New Mobile Number");
                            long mobNo = sc.nextLong();
                            newRef.setMobNum(mobNo);
                            System.out.println("Enter New Status");
                            String status = sc.next();
                            newRef.setStatus(status);
                            System.out.println("The Your Updation For All is Successully Done");
                            System.out.println("--------------------------------");
                        }
                        else {
                            System.out.println("you Enterd Wrong Aadhaar number :(");
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                    default : {
                        System.out.println("This Service Not Available :(");
                        System.out.println("--------------------------");
                    }
                }
            }
            else {
                System.out.println("This Service are not available :(....Try With Valid Input");
                System.out.println("-----------------------------------");
            }
        }
    }



    public void displayMyAllDetails () {
        ApleSarkaar a1 = new ApleSarkaar();
        Scanner sc = new Scanner (System.in);      
        if (this.a==null) {
            UpdateAdhaarDetails u = new UpdateAdhaarDetails ();
            System.out.println("Enter The Your Existing Aadhaar Number First..");
            long aadhaarNum = sc.nextLong();
            if (a1.getAadhaarNumber()==aadhaarNum) {
                UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                System.out.println("This Is Your Current Aadhaar Details >>>");
                System.out.println("Welocme To "+u.getName()+", Here is Your All Details >>>\n");
                System.out.println("Aadahaar Number : "+u.getAadhaarNumber());
                System.out.println("Aadhaar Name : "+u.getAdhaarName());
                System.out.println("Aadhaar Linked Mobile Number : "+u.getMobNo());
                System.out.println("Address On Adhaarr: "+u.getAddress());
                System.out.println("Your Status : "+u.getStatus());
                System.out.println("Your Gender : "+u.getGender());
                System.out.println("Your Age : "+u.getAge());
                System.out.println("-----------------------------------");
            }
            else {
                System.out.println("you Enterd Wrong Aadhaar number :( Try With Valid Aadhaar Number...");
                System.out.println("--------------------------------");
            }
            if (a1.getAadhaarNumber()==aadhaarNum) {
                System.out.println("This Is Yours Existing Aadhaar Details....if You Want Create New Aadhaar Or Modify Your Existing Aadhaar Then Press 1");
                System.out.println("-----------------------------------");
            }
            a=null;
        }
        else {
            if (a instanceof UpdateAdhaarDetails) {                
                System.out.println("Enter The Your Existing Aadhaar Number First..");
                long aadhaarNum = sc.nextLong();
                if (a1.getAadhaarNumber()==aadhaarNum) {
                    UpdateAdhaarDetails ref = (UpdateAdhaarDetails)a;
                    System.out.println("Welocme To "+ref.getName()+", Here is Your All Details >>>\n");
                    System.out.println("Aadhaar Number : "+ref.getAadhaarNumber());
                    System.out.println("Aadhaar Name : "+ref.getAdhaarName());
                    System.out.println("Aadhaar Linked Mobile Number : "+ref.getMobNo());
                    System.out.println("Address On Adhaarr: "+ref.getAddress());
                    System.out.println("Your Gender : "+ref.getGender());
                    System.out.println("Your Status : "+ref.getStatus());
                    System.out.println("Your Age : "+ref.getAge());
                    System.out.println("-----------------------------------");
                }
                else {
                    System.out.println("you Enterd Wrong Aadhaar number :(");
                    System.out.println("--------------------------------");
                }
            }
            else if (a instanceof NewRegistration) {
                System.out.println("Enter The Your New Aadhaar Number First..");
                long aadhaarNum = sc.nextLong();
                if (a1.getAadhaarNumber()==aadhaarNum) {
                    NewRegistration newRef = (NewRegistration)a;
                    System.out.println("Welocme To "+newRef.getName()+", Here is Your All Details >>>\n");
                    System.out.println("Appoinment Number 'Id' : "+newRef.getAppointNumber());
                    System.out.println("Aadhaar Name : "+newRef.getName ());
                    System.out.println("Your New Aadhaar Number : "+newRef.getAadhaarNumber());
                    System.out.println("Address On Aadhaar : "+newRef.getAddress());
                    System.out.println("Your Gender : "+newRef.getGender());
                    System.out.println("Aadhaar Linked Mobile Number : "+newRef.getMobNum());
                    System.out.println("Your Age : "+newRef.getAge());
                    System.out.println("Your Status : "+newRef.getStatus());
                    System.out.println("-----------------------------------");
                }
                else {
                    System.out.println("you Enterd Wrong Aadhaar number :(");
                    System.out.println("--------------------------------");
                }
            }
            else {
                System.out.println("Something is Wrong..!!??\n");
            }
        }
    }



    public void trackStatusOfYourAadhaar (int choice) {
        Scanner sc = new Scanner (System.in);
        if (this.a==null) {
            System.out.println("First Create Or Modify Your Aadhaar");
            System.out.println("-----------------------------------");
        }
        else {
            ApleSarkaar a1 = new ApleSarkaar();
            if (choice == 1) {
                System.out.println("Enter The Appointment Id First For Tracking... ");
                long appointNumber = sc.nextLong();
                if (a1.getAppointNumber()==appointNumber) {
                    System.out.println("Your Aadhaaar Are Under Processs....Try Again In Few Days........");
                    System.out.println("-----------------------------------");
                }
                else {
                    System.out.println("You Entered Wrong Appointment Id :(");
                    System.out.println("--------------------------------");
                }
            }
            else if (choice ==2) {
                System.out.println("Enter The Appointment Id First For Tracking...");
                long appointNumber = sc.nextLong();
                if (a1.getAppointNumber()==appointNumber) {
                    System.out.println("Your Aadhaaar Are Under Processs....Try Again In Few Days........");
                    System.out.println("-----------------------------------");
                }
                else {
                    System.out.println("You Entered Wrong Appointment Id :(");
                    System.out.println("--------------------------------");
                }
            }
            else {
                System.out.println("This Service Not Available :(");
                System.out.println("--------------------------------");
            }
        }
    }



    public void trackAfterFewDays (int choice) {
        Scanner sc = new Scanner (System.in);
        if (this.a==null) {
            System.out.println("First Create Or Modify Your Aadhaar");
            System.out.println("-----------------------------------");
        }
        else {
            ApleSarkaar a1 = new ApleSarkaar();
            if (choice == 1) {
                System.out.println("Enter The Appointment Id First For Tracking... ");
                long appointNumber = sc.nextLong();
                if (a1.getAppointNumber()==appointNumber) {
                    System.out.println("Your Aadhaaar Are Updated Successfully, Thanks For Using Aple Sarkaar :) ");
                    System.out.println("-----------------------------------");
                }
                else {
                    System.out.println("You Entered Wrong Appointment Id :(");
                    System.out.println("--------------------------------");
                }
            }
            else if (choice ==2) {
                System.out.println("Enter The Appointment Id First For Tracking...");
                long appointNumber = sc.nextLong();
                if (a1.getAppointNumber()==appointNumber) {
                    System.out.println("Your Aadhaaar Are Updated Successfully, Thanks For Using Aple Sarkaar :) ");
                    System.out.println("-----------------------------------");
                }
                else {
                    System.out.println("You Entered Wrong Appointment Id :(");
                    System.out.println("--------------------------------");
                }
            }
            else {
                System.out.println("This Service Not Available :(");
                System.out.println("--------------------------------");
            }
        }
    }
}
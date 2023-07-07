import java.util.Scanner;
class Driver_For_CreateOrUpdate_Class {
    public static void main (String [] Project) {
        Scanner sc = new Scanner(System.in);
        CreateOrUpdate ref = new CreateOrUpdate (); 
        boolean condition = true;
        while (condition) {
            System.out.println("Welcome On Aaple Sarkaar WebPage >>> Here is Some Preferencess For You :\n1. Create New Aadhar Card Or Modify Existing Adhaar Details\n2. Cancel Your Applying Modification Or Registration !!\n3. Check Registration Or Modification Process Are Done Or Not !\n4. Update Registrated Or Modifiable Details Of Aadhaar\n5. Display/Show The Aadhaar Details\n6. Track Status Of Your Aadhaar\n7. Track Status Of Your Aadhaar After Few Days\n8. Exit The Website ");
            int Preferencess = sc.nextInt();
            switch(Preferencess) {
                case 1 : {
                    System.out.println("Welcome On Aaple Sarkaar WebPage >>> Here is Some Choices For You :\n1. Modify The Existing Aadhaar Card Details\n2. Create New Aadhar Card (New Registration) ");
                    int choice = sc.nextInt();
                    ref.createNewOrModifyExistingAdhaarDetails(choice);
                }
                break;
                case 2 : ref.cancelModificationOrRegistration();
                break;
                case 3 : ref.checkRegistrationOrModificationProcessDoneOrNot();
                break;
                case 4 : {
                    System.out.println("Welcome On Aaple Sarkaar WebPage >>> Here is Some Choices For You :\n1. Update The Existing Modifiable Aadhaar Card Details\n2. Update The Existing Registrated Aadhar Card Details");
                    int choice = sc.nextInt();
                    ref.updateRegistratedOrModifiableDetailsOfAadhaar (choice);
                }
                break;
                case 5 : ref.displayMyAllDetails();
                break;
                case 6 : {
                    System.out.println("Welcome On Aaple Sarkaar WebPage >>> Here is Some Choices For You :\n1. Track Existing Modifiable Adhaar Card Status\n2. Track The Existing Registrated Aadhar Card Status");
                    int choice = sc.nextInt();
                    ref.trackStatusOfYourAadhaar(choice);
                }
                break;
                case 7 : {
                    System.out.println("Welcome On Aaple Sarkaar WebPage >>> Here is Some Choices For You :\n1. Track Existing Modifiable Adhaar Card Status After Few Days \n2. Track The Existing Registrated Aadhar Card Status After Few Days");
                    int choice = sc.nextInt();
                    ref.trackAfterFewDays(choice);
                }
                break;
                case 8 : {
                    condition = false;
                    System.out.println("The Website Closed/Exit Successfully.....Thanks For Visit Us :)");
                }
                break;
                default : {
                    System.out.println("Something Went Wrong This Preference is Not Available On Our Webiste :( >>> Try Again With Valid Preferencess :)");
                }
            }
        }
    }
}
class UpdateAdhaarDetails extends ApleSarkaar {
    private String adhaarName = "Suraj Ramling Raut";
    private long mobNo = 8208627035l;
    private String address = "Manjarai Nagar Manjari B.k";
    private String status = "Single";
    private char gender = 'M';
    private int age = 22;

    UpdateAdhaarDetails(String adhaarName,long mobNo,String address,String status){
        this.adhaarName=adhaarName;
        this.mobNo=mobNo;
        this.address=address;
        this.status=status;
    }
    UpdateAdhaarDetails() {

    }
    public String getAdhaarName () {
        return adhaarName;
    }
    public void setAdhaarName (String adhaarName) {
        this.adhaarName=adhaarName;
    }
    public long getMobNo () {
        return mobNo;
    }
    public void setMobno (long mobNo) {
        this.mobNo=mobNo;
    }
    public String getAddress () {
        return address;
    }
    public void setAddress (String address) {
        this.address=address;
    }
     public String getStatus () {
        return status;
    }
    public void setStatus (String status) {
        this.status=status;
    }
    public char getGender ()  {
        return gender;
    }  
    public int getAge() {
        return age;
    } 
    public static void main(String[]args) {

    }
}
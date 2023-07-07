class NewRegistration extends ApleSarkaar {
    private String name;
    private String address;
    private char gender;
    private long mobNo;
    private int age;
    private String status;
    NewRegistration(String name,String address,char gender,long mobNo,int age,String status) {
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.mobNo=mobNo;
        this.age=age;
        this.status=status;
    }
    public String getName () {
        return name;
    }
    public String getAddress () {
        return address;
    }
    public char getGender () {
        return gender;
    }
    public String getStatus () {
        return status;
    }
    public long getMobNum () {
        return mobNo;
    }
    public int getAge () {
        return age;
    }  
    public void setName (String name) {
        this.name=name;
    }
    public void setAddress (String address) {
        this.address=address;
    }
    public void setStatus (String status) {
        this.status=status;
    }
    public void setMobNum (long mobNo) {
        this.mobNo=mobNo;
    }
    public void setAge (int age) {
        this.age=age;
    }
}
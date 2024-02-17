public class Student {
    public String name;
    public String fatherName;
    public String dateOfBrth;
    public String mobileNum;
    public Address address;

    public Student(String name,String fatherName,String dateOfBrth,
                   String mobileNum,Address address){
        this.name=name;
        this.fatherName=fatherName;
        this.dateOfBrth=dateOfBrth;
        this.mobileNum=mobileNum;
        this.address=address; //admission time parent address

    }
    // Address add=new Address();
    public Student(String name,String fatherName,String dateOfBrth,String mobileNum){
        this(name,fatherName,dateOfBrth,mobileNum,new Address());
//exam time  schooladdress
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dateOfBrth='" + dateOfBrth + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", address=" + address +
                '}';
    }
}

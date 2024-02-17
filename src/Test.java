public class Test {

    public static void main(String[] args) {

        Address address=new Address();
        address.city="NijamPet";
        address.pinCode="507318";
        Student student=new Student("Siri","venkatiramulu",
                "01/01/2020","7538787828",address);
        System.out.println(" joining Student  " +student);

        Student examStudent= new Student("sree","venkati",
                "01/01/2021","345678");

        System.out.println("Exam Student " +examStudent);

    }


}
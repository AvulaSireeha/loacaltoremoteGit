public class Address {

    public String city;
    public String sate;
    public String country;
    public String pinCode;

    public Address(){
        this.city="hyd";
        this.pinCode="500036";
        this.sate="telangana";
        this.country="India";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", sate='" + sate + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

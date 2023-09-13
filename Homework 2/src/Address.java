public class Address {
    public static void main(String[] args){}
    int number;
    int street;
    int apt;
    String city;
    String state;
    int zipCode;

    //with
    public Address(int number, int street, int apt,  String city, String state, int zipCode){
        this.number = number;
        this.street = street;
        this.apt = apt;
        this.city= city;
        this.state = state;
        this.zipCode = zipCode;
    }
    //without
    public Address(int number, int street, String city, String state, int zipCode){
        this.number = number;
        this.street = street;
        this.city= city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public void print(){
        System.out.println( "Street: " + number + " " + street);
        System.out.println("City: " + city + "State " + state + ", Zip Code: " + zipCode);
    }
    public Boolean comesBefore(Address other) {
        if (zipCode < other.zipCode)
            return true;
        return false;
    }
}

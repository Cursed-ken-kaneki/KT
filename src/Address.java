package ee.ivkhkdev;
public class Address {
    private String house;
    private String room;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(){
    }

    public Address(String house, String room, String street, String city, String state, String zip){
        this.house = house;
        this.room = room;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

}

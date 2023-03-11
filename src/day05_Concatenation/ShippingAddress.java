package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Yavuz HUYUK",
                buildingNumber = "123c",
                streetName = "Cami sokak",
                city = "Aksaray",
                state = "TR",
                zipCode = "68200A";

       /*
       String name = "Yavuz";
        String buildingNumber = "123c";
        String streetName = "Cami sokak";
        String city = "Aksaray";
        String state = "Türkiye";
        String zipCode = "68200A";
        */

        //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String address =name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println("address = " + address);

    }
}
/*
Declare the following variables:
        name
        buildingNumber
        streetName
        city
        state
        zipCode
 */

/*
ShippingAddress format:
        Yavuz HUYUK
        123c Cami sokak
        Aksaray, TR 68200
 */
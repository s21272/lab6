public class Address {
    public String addrest(String country) {
        //System.out.println("Addrest:  "+ country);
        return String.format("country: "+ country);
    }

    public String addrest(String country, String city) {
        //System.out.println("Addrest:  "+ country + ","+ city);
        return String.format("country: " +country+ ", city: "+city);
    }

    public String addrest(String country, String city, int code) {
        //System.out.println("Addrest:  "+ country + ", "+ city + ", " + code);
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code);
    }

    public String addrest(String country, String city, int code, String street) {
        //System.out.println("Addrest:  "+ country + ", "+ city + ", " + code +", "+street);
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code+ ", street:  " +street);
    }

    public String addrest(String country, String city, int code, String street, int apartment) {
        //System.out.println("Addrest:  "+ country + ", "+ city + ", " + code +", "+street+", "+apartment);
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code+ ", street:  " +street+ ", apartment: " +apartment);
    }
}

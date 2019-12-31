package exercise.insert_obj_in_arrays;

public class Data {

    private String name ;
    private String address;
    private String email;
    private Integer mobile;

    public Data(String name, String address, String email, Integer mobile) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
    }

//    public void Data(String n, String a, String c){
//
//        name = n;
//        address = a;
//        cell = c;
//    }
    public void printData(){
        System.out.println("Name "+this.name );
        System.out.println( "Address "+ this.address );
        System.out.println("Email No. " + this.email);
        System.out.println("Mobile No. " + this.mobile);
    }
}




package exercise.insert_obj_in_arrays;

import java.util.ArrayList;

public class DataExe {

    public static void main(String args[]) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Plz enter Name : ");
//        String name = input.nextLine();
//        System.out.println("Plz enter Address : ");
//        String address = input.nextLine();
//        System.out.println("Plz enter Email : ");
//        String email = input.nextLine();
//        System.out.println("Plz enter Mobile : ");
//        Integer mobile = input.nextInt();


        ArrayList<Data> Contacts = new ArrayList<Data>();
//        Data objt = new Data(name, address, email, mobile); // Creating a new object
        Data objt = new Data("Tammam", "Vienna", "name@mail.com", 688688688); // Creating a new object
        Contacts.add(objt);
        objt.printData();
    }
}


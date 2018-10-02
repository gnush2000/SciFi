package com.swcomputersci;
<<<<<<< HEAD:src/SciFiName.java
public class SciFiName {
    /**
     * All input that you provide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     *
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
=======

public class SciFiName {

    public static void main(String[] args) {
>>>>>>> 6c975da12f26e23a1e1031f1a254bfe065185329:src/com/swcomputersci/SciFiName.java
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");
        // notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName =  UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.println("Enter the first name of a second sibling or relative: ");
<<<<<<< HEAD:src/SciFiName.java
        String relativeName2 = com.SWcomputerSci.UserInput.getString();
=======
        String relativeName2 = UserInput.getString();

>>>>>>> 6c975da12f26e23a1e1031f1a254bfe065185329:src/com/swcomputersci/SciFiName.java
        // generate a sciFi name
        String sciFiFirstName = firstName.substring(0, 4) + lastName.substring(0, 3);
        System.out.println(sciFiFirstName);
        String sciFiLastName = city.substring(0,3)+ school.substring(0,4);
        System.out.println(sciFiLastName);
<<<<<<< HEAD:src/SciFiName.java
=======
<<<<<<< HEAD:src/SciFiName.java


=======
>>>>>>> d52757607795ff0cfa22428afbbf44192b65a30d:src/com/swcomputersci/SciFiName.java
>>>>>>> 6c975da12f26e23a1e1031f1a254bfe065185329:src/com/swcomputersci/SciFiName.java
    }
}

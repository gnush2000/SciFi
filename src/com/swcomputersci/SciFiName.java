package com.swcomputersci;
public class SciFiName {
    /**
     * All input that you provide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     *
     * For best results, user lowercase letters and do not use spaces in your input
     */

    public static void main(String[] args) {
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
        String relativeName2 = UserInput.getString();
        // generate a sciFi name
        String sciFiFirstName = firstName.substring(0, 3) + lastName.substring(0, 2);
        System.out.println(sciFiFirstName);
        String sciFiLastName = city.substring(0,2)+ school.substring(0,3);
        System.out.println(sciFiLastName);

        int origen = (int) (Math.random()*(firstName.length()-1));

        String place = firstName.substring(origen, firstName.length());
        System.out.println(place);

        int location = (int) (Math.random()*(relativeName1.length()));
        String distance = relativeName1.substring(location, relativeName1.length());
        String distance2 = distance.toLowerCase.substring(1, distance.length());
        String distance3 = distance.toUpperCase.substring(0, 1);
        System.out.println(distance2 + distance3);

        System.out.println(place + " " + distance2 + distance3);

        System.out.println("Hello " + place + " " + distance + " of "+ city + "!");


    }
}

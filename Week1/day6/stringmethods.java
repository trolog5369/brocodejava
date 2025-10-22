
public class stringmethods {
    public static void main(String[] args) {
        // STRINGS STARTS FROM 0
        String name="Pranav";

        int length=name.length();
        // Gives the length of the string

        char letter=name.charAt(0);
        // Returns a char at a given index

        int index=name.indexOf("a");
        // Finding a letter at a given index

        int lastindex=name.lastIndexOf("a");
        // Returns the last index of a

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);

        
        // name=name.toUpperCase();
        // System.out.println(name);
        // Returns the string in upper case

        // name=name.toLowerCase();
        // System.out.println(name);
        // Returns the string in lower case

        // We can also eliminate the white space
        // name=name.trim();
        // System.out.println(name);
        // As there are no white spaces in the string hence string gets returned as it is!

        // We can also replace the char with another one
        // name=name.replace("a", "o");
        // System.out.println(name);

        // We can check if the string is empty using isEmpty() method gives boolean result
        // System.out.println(name.isEmpty());
        // Usually use thr loops
        // if (name.isEmpty()) {
        //     System.out.println("Your name is empty  ");
        // }
        // else{
        //     System.out.println("Hello "+name);
        // }

        // We can check if string conatins a character we use contains methods in string
        // if (name.contains(" ")) {
        //     System.out.println("Your name contains a spaces");
        // }
        // else{
        //     System.out.println("Your name dosen't contain any spaces");
        // }

        // We can check if the given string is same as targeted string using equals() method
        // equals method is case sensitive
        if (name.equals("password")) {
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello "+name);
        }

        // To ignore the case sensitivity use equalsIgnoreCase() to ignore the case sensitivity
           if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello "+name);
        }



    


    }
}

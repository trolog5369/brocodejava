
public class substring2 {
    public static void main(String[] args) {
        // Suubstring()=A Method used to extract a portion of a a string
                        // .substring(start,end)
        // As we are determining the domain and username by manually we can do it automatically 
        // using the string method we are going to use the indexOf()
        // see substring.java for the previous
        

        String email="pranavgaikwad847@gmail.com";
        // String username=email.substring(0, 16);
        String username=email.substring(0,email.indexOf("@"));


        // String domain=email.substring(16, 26);
        String domain=email.substring(email.indexOf("@")+1);//to remove @ 
        // // String domain=email.substring(16); this also works only for this string hence its not flexible 
        // // As if the email changes it fails
        // // as 26 is excluded
        
        System.out.println(username);
        System.out.println(domain);

       
       
        
    }
}


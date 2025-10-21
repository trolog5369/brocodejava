public class printf {
    public static void main(String[] args) {
        // printf()= is a method used to format output
        // Its a alternative to println and print

        // %[flags][width][.precision][specifier-character]
        // %=placeholder and then var type , variable name
        //These are variables [flags][width][.precision][specifier-character]

        String name="Spongebob";
        char firstLetter='s';
        int age=30;
        double height=60.5;
        boolean isEmloyed=true;

        System.out.printf("hello %s\n",name);
        System.out.printf("Your name starts with a %c\n",firstLetter);
        System.out.printf("You are %d years old\n", age);
        // we use %d for int here....(remember gng)
        System.out.printf("You are %.1f inches tall\n",height);
        // .1 is a precision
        System.out.printf("Employed: %b\n",isEmloyed);

        // printing multiple var in one statement
        System.out.printf("%s is %d years old\n",name,age);

        // PRECISIONS
        // We can limit the amount of digits we dispaly thr precisions

        double price1=9.9;
        double price2=100.15;
        double price3=-54.01;

        System.out.printf("%f\n",price1);
        System.out.printf("%f\n",price2);
        System.out.printf("%f\n",price3);
        // Output: we can limit the no of digit using precision
        //9.900000
        //100.150000
        //-54.010000

        System.out.printf("%.2f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.2f\n",price3);
        // Now it will make the round the output to .2 precision
        // similar for .1,.3,.4 and so on...

        // FLAGS SPECIFIER

        // + = output a plus
        // , = comma grouping seperator
        // ( = neagtive numbers are enclosed in ()
        // space = display a minus if neagtive,space if possible

        // + = output a plus
        double price4=9000.9;
        double price5=10000.15;
        double price6=-54000.01;

        System.out.printf("%+.2f\n",price4);
        System.out.printf("%+.2f\n",price5);
        System.out.printf("%+.2f\n",price6);
        // These are printed + plus now as the -54000.01 is -(negative) hence 
        //+9000.90
        // +10000.15
        // -54000.01

        // ( = neagtive numbers are enclosed in ()
        System.out.printf("%(.2f\n",price4);
        System.out.printf("%(.2f\n",price5);
        System.out.printf("%(.2f\n",price6);
        // These are printed ( negative into ()
        // As only the 54000.01 is negative hence only its gets (54000.01) rest stays the same

        // space = display a minus if neagtive,space if possible
        System.out.printf("% .2f\n",price4);
        System.out.printf("% .2f\n",price5);
        System.out.printf("% .2f\n",price6);


        // WIDTH SPECIFIER
        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;

        // These integars have a diff set off width but we can aligh them using width speciifer

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);
        // now we have pad the number by 0 hence if we dont want 0 simply remove it 
        // System.out.printf("%4d\n",id1); like this it will print blank spaces instaed now

        // If a number is neagtive we sue left justified by simply adding - before %4d
        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);
        // Now it will print the spaces thr leftjustified 






    }
}


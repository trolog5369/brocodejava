
// This is an enum class
public enum Day {
    //Ennums constants are written in all Captial letters
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    // No other day can be created as these are fixed hence enums are realibale than Strings
    // Enums constants can also have extra info in them such as values ie dayNumber

    private final int dayNumber;//as we dont want it to be accesed and get changed and its final values!

    // Constructor
    Day(int dayNumber){
        this.dayNumber=dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}
// Enums they are safe replacement for strings when the choices are limited
// Use enums when choices are fixed.
// Use Strings only when values are free-form.
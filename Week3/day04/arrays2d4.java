public class arrays2d4 {
    public static void main(String[] args) {
        // create a 2d arrays that resembles a telephone number pad

        char[][] telephone={{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}};

    //for rows 
    for(char[] row:telephone ){
        // for columns
        for(char number:row){
            System.out.print(number+" ");
        }
        System.out.println();
    }
    }
}

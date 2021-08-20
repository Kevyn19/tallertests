

public class UnitTes {

    public static void main(String[] args) {
        isNull();
        nLessThanZero();
    }

    public static void isNull(){
        try {
            DevTest.splitString(null,5);
        }catch (NullPointerException e){
            System.out.println("It return a NullPointerException");
        }

    }

    public static void nLessThanZero(){
        try {
            DevTest.splitString("gfgfd",-5);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("It return a StringIndexOutOfBoundsException");
        }
    }

}

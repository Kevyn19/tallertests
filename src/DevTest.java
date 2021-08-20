public class DevTest {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy"; //length 25
        int split_number = 5;
        splitString(str, split_number);

        str = "abcfdefghijkl"; //length 13
        split_number = 3;
        splitString(str, split_number);

        str = "abcfdefghi"; //length 10
        split_number = 2;
        splitString(str, split_number);
    }

    public static void splitString(String str1, int n) {
      if(str1.length() % n !=  0){
          System.out.println("Not possible to have equal parts!");
      }else{
          int i =0;
          while(i <= str1.length() - n){
              System.out.println(str1.substring(i, i+n));
              i = i+n;
          }
      }
    }
}

/**
 * Created by Alex on 05.07.2015.
 */
public class App {

    public static void main(String[] args) {
        String[] arr = {"4mila", "ra51m4u", "11mama1", "papa"};
        print(superSort(arr));
    }
    public static void print(String[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static String[] superSort(String[] array){
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(compareStrings(array[j], array[j+1])){
                    String tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    //true if s1>s2("1sa25s" > "2b9n")
    public static boolean compareStrings(String s1, String s2){
        int length;
        if (s1.length()>s2.length()){
            length = s2.length();
        } else {
            length = s1.length();
        }
        for (int i = 0; i < length; i++) {
            if(stringWithoutNum(s1).charAt(i) >
                    stringWithoutNum(s2).charAt(i)){
                return true;
            } else if (stringWithoutNum(s1).charAt(i) <
                    stringWithoutNum(s2).charAt(i)){
                return false;
            }
        }
        if(length==s2.length()){
            return true;
        }else return false;
    }


    public static boolean isInteger(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static String stringWithoutNum(String s){
        String[] arr = s.split("");
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (isInteger(arr[i])){
                continue;
            }
            strb.append(arr[i]);
        }
        return strb.toString();
    }
}


public class LongestPrefix {

    public static void main(String[] args) {
        String [] strArr = {"dog","racecar","car"};

        System.out.println(LongPref(strArr));
    }

    public static String LongPref (String [] strArr){
        if (strArr.length == 0){
            return "";
        }else if (strArr.length == 1)
            return strArr[0];
        String first = strArr[0]; 
        String result = ""; 

        for (int i = 1; i < strArr.length; i++){
            int smallerWord = Math.min(first.length(), strArr[i].length()); 
            String temp = ""; 
            for(int j = 0; j < smallerWord; j++){
                if(first.charAt(j)==strArr[i].charAt(j))
                temp = temp+ first.charAt(j);
                else continue; 
            }
            if (temp.length()<result.length())
            result = temp;
        }
        return result; 
    }
}
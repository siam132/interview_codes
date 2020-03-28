import java.util.*;

class BalancedString {
    public static void main(String[] args) {
        String s = "RLLRR"; 

        System.out.println(BalanceStr(s));
    }

    public static int BalanceStr(String str) {
        Stack <Character> stack = new Stack<Character>();
        int count = 0; 
        char firstChar = str.charAt(0);
        char secondChar = firstChar == 'L' ? 'R' : 'L';

        for(int i = 0; i<str.length(); i++){
            if( stack.empty()){
                count++; 
                char temp = firstChar; 
                firstChar = secondChar; 
                secondChar  = temp; 
             }
           if(str.charAt(i)==firstChar){
                stack.push(str.charAt(i)); 
            } if (str.charAt(i)==secondChar&&!stack.empty()){
                stack.pop(); 
            }
        }


         System.out.println(firstChar+" "+secondChar);
        return count;
    }
}

/*
 * firstChar = str[0] secondChar = str[0].equals('L')?R:L;
 * 
 * for(i 0 to str.len){ 
 * if(str[i]==firstChar){ st.push(str[i]) }
 * else if(str[i]==secondChar&&!!st.isEmpty)
 * { st.pop(); 
 * }else if(st.isEmpty) count++
 * }
 * 
 */

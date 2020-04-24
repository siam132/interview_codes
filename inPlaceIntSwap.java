
public class inPlaceIntSwap {
    public static void main(String[] args) {
        System.out.println(swapInt(-5,-6));
    }

   public static String swapInt(int a, int b){
        a = a+b; 
        b = a-b; 
        a = a-b; 

        return "a  = "+a+"\tb = "+b; 

    }

}


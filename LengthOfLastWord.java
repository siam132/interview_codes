class LengthOfLastWord{

    public static void main(String[] args) {

        LengthOfLastWord lastWord = new LengthOfLastWord(); 
        String str = "Hello World"; 

        System.out.println(lastWord.LastLength(str)); 
        
    }

    public int LastLength(String s){

        if(s.equals(" "))
        return 0;
        String [] strArr = s.split(" "); 

        return strArr[strArr.length-1].length();

    }
}
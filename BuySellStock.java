class BuySellStock {
    public static void main(String[] args) {
        BuySellStock buySellStock = new BuySellStock(); 
        int [] prices = {1,2,3,4,5}; 
        System.out.println(buySellStock.totalPossbileProfit(prices));
    }

    public int maxProfit(int [] prices){
        int maxProfSoFar = 0;
        int currProf = 0;  
        int lowestPrice = Integer.MAX_VALUE; 

        for(int i = 0; i < prices.length; i ++){
            currProf = Math.max(prices[i]-lowestPrice, 0); 
            maxProfSoFar = Math.max(currProf,maxProfSoFar); 
            lowestPrice = Math.min(lowestPrice, prices[i]);

        }

        return maxProfSoFar; 
    }




    public int totalPossbileProfit(int [] prices){

        int totalProfSoFar = 0;
        int currProf = 0;  
        int lowestPrice = Integer.MAX_VALUE; 

        for(int i = 0; i < prices.length; i ++){
            currProf = Math.max(prices[i]-lowestPrice, 0); 
            totalProfSoFar += currProf; 
            lowestPrice = Math.min(lowestPrice, prices[i]);

        }

        return totalProfSoFar; 
    }
}
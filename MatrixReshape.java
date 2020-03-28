class MatrixReshape{ 


    public static void main(String[] args) {

        int [][] arr = {{1,2,3},
                        {3,2,1},
                        {1,1,0}};

        // System.out.println("Row: "+arr.length);
        // System.out.println("Column: "+arr[0].length);
        // System.out.println("Total cell: "+ arr[0].length*arr.length);

        MatrixReshape matrixReshape = new MatrixReshape(); 

        int [][] testMatrix = matrixReshape.matrixReshape(arr, 1, 1);

       matrixReshape.printMatrix(testMatrix);

        
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if(r*c != nums[0].length*nums.length)
            return nums; 
         
        int index1 = 0 , index2 = 0; 
        int [][] retMatrix = new int [r][c]; 

            for(int i = 0; i < nums.length ; i++){ 
                for(int j = 0; j < nums[0].length; j++){ 
                    if(index2 == c){
                        index2 = 0; 
                        index1++; 
                    }
                    retMatrix[index1][index2] = nums[i][j]; 

                  
                    index2++; 
                }
            }

            return retMatrix; 
    }
    public void printMatrix(int[][] m){
        try{
            int rows = m.length;
            int columns = m[0].length;
            String str = "|\t";
    
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    str += m[i][j] + "\t";
                }
    
                System.out.println(str + "|");
                str = "|\t";
            }
    
        }catch(Exception e){System.out.println("Matrix is empty!!");}
    }

}
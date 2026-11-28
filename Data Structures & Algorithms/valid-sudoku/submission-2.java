class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check rows
        for (int i=0; i<9; i++){
            if(!checkRow(board[i])){
                return false;
            }
        }
        //check column
        for(int j=0; j<9; j++){
            if(!checkCol(board, j)){
                return false;
            }
        }
        //check boxes
        for(int k=0; k<9; k++){
            if(!checkBox(board, k)){
                return false;
            }
        }
        return true;
    }
    private boolean checkRow(char[] row){
        boolean[] found=new boolean[10];
        for(char c: row){
            if(c=='.'){
                continue;
            }
            int digit=c-'0';
            if(found[digit]){
                return false;
            }
            else{
                found[digit]=true;
            }
        } 
        return true;
    }
    private boolean checkCol(char[][] board, int colIdx){
        boolean[] found=new boolean[10];

        for(int i=0; i<9; i++){
            char c= board[i][colIdx];
            if(c=='.'){
                continue;
            }
            int digit=c-'0';
            if(found[digit]){
                return false;
            }
            else{
                found[digit]=true;
            }     
        } 
        return true;
    }
    private boolean checkBox(char[][]board, int boxNo){
        int i=3*(boxNo/3);
        int j=3*(boxNo%3);
        boolean[] found=new boolean[10];
        for(int a=i; a<(i+3); a++){
            for(int b=j; b<(j+3); b++){
                char c= board[a][b];
                if(c=='.'){
                continue;
            }
            int digit=c-'0';
            if(found[digit]){
                return false;
            }
            found[digit]=true; 
            }
        }
        return true; 
    }
}

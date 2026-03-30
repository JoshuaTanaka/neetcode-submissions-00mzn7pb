class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSet<Integer> horizontal = new HashSet<String>();
        HashMap<Integer, Set<Character>> horizontal = new HashMap<>(); //Row, HashSet of the character
        HashMap<Integer, Set<Character>> vertical = new HashMap<>();
        HashMap<Integer, Set<Character>> square = new HashMap<>();
        //row and horizontal 1-3 is square 1, 
        for(int i =0; i < board.length; i++){
            for(int j=0; j< board[0].length; j++){
                char temp = board[i][j];
                if(temp == '.'){
                    continue;
                }          
                horizontal.computeIfAbsent(i, k -> new HashSet<>());
                vertical.computeIfAbsent(j, k -> new HashSet<>());
                square.computeIfAbsent((i / 3) * 3 + (j / 3), k -> new HashSet<>());
                if(
                    horizontal.get(i).contains(temp) ||
                    vertical.get(j).contains(temp)   ||
                    square.get((i / 3) * 3 + (j / 3)).contains(temp)
                ){
                    return false;
                }  

                horizontal.get(i).add(temp);
                vertical.get(j).add(temp);
                square.get((i / 3) * 3 + (j / 3)).add(temp);
            }
        }
        return true;
    }
}

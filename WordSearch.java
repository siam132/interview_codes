class WordSearch {

    public static void main(String[] args) {

        char[][] board = { { 'C', 'A', 'A' }, { 'A', 'A', 'A' }, { 'B', 'C', 'D' }, };

        WordSearch wordSearch = new WordSearch();

        System.out.println(wordSearch.exist(board, "AAB"));

    }

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int columns = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (word.charAt(0) == board[i][j] && wordSearch(i, j, word, board, 0))
                    return true;
            }
        }

        return false;

    }

    public boolean wordSearch(int i, int j, String word, char[][] board, int index) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)
                || board[i][j] == '0')
            return false;

        if (word.length() - 1 == index) {
            return true;
        }

        board[i][j] = '0';
        index++;

        if (wordSearch(i + 1, j, word, board, index) || wordSearch(i - 1, j, word, board, index)
                || wordSearch(i, j + 1, word, board, index) || wordSearch(i, j - 1, word, board, index))
            return true;

        return false;
    }
}
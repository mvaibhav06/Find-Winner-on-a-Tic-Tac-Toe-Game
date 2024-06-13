class Solution {
    public String tictactoe(int[][] moves) {
        char[][] temp = new char[3][3];
        char current = 'X';

        for(int i=0; i<moves.length; i++){
            temp[moves[i][0]][moves[i][1]] = current;
            if (current == 'X'){
                current = 'O';
            }else {
                current = 'X';
            }

            if((temp[0][0]=='X' && temp[0][1]=='X' && temp[0][2]=='X') || (temp[1][0]=='X' && temp[1][1]=='X' && temp[1][2]=='X') || (temp[2][0]=='X' && temp[2][1]=='X' && temp[2][2]=='X') || (temp[0][0]=='X' && temp[1][1]=='X' && temp[2][2]=='X') || (temp[2][0]=='X' && temp[1][1]=='X' && temp[0][2]=='X') || (temp[0][0]=='X' && temp[1][0]=='X' && temp[2][0]=='X') || (temp[0][1]=='X' && temp[1][1]=='X' && temp[2][1]=='X') || (temp[0][2]=='X' && temp[1][2]=='X' && temp[2][2]=='X')){
                return "A";
            }
            if((temp[0][0]=='O' && temp[0][1]=='O' && temp[0][2]=='O') || (temp[1][0]=='O' && temp[1][1]=='O' && temp[1][2]=='O') || (temp[2][0]=='O' && temp[2][1]=='O' && temp[2][2]=='O') || (temp[0][0]=='O' && temp[1][1]=='O' && temp[2][2]=='O') || (temp[2][0]=='O' && temp[1][1]=='O' && temp[0][2]=='O') || (temp[0][0]=='O' && temp[1][0]=='O' && temp[2][0]=='O') || (temp[0][1]=='O' && temp[1][1]=='O' && temp[2][1]=='O') || (temp[0][2]=='O' && temp[1][2]=='O' && temp[2][2]=='O')){
                return "B";
            }

        }

        for(int i=0; i<temp.length; i++){
            if((temp[i][0]!='X' && temp[i][0]!='O') || (temp[i][1]!='X' && temp[i][1]!='O') || (temp[i][2]!='X' && temp[i][2]!='O')){
                return "Pending";
            }
        }
        return "Draw";
    }
}

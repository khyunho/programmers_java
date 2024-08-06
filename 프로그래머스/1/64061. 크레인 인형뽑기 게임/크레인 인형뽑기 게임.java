import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[][] machine = new int[board.length][board[0].length];
        List<Integer> basket = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            int[] arr = new int [board[i].length];
            for (int j = board.length - 1; j >= 0; j--) {
                arr[j] = board[j][i];
            }
            machine[i] = arr;
        }

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < machine[moves[i]-1].length; j++) {
                if (machine[moves[i]-1][j] != 0) {
                    if (basket.size() > 0 && basket.get(basket.size()-1) == machine[moves[i]-1][j]) {
                        basket.remove(basket.size()-1);
                        answer += 2;
                        break;
                    } else {
                        basket.add(machine[moves[i]-1][j]);
                        machine[moves[i]-1][j] = 0;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}


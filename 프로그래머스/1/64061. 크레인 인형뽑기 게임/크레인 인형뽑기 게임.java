import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int moveNum : moves) {
            for (int boardNum = 0; boardNum < board.length; boardNum++) {
                if (board[boardNum][moveNum-1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[boardNum][moveNum-1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[boardNum][moveNum-1]);
                    }
                    board[boardNum][moveNum-1] = 0;
                    break;
                }
            }
        }

//        int[][] machine = new int[board.length][board[0].length];
//        List<Integer> basket = new ArrayList<>();
//
//        for (int i = 0; i < board.length; i++) {
//            int[] arr = new int [board[i].length];
//            for (int j = board.length - 1; j >= 0; j--) {
//                arr[j] = board[j][i];
//            }
//            machine[i] = arr;
//        }
//
//        for (int i = 0; i < moves.length; i++) {
//            for (int j = 0; j < machine[moves[i]-1].length; j++) {
//                if (machine[moves[i]-1][j] != 0) {
//                    if (basket.size() > 0 && basket.get(basket.size()-1) == machine[moves[i]-1][j]) {
//                        basket.remove(basket.size()-1);
//                        machine[moves[i]-1][j] = 0;
//                        answer += 2;
//                        break;
//                    } else {
//                        basket.add(machine[moves[i]-1][j]);
//                        machine[moves[i]-1][j] = 0;
//                        break;
//                    }
//                }
//            }
//        }

        return answer;
    }
}


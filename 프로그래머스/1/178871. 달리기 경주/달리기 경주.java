import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i=0; i<players.length; i++) {
            map.put(players[i], i+1);
        }

        for (int i=0; i<callings.length; i++) {

            int valueKeep = map.get(callings[i])-1;
            String frontPlayerKey = players[valueKeep-1];

            map.put(players[valueKeep], valueKeep);
            map.put(players[valueKeep-1], valueKeep+1);

            String playerKeep = players[valueKeep-1];
            players[valueKeep-1] = players[valueKeep];
            players[valueKeep] = playerKeep;

        }
        
        return players;
    }
}
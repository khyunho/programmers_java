import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double stageCount = stages.length;
        Map<Integer, Double> stageMemberCountMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            stageMemberCountMap.put(i, (double) 0);
        }

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                stageMemberCountMap.put(stages[i], stageMemberCountMap.get(stages[i])+1);
            }
        }

        for (int i = 1; i <= N; i++) {
            double failCount = stageMemberCountMap.get(i);
            if (stageCount == 0) {
                stageMemberCountMap.put(i, 0.0);
            } else {
                stageMemberCountMap.put(i, failCount / stageCount);
                stageCount -= failCount;
            }
        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(stageMemberCountMap.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < N; i++) {
            answer[i] = entryList.get(i).getKey();
        }

        return answer;
    }
}
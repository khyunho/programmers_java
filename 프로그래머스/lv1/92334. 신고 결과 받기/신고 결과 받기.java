import java.util.*;

class Solution {
    public Map<String, List<String>> reportMap;
    public List<String> badUser;
    public Map<String, Integer> answerMap;
    
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        reportMap = new HashMap<>();
        answerMap = new HashMap<>();
        
        for (String value : id_list) {
            reportMap.put(value, new ArrayList<>());
            answerMap.put(value, 0);
        }
        
        addList(reportMap, report);
        getBadUser(reportMap, id_list, k);
        countResult(badUser, id_list);
        
        for (int i=0; i<id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
        }
        
        return answer;
    }
    
    public void addList(Map<String, List<String>> reportMap, String[] report) {
        for (String value : report) {
            String[] splitReport = value.split(" ");
            List<String> list = reportMap.get(splitReport[1]);
            list.add(splitReport[0]);
        }
    }
    
    public void getBadUser(Map<String, List<String>> reportMap, String[] id_list, int k) {
        badUser = new ArrayList<>();
        for (int i=0; i<reportMap.size(); i++) {
            Set<String> set = new HashSet<>(reportMap.get(id_list[i]));
            if (set.size() >= k) {
                badUser.addAll(set);
            }
        }
    }
    
    public void countResult(List<String> badUser, String[] id_list) {
        for (int i=0; i<badUser.size(); i++) {
            answerMap.put(badUser.get(i), answerMap.get(badUser.get(i))+1);
        }
    }
    
}
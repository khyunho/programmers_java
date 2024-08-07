import java.util.*;
import static java.lang.Integer.parseInt;

class Solution {
    static Map<String, Integer> termsMap;
    static List<Integer> answer;
    static int[] todayIntArray;
    static int year;
    static int month;
    static int day;

    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        answer = new ArrayList<>();
        setStandardType(terms);
        setIntArrayToday(today);
        compareDate(today, privacies);
        return answer;
    }

    public void setStandardType(String[] terms) {
        termsMap = new HashMap<String, Integer>();

        for (int i = 0; i < terms.length; i++) {
            String[] splitTerms = terms[i].split(" ");
            termsMap.put(splitTerms[0], parseInt(splitTerms[1]));
        }
    }

    public void setIntArrayToday(String today) {
        String[] todayArray = today.split("\\.");
        todayIntArray = new int[todayArray.length];
        for (int i = 0; i < todayArray.length; i++) {
            todayIntArray[i] = parseInt(todayArray[i]);
        }
    }

    public void compareDate(String today, String[] privacies) {
        for (int i = 0; i < privacies.length; i++) {
            String[] splitPrivacies = privacies[i].split(" ");
            String[] splitDate = splitPrivacies[0].split("\\.");
            setDate(splitPrivacies, splitDate);
            
            if (todayIntArray[0] > year) {
                answer.add(i+1);
            } else if (todayIntArray[0] == year && todayIntArray[1] > month) {
                answer.add(i+1);
            } else if (todayIntArray[0] == year && todayIntArray[1] == month && todayIntArray[2] >= day) {
                answer.add(i+1);
            }

        }
    }

    public void setDate(String[] splitPrivacies, String[] splitDate) {
        year = parseInt(splitDate[0]);
        month = termsMap.get(splitPrivacies[1]) + parseInt(splitDate[1]);
        day = parseInt(splitDate[2]);

        if (month > 12 && month%12==0){
            year += ((month/12)-1);
            month = 12;
        } else if (month > 12) {
            year += month/12;
            month = month%12;
        }
    }
}
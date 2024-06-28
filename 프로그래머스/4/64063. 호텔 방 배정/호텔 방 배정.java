import java.util.*;

class Solution {
    public List<Long> solution(long k, long[] room_number) {
       List<Long> answer = new ArrayList<Long>();
       Map<Long, Long> room = new HashMap<Long, Long>();

       for (long value : room_number) {
           answer.add(putRoomMap(room, value));
       }

       return answer;
    }

    public static long putRoomMap(Map<Long, Long> room, long value) {
       if (!room.containsKey(value)) {
           room.put(value, value + 1);
           return value;
       }

       long emptyRoom = putRoomMap(room, room.get(value));
       room.put(value, emptyRoom);
       return emptyRoom;
    }
}
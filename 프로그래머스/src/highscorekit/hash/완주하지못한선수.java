package highscorekit.hash;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "mislav", "stanko", "ana"}, new String[]{"mislav", "stanko", "ana"}));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> p = new HashMap<>();
        for (String s : participant) {
            if (p.containsKey(s)) p.put(s, p.get(s) + 1);
            else p.put(s, 1);
        }
        for (String s : completion) {
            if (p.get(s) == 1) p.remove(s);
            else p.put(s, p.get(s) - 1);
        }
        return p.keySet().iterator().next();
    }
}

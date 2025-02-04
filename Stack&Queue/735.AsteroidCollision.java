import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> st = new ArrayList<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            int current = asteroids[i];

            if (current > 0) {
                st.add(current);
            } else {
                while (!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < Math.abs(current)) {
                    st.remove(st.size() - 1);
                }

                if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(current)) {
                    st.remove(st.size() - 1);
                } else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(current);
                }
            }
        }

        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }
}
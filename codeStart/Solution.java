import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] visits1 = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        int frequentUser1 = solution.frequentUser(visits1);
        System.out.println("Frequent User: " + frequentUser1);  // Expected output: 1

        int[] visits2 = {5, 0, 5, 0, 5, 0, 5, 0, 1, 1, 1, 1, 1};
        int frequentUser2 = solution.frequentUser(visits2);
        System.out.println("Frequent User: " + frequentUser2);  // Expected output: 5

        int[] visits3 = {3, 2, 2, 1, 3, 2, 3, 0, 0, 1, 4, 1};
        int frequentUser3 = solution.frequentUser(visits3);
        System.out.println("Frequent User: " + frequentUser3);  // Expected output: -1
    }

    public int frequentUser(int[] visits) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int frequentVisitThreshold = visits.length / 4;

        // Step 1: Count frequency of each user (ignoring user ID 0)
        for (int user : visits) {
            if (user != 0) {
                countMap.put(user, countMap.getOrDefault(user, 0) + 1);
            }
        }

        // Step 2: Find the frequent user(s) who exceed the threshold
        int frequentUserId = -1;

        for (int userId : countMap.keySet()) {
            int count = countMap.get(userId);
            if (count > frequentVisitThreshold) {
                // If it's the first frequent user or a smaller userId, update the result
                if (frequentUserId == -1 || userId < frequentUserId) {
                    frequentUserId = userId;
                }
            }
        }

        return frequentUserId;
    }
}

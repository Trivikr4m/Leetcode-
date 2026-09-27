class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    ArrayList<Integer> survivors = new ArrayList<>();

    for (int asteroid : asteroids) {
        if (asteroid > 0) {
            survivors.add(asteroid);
        } else {
            int currentSize = Math.abs(asteroid);
            boolean destroyed = false;

            while (!survivors.isEmpty()
                    && survivors.get(survivors.size() - 1) > 0) {

                int topIndex = survivors.size() - 1;
                int topSize = Math.abs(survivors.get(topIndex));

                if (topSize < currentSize) {
                    survivors.remove(topIndex);
                } else {
                    if (topSize == currentSize) {
                        survivors.remove(topIndex);
                    }

                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                survivors.add(asteroid);
            }
        }
    }

    int[] answer = new int[survivors.size()];

    for (int index = 0; index < survivors.size(); index++) {
        answer[index] = survivors.get(index);
    }

    return answer;
    }
}
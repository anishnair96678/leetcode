class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        char[] move = moves.toCharArray();
        for (int i = 0; i < move.length; ++i) {
            if (move[i] == 'R') {
                ++horizontal;
            } else if (move[i] == 'L') {
                --horizontal;
            } else if (move[i] == 'U') {
                ++vertical;
            } else {
                --vertical;
            }
        }
        if (horizontal == 0 && vertical == 0) {
            return true;
        }
        return false;
    }
}

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0){
            if(num % 2 != 0){
                steps++;
                num -= 1;
            } else {
                steps++;
                num /= 2;    
            }
        }
        return steps;
    }
}
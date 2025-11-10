class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;                // nothing to plant
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty  = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;   // mark planted
                    n--;                // reduce remaining flowers
                    if (n == 0) return true; // early exit
                }
            }
        }
        return n <= 0;
    }
}

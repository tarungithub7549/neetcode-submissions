class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        // Find max pile
        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        int ans = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;   // ceil(pile / mid)
            }

            if (hours <= h) {
                ans = mid;
                r = mid - 1;   // try smaller speed
            } else {
                l = mid + 1;   // need faster speed
            }
        }

        return ans;
    }
}
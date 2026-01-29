    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int left = 1;
            int max = 0;
            for(int i : piles){
                if(i>max){
                    max=i;
                }
            }
            int right = max;
            int answer = right;
            while(left<=right){
                int mid = left+(right-left)/2;
                long hours = 0;
                for(int j : piles){
                    hours = hours + (int)Math.ceil((double)j/mid);
                }

                if(hours<=h){
                    answer=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            return answer;
        }
    }
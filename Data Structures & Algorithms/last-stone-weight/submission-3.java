class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stone: stones) {
            pq.offer(-1 * stone);
        }
        while(pq.size() > 1) {
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(Math.abs(s1) > Math.abs(s2)) pq.offer(s1 - s2);
            if(Math.abs(s1) < Math.abs(s2)) pq.offer(s2 - s1);
        }

        if(pq.peek() != null) {
            return Math.abs(pq.peek());
        }
        else {
            return 0;
        }
    }
}

class RecentCounter {
    Queue <Integer> q;
    public RecentCounter() {
        this.q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);

        while(q.peek() < t-3000){
            q.remove();
        }
        return q.size();
    }
}

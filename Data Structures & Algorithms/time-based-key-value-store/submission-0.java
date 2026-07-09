class TimeMap {
    private HashMap<Integer, Pair<String, String>> map = new HashMap<>();

    public TimeMap() {

    }
    
    public void set(String key, String value, int timestamp) {
        Pair<String, String> kv = new Pair<>(key, value);
        map.put(timestamp, kv);
    }
    
    public String get(String key, int timestamp) {
        int closest = -1;
        String r = "";
        for(int time : map.keySet()) {
            Pair<String, String> p = map.get(time);

            if(p.getKey().equals(key)) {
                if(time <= timestamp && time > closest) {
                    closest = time;
                    r = p.getValue();
                }
            }
        }

        return r;
        
    }
}

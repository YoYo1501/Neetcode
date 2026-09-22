
class TimeMap {
    class pair {
        String value;
        int timestamp ;

        pair(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }

    }
    Map<String, List<pair>> map;
    public TimeMap() {
        map = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>() );
        map.get(key).add(new pair(value, timestamp));
        
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<pair> List = map.get(key);
        int l = 0, r = List.size() - 1;
          String result = "";
        while(l <= r){
            int mid = l + (r - l)/2;
            
            if(List.get(mid).timestamp <= timestamp){
                 result = List.get(mid).value;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return result;
        
        
    }
}

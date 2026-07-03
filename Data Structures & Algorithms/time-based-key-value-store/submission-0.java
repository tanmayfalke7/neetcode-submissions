class TimeMap {
    public String key, value;
    public int timestamp;
    class pair{
        int timestamp;
        String value;
        pair(int t, String v){
           timestamp = t;
           value = v;
        }
    }
    HashMap<String, ArrayList<pair>> map; 
    public TimeMap() {
        map = new HashMap<>();  
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        ArrayList<pair> list = map.get(key);
        int l=0,r=list.size()-1;
        String ans = "";
        while(l<=r){
            int mid = l+(r-l)/2;
            if(list.get(mid).timestamp<=timestamp){
                ans = list.get(mid).value;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}

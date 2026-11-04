class LRUCache {
    int capacity = 0;
    ArrayList<int[]> arr;

    public LRUCache(int capacity) {
        if (capacity > 0) this.capacity = capacity;
        arr = new ArrayList<>();
    }
    
    public int get(int key) {
        for(int i=0; i<arr.size(); i++){
            int[] curr = arr.get(i);
            if(curr[0] == key){
                arr.remove(i);
                arr.add(0, curr);
                return curr[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        int flag = 0;

        for(int i=0; i<arr.size(); i++){
            int[] curr = arr.get(i);
            if(curr[0] == key){
                arr.remove(i);
                arr.add(0, new int[]{key,value});
                flag = 1;
            }
        }
        if(flag == 0 && arr.size() == capacity){
            arr.remove(arr.size()-1);
        }
        if(flag == 0) arr.add(0, new int[]{key,value});
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
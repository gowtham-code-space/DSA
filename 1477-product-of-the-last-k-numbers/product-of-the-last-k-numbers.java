class ProductOfNumbers {
    ArrayList<Integer> arr;
    int prod;
    public ProductOfNumbers() {
        arr = new ArrayList<>();
        prod = 1;
    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        int res = 1;
        int idx = arr.size()-1;
        while(k-- != 0){
            res *= arr.get(idx--);
        }
        return res;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
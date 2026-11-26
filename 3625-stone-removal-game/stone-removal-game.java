class Solution {
    public boolean canAliceWin(int n) {
        int stone = 10;
        boolean alice = true;
        while(n >= stone && stone > 0){
            n-=stone;
            alice = !alice;
            stone--;
        }
        return !alice;
    }
}
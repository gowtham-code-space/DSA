class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        long int temp = x , res = 0;
        while (temp){
            res = res*10 + temp %10;
            temp/=10;
        }
        if(res == x){
            return true;
        }
        else{
            return false;
        }
    }
};
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        for(String word: wordList) s.add(word);
        if(!s.contains(endWord)) return 0;

        q.add(beginWord);
        int level= 0;
        int lsize = 0;
        while(!q.isEmpty())
        {
            level++;
            lsize = q.size();
            while(lsize-->0)
            {
            String curr = q.poll();
                for(int i=0; i<curr.length(); i++)
                {
                    StringBuilder temp = new StringBuilder(curr);
                    for(char c='a'; c<='z'; c++)
                    {
                        temp.setCharAt(i,c);
                        String temp1 = temp.toString();
                        
                        if(temp1.equals(endWord)) return level+1;

                        if(s.contains(temp1)){
                            q.add(temp1);
                            s.remove(temp1);
                        }
                    }
                }
            }
        }
        return 0;
    }
}


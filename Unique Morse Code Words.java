class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet();
        for(String word : words){
            StringBuilder res = new StringBuilder();
            for(char c : word.toCharArray())
                res.append(arr[c-'a']); 
            
            set.add(res.toString()); 
        }
        //System.out.println(map.size());
        return set.size();
    }
}

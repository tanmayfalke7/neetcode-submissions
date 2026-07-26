class Solution {
    List<String> ans = new ArrayList<>();
    public void backtrack(int index,String digits, String[] map,StringBuilder current){
         if(index == digits.length()){
            ans.add(current.toString());
            return;
         }
         String letters = map[digits.charAt(index)-'0'];
         for(char ch : letters.toCharArray()){
            current.append(ch);
            backtrack(index+1,digits,map,current);
            current.deleteCharAt(current.length()-1);
         }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ans;
        }
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(0,digits,map,new StringBuilder());
        return ans;
    }
}

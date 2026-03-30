class Solution {

    public String encode(List<String> strs) {
        //Keep track of sizes
        //keep track of strings
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        // int[] answer = new int[Integer.parseInt(str.subString(0,str.indexOf("#")))];
        //5#Hello5#World
        List<String> answer = new ArrayList<>();
        int i =0;
        while (i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j ++;
            }
            int size = Integer.parseInt(str.substring(i, j));
            j += 1;
            i = size + j;
            answer.add(str.substring(j, i));
        }
        return answer;

    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        if(size > s2.length()){
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for(int i =0; i < size; i++){
            count1[s1.charAt(i) - 'a'] += 1;
            count2[s2.charAt(i) - 'a'] += 1;
        }

        int matches = 0;
        for(int i =0; i <  count1.length;i ++){
            if(count1[i] == count2[i]){
                matches++;
            }
        }
        //
        int left =0;
            System.out.println( Arrays.toString(count1));
            System.out.println( Arrays.toString(count2));

        System.out.println(matches);
        for(int right =size; right< s2.length();right++){
            int index;
            if(matches == 26){
                return true;
            }
            index = s2.charAt(right) - 'a';
            count2[index] += 1;
            if(count2[index] == count1[index]) {
                matches++;
            } else if(count2[index]-1 == count1[index]) {
                matches--;
            }

            System.out.println("right" +matches);
            
            System.out.println( Arrays.toString(count1));
            System.out.println( Arrays.toString(count2));
            index = s2.charAt(left)- 'a';
            count2[index] -= 1;
            if(count2[index] == count1[index]){
                matches ++;
            }else if(count2[index]+1 == count1[index]) {
                matches--;
            }
            System.out.println("left"+matches);
            
            System.out.println( Arrays.toString(count1));
            System.out.println( Arrays.toString(count2));
            left ++;

        }
        return matches == 26;
    }
}

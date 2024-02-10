package leet_code;

public class _383_RansomNote_2_CheckThis {
    public static void main(String[] args) {
        String ransomNote = "ab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

            int count[] = new int[26];

            for(int i = 0; i < ransomNote.length(); i++){
                char c = ransomNote.charAt(i);
                int index = magazine.indexOf(c, count[c - 'a']);
                if(index == -1){
                    return false;
                }
                count[c - 'a'] = index + 1;
            }

            return true;
        }
    }


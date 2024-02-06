package leet_code;

class _1528_ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int i =0;i< indices.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        return String.valueOf(ch);
        
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
}
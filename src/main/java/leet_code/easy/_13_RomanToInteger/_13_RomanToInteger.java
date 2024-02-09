package leet_code.easy._13_RomanToInteger;

class _13_RomanToInteger {

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        int res = 0;
        for (int i = 0;i < s.length(); i++) {
            if (i!=s.length()-1){
                if ((s.charAt(i) == 'I' && s.charAt(i+1) == 'V' )||(s.charAt(i) == 'I'&& s.charAt(i+1) == 'X')) {
                    res -= 1;
                    i++;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L' || s.charAt(i) == 'X'&& s.charAt(i+1) == 'C') {
                    res -= 10;
                    i++;

                } else if ((s.charAt(i) == 'C' && s.charAt(i+1) == 'D') ||  (s.charAt(i) == 'C'&& s.charAt(i+1) == 'M')) {
                    res -= 100;
                    i++;

                }
            }
                switch (s.charAt(i)) {
                    case 'I':
                        res += 1;
                        break;
                    case 'V':
                        res += 5;
                        break;
                    case 'X':
                        res += 10;
                        break;
                    case 'L':
                        res += 50;
                        break;
                    case 'C':
                        res += 100;
                        break;
                    case 'D':
                        res += 500;
                        break;
                    case 'M':
                        res += 1000;
                        break;
                }

            }
        return res;
        }


    }








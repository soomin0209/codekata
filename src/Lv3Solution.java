public class Lv3Solution {

    // 41. 이상한 문자 만들기
    public String solution41(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char[] charArr = s.toCharArray();

        for(char ch : charArr) {
            if (ch == ' ') {
                sb.append(ch);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                index++;
            }
        }

        String answer = sb.toString();
        return answer;
    }
}

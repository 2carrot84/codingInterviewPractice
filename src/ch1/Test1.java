package ch1;

/**
 * Created by eguns on 2016. 12. 20..
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();

        t.isUniqueString("가나다라12가34");
    }

    public void isUniqueString(String str) {
        boolean flag = true;

        for (int i = 0; i < (str.length()-1); i++) {
            for (int j = (i+1); j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    System.out.println("str.charAt(" + i + ") : " + str.charAt(i));
                    System.out.println("str.charAt(" + j + ") : " + str.charAt(j));

                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }

        if(flag) {
            System.out.println("모든 문자가 유일합니다.");
        }
        else {
            System.out.println("모든 문자가 유일하지 않습니다.");
        }
    }
}

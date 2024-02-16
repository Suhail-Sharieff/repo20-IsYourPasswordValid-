import java.util.Scanner;

/**
 * SuhailSharieff
 */
public class SuhailSharieff {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int v=sc.nextInt();
    for (int i = 0; i < v; i++) {
      String s=sc.next();
      int len=s.length();
      boolean valid =true;
      int small=0;
      int big=0;
      int num=0;
      int sp=0;
      if (len>=10) {
        for (int j = 0; j < s.length(); j++) {
          if (((int)(s.charAt(j))>=97)&&((int)(s.charAt(j))<=122)) {
            small++;
          }
        }
        if (small==0) {
          valid=false;
          
        }
        //containes small char
        else{
          for (int j = 1; j < len-1; j++) {
            if (((int)(s.charAt(j))>=65)&&((int)(s.charAt(j))<=90)) {
              big++;
            }
          }
          if (big==0) {
            valid=false;
          }
          //containes big letters
          else{
            for (int j = 1; j < len-1; j++) {
              if (((int)(s.charAt(j))>=48)&&((int)(s.charAt(j))<=57)) {
                num++;
              }
            }

            if (num==0) {
              valid=false;
            }
            //conatines num
            else{
              for (int j = 1; j < len-1; j++) {
                if ((s.charAt(j)=='@')||(s.charAt(j)=='#')||(s.charAt(j)=='%')||(s.charAt(j)=='&')||(s.charAt(j)=='?')) {
                  sp++;
                }
              }
              if (sp==0) {
                valid=false;
              }
            }
          }
        }






        if (valid) {
          System.out.println("YES");
        }
        else{
          System.out.println("NO");
        }
      }
      else{
        System.out.println("NO");
      }
    }

  }
}
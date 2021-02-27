package FebDay24;

public class TestDemo2 {
    /**
     *大数加法
     */


        public static String solve (String s, String t) {
            if(s==null||"".equals(s)){
                return t;
            }
            if(t==null||"".equals(t)){
                return s;
            }
            int i=s.length()-1;
            int j=t.length()-1;
            int m1=0,m2=0,carray=0;//进位
            StringBuilder sb = new StringBuilder();
            while(i>=0||j>=0){
                if(i>=0){
                    m1=s.charAt(i)-'0';
                }else{
                    m1=0;
                }
                if(j>=0){
                    m2=t.charAt(j)-'0';
                }else{
                    m2=0;
                }
                int sum=m1+m2+carray;
                carray=sum/10;
                sb.append((char)((sum%10)+'0'));
                i--;
                j--;
            }
            if(carray!=0) sb.append('1');
            sb.reverse();
            return sb.toString();
        }


    public static void main(String[] args) {
        System.out.println(solve("1", "10"));

    }
}

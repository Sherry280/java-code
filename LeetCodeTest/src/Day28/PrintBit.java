package Day28;

public class PrintBit {
    /**
     * 将一个二进制的数字转成字符串的形式进行输出
     */
    public static  String printBin(double num) {
        if(num<0||num>1){
            return "ERROR";
        }
        StringBuilder sb=new StringBuilder();
        sb.append("0.");
        double s=0.5;
        while(num>0){
            if(sb.length()>32){
                return "ERROR";
            }
            if(num<s){
                sb.append("0");
            }else{
                num=num-s;
                sb.append("1");
            }
            s/=2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        double a=0.625;
        System.out.println(printBin(a));

    }
}

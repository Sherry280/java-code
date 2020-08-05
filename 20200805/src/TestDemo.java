


public class TestDemo {
    public static void main(String[] args) {

    }



       public static void main1(String[] args) {

           System.out.println("A".compareTo("a")); // -32
           System.out.println("a".compareTo("A")); // 32
           System.out.println("A".compareTo("A")); // 0
           System.out.println("AB".compareTo("AC")); // -1
           System.out.println("刘".compareTo("杨"));

           String str = "helloworld" ;
           System.out.println(str.replaceAll("l", "_"));
           System.out.println(str.replaceFirst("l", "_"));



//        String str="abcdefg";
//        System.out.println(str.contains("ef"));
//        System.out.println(str.indexOf("ef"));
//           String str1 = "hello world hello bit" ;
//           String[] result = str1.split(" ") ; // 按照空格拆分
//           for(String s: result) {
//               System.out.println(s);
           }

    }


//实现方法 split, 能够指定分割符将字符串拆分成字符串数组


//
//    String str = new String("good");
//    char[ ] ch = { 'a' , 'b' , 'c' };

    //public static void main(String args[]){

//        public static boolean isAdmin(String userId){
//            return userId.toLowerCase()=="admin";
//        }
//        public static void main(String[] args){
//            System.out.println(isAdmin("Admin"));
//        }


//        TestDemo ex = new TestDemo();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
   // }
//    public void change(String str,char ch[ ]){
//        str = "test ok";
//        ch[0] = 'g';
//    }


//}

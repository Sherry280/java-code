package List;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {
        String[] sArray={"hello","world","xingyuyu"};
        //Strings的实现不是ArrayList
        List<String> strings= Arrays.asList(sArray);

    }
}

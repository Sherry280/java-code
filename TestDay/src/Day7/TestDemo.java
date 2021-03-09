package Day7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDemo {
    /**
     *回溯算法
     */
        public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            ArrayList<Integer> inner = new ArrayList<>();
            result.add(inner);

            int SLen = S.length;
            int index = 0;
            while (index != SLen) {
                ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
                for (ArrayList innerList : result) {
                    ArrayList<Integer> tempInnerlist = new ArrayList<>(innerList);
                    tempInnerlist.add(S[index]);
                    // 内部排序
                    Collections.sort(tempInnerlist);
                    temp.add(tempInnerlist);
                }
                result.addAll(temp);
                index++;
            }
            // 外面排个序
            Collections.sort(result, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    int o1Size = o1.size();
                    int o2Size = o2.size();
                    if (o1Size != o2Size) return Integer.compare(o1Size, o2Size);
                    else {
                        for (int i = 0; i < o1.size(); i++) {
                            int comp = Integer.compare(o1.get(i), o2.get(i));
                            if (comp != 0) return comp;
                        }
                    }
                    return 0;
                }
            });

            return result;
        }

    public static void main(String[] args) {
            int[] array={1,2,3,4};
        System.out.println(subsets(array));

    }
}

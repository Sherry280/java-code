import java.util.ArrayList;
import java.util.List;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};


public class Solution {
    public static int getImportance(List<Employee> employees, int id) {
        int imp = 0;
        List<Integer> list = new ArrayList<>();
        list.add(id);
        while(list.size()>0){
            for(Employee e:employees){
                if(e.id==list.get(0)){
                    imp+=e.importance;
                    list.addAll(e.subordinates);
                    employees.remove(e);
                    list.remove(0);
                    break;
                }
            }
        }
        return imp;
//        for(Employee e:employees){
//            if(e.id==id){
//                if(e.subordinates.size()==0){
//                    return e.importance;
//                }
//                for(int subId:e.subordinates){
//                    e.importance+=getImportance(employees,subId);
//                }
//                return e.importance;
//            }
//        }
//        return 0;

    }

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(null);
        list.add(null);
        Solution.getImportance(list,1);


    }




}

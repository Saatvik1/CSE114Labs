package com.company.Lab23P2;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab23P2 {

    public static void main(String[] args) {
        String[] list1 = {"Atlanta", "Dallas", "San Francisco"};
        String[] list2 = {"Boston", "Chicago", "Denver", "Seattle"};
        ArrayList<String> list1L = new ArrayList<String>(Arrays.asList(list1));
        ArrayList<String> list2L = new ArrayList<String>(Arrays.asList(list2));

        System.out.println(mergeList(list1L,list2L));
    }

public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2 ) {
    ArrayList<String> mergedList = new ArrayList<>(lst1.size()+lst2.size());
    mergedList.addAll(lst1);
    mergedList.addAll(lst2);

    for(int i = 0; i<mergedList.size(); i++) {
        for(int j = 0; j<mergedList.size()-1; j++) {
            int val = mergedList.get(j).compareTo(mergedList.get(j+1));
            if(val > 0){
                String temp = mergedList.get(j);
                mergedList.set(j,mergedList.get(j+1));
                mergedList.set(j+1,temp);
            }
        }
    }

    return mergedList;
}

}

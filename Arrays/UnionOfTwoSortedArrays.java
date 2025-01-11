import java.util.*;
public class UnionOfTwoSortedArrays {
    public static List< Integer > sortedArray(int []a, int []b) {
        int i=0, j=0;
        int n= a.length;
        int m= b.length;
        List<Integer> unionList = new ArrayList<>();

        while(i< n && j< m){
          while(i> 0 && i < n && a[i] == a[i-1]){
            i++;
          }
          while(j>0 && j < m && b[j] == b[j-1]){
            j++;
          }

          if(i< n && j< m){
            if(a[i] < b[j]){
              unionList.add(a[i]);
              i++;
            }else if(a[i] > b[j]){
              unionList.add(b[j]);
              j++;
            }else{
              unionList.add(a[i]);
              i++;
              j++;
            }
          }
        }

        while(i< n){
          if( i==0 || a[i] != a[i-1]){
              unionList.add(a[i]);
          }
          i++;
        }
        while(j<m){
          if(j ==0 || b[j] != b[j-1]){
            unionList.add(b[j]);
          }
          j++;
        }
        return unionList;
    }
}
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,h;
        List<Integer> list=new ArrayList<Integer>();
        for(i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(j=0;j<list.size();j++){
            for(k=1;k<=list.get(j);k++){
                for(h=1;h<=3;h++){
                System.out.print(k);
            }
            System.out.println();
         }
    }
    }
}
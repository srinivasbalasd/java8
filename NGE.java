public class NGE {
    public static void main(String[] args) {
        //int a[] = {4,5,2,25};
        int a[] = {13 , 7, 6 , 12 };
        for(int i=0; i<a.length; i++) {
            int j = i+1;
            for(; j<a.length;j++) {
                if(a[j]>a[i]){
                    System.out.println(a[i]+"->"+a[j]);
                    break;
                }
            }
            if(j==a.length){
                System.out.println(a[i]+"->"+-1);
            }
        }
    }
}

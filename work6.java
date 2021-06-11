public class work6{
    public static void main(String args[]){
        int num = 5;
        for(int i = 1;i<=num;i=i+1){
            if(i%2!=0){
                for(int j=1;j<=(num - i)/2;j = j+1){
                    System.out.print("");
                }
                for(int j = 1; j<=i;j=j+1){
                    System.out.print(i);
                }
                System.out.print("\n");
            }
            else
            {
                for(int j=1;j<=num;j=j+1){
                    System.out.print("-");
                }
                System.out.print("\n");
            }
        }
    }
}
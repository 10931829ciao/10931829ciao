public class work8{
    public static void main(String args[]){
        xmas(10,"*",2,"|");
    }
    
    public static void xmas(int num1, String text1,int num2,String text2){
        for(int i = 1;i<=num1;i=i+1){
             if(i%2!=0){
                for(int j=1;j<=(num1 - i)/2;j = j+1){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i;j=j+1){
                    System.out.print(text1);
                }
                System.out.print("\n");
            }
            for(int w=1;w<=num2;w = w+1){
                int k;
                if (num1%num2==0){
                    k=(num1-2)/2;
                }
                else
                    k=(num1-1)/2;
                for(int j=1;j<=k;j=j+1){
                    System.out.print(" ");

                System.out.println(text2);
                }
            }
        }
    }
}
public class work7{
    public static void main(String args[]){
        xmas(5,"*");
    }
    
    public static void xmas(int num, String text){
        for(int i = 1;i<=num;i=i+1){
             if(i%2!=0){
                for(int j=1;j<=(num - i)/2;j = j+1){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i;j=j+1){
                    System.out.print(text);
                }
                System.out.print("\n");
            }
        }
    }
}
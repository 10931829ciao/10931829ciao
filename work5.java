public class work5{
    public static void main(String args[]){
        for(int i = 1;i <= 5; i = i + 1){
            if(i % 2 != 0){
                for (int j = 1;j <= i; j = j + 1){
                    System.out.print(i);
                }
                System.out.print("\n"); 
            }
        }
    }
}
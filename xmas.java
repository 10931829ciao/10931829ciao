public class xmas{
    private static int leafNum, truckNum;
    private static String leafText, trunkText;
    
    
    public void leafSet(int num1, String text1){
        leafNum = num1;
        leafText = text1;
    }
    
    public void leaf(){
        for(int i = 1;i<=leafNum;i=i+1){
             if(i%2!=0){
                for(int j=1;j<=(leafNum - i)/2;j = j+1){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i;j=j+1){
                    System.out.print(leafText);
                }
                System.out.print("\n");
            }
        }
    }

    public void trunk(int num2,String text2){
        truckNum = num2;
        trunkText = text2;
        for(int w=1;w<=truckNum;w = w+1){
            int k;
            if (leafNum%2==0){
                k=(leafNum-2)/2;
            }
            else
                k=(leafNum-1)/2;
            for(int j=1;j<=k;j=j+1){
                System.out.print(" ");
            }
            System.out.println(" ");
            }
        System.out.println(trunkText);
    }
}
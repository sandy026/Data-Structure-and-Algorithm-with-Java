public class PatternPrinting {
    public void Pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        PatternPrinting obj=new PatternPrinting();
        obj.Pattern1(5);
    }
}

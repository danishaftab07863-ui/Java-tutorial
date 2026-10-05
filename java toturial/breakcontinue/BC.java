package Driver.breakcontinue;

public class BC {
    public static void main(String[] args) {
        //break and continue
       int i = 0;
         while(true){
             if(i==5){
                i++;
                 continue;
             }
             System.out.println(i);
             i++;
             if(i>10){
                 break;
             }
         }
    }
    
}

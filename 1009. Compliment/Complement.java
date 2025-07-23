// import java.util.Math;

public class Complement{
    
    public int bitwiseComplement(int n){
        
        int ans=0, bit, i=0;

        do{
            bit=n&1;
            n=n>>1;
            if(bit == 1){
                ans = (int)Math.pow(2, i)+ans;
            }
            i++;
        }while(n!=0);
        
        
        return ans;
    }
    
    
    public static void main(String[] args) {
        Complement shailesh = new Complement();
        System.out.println(shailesh.bitwiseComplement(92 ));
    }
}

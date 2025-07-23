public class PowerOfTwo{
    
    public boolean isPowerOfTwo(int n){
        
        int mod=0;
        while(n!=1){
            mod=n%2;
            n/=2;
            if(mod==1){
                return false;
            }
        }
        return true;     
    }
    
    
    
    public static void main(String[] args) {
        PowerOfTwo shailesh = new PowerOfTwo();
        // System.out.println(shailesh.isPowerOfTwo(20));
        // System.out.println(shailesh.isPowerOfTwo(16));
        // System.out.println(shailesh.isPowerOfTwo(32));
        // System.out.println(shailesh.isPowerOfTwo(64));
        // System.out.println(shailesh.isPowerOfTwo(128));
        // System.out.println(shailesh.isPowerOfTwo(100));
        // System.out.println(shailesh.isPowerOfTwo(120));
        System.out.println(shailesh.isPowerOfTwo(0));
    }
}
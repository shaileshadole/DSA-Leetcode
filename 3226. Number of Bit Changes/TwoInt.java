// 3226. Number of Bit Changes 
// to Make Two Integers Equal



public class TwoInt {
    public int minChanges(int n, int k) {
       
        int pos;
        int bitMask;

        for(pos = 0; pos<32; pos++){
            bitMask = 1 << pos;
            int a = bitMask&n;
            int b = bitMask&k;


            if(a==0&&b==0 || a!=0&&b!=0){
                //Jab change na karna ho
                System.out.println("Count : " + pos + "##########");
                System.out.println(a);
                System.out.println(b);
            }else{
                System.out.println("Badlava Jaruri hai");
                if(a==0){
                    int neg = ~(bitMask);
                    int newNumber = neg&b;
                    b=newNumber;
                    System.out.println("$$$$$ "+b+" $$$$$");
                }else{
                    int neg = ~(bitMask);
                    int newNumber = neg&a;
                    a=newNumber;
                    System.out.println("$$$$$ "+b+" $$$$$");
                }
            }
        }







        
        
        
        
        
        
        
        
        
        
        
        
        return 0;
    }
    
    


























    public static void main(String[] args) {
        System.out.println("Hello");

        TwoInt shailesh = new TwoInt();
        shailesh.minChanges(13, 4);
    }
}

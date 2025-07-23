



public class ReverseInt{

    public int reverse(int x) {
        
        int neg = 0;
        if(x<0){
            neg=1;
        }

        x = (-1)*x;

        String string = Integer.toString(x);
        String reverseString = new StringBuilder(string).reverse().toString();

        if(neg == 1){
            reverseString = "-" + reverseString;
        }

        int finalNumber = Integer.parseInt(reverseString);
        return finalNumber;
    }



    public static void main(String[] args) {
        // System.out.println("Hello");
        // int number = 123;
        // System.out.println(number);
        // String str = Integer.toString(number);
        // System.out.println(str);
        // int number2 = Integer.parseInt(str);

        ReverseInt shailesh = new ReverseInt();
        System.out.println(shailesh.reverse(-123));


    }
}
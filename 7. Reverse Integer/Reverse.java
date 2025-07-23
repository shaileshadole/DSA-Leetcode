public class Reverse {

    public int function(int x){
        
        // int answer = 0, neg = 0, digit;

        // if(x<0){
        //     neg=1;
        //     x = (-1)*x;
        // }

        // while(x != 0){
        //     digit = x%10;
        //     answer = (10 * answer) + digit;
        //     x /= 10;
        // }

        // if(neg == 1){
        //     answer = (-1) * answer;
        // }

        // if (answer <= Integer.MIN_VALUE || answer >= Integer.MAX_VALUE) {
        //     return 0;
        // }
        
        
        // return answer;

        int neg = 0, digit;
        double answer = 0L;
        int finalAnswer;

        if(x<0){
            neg=1;
            x = (-1)*x;
        }

        while(x != 0){
            digit = x%10;
            answer = (10 * answer) + digit;
            x /= 10;
        }

        if(neg == 1){
            answer = (-1) * answer;
        }

        if (answer <= Integer.MIN_VALUE || answer >= Integer.MAX_VALUE) {
            return 0;
        }
        
        finalAnswer = (int)answer;
        return finalAnswer;
    }

    public static void main(String args[]){
        Reverse shailesh = new Reverse();
        shailesh.function(1534236469);
        System.out.println(shailesh.function(1534236469));
    }
}

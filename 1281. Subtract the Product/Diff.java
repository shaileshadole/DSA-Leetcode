//1281. Subtract the Product 
//and Sum of Digits of an Integer

public class Diff {

    public int subtractProductAndSum(int n) {
        int digitCount = 0, sum = 0, product = 1, i, number = n, answer;

        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        //Finding the Sum
        //Finding the product
        number=n;
        for(i = 0; i<digitCount; i++){
            sum += number%10;
            product *= number%10;            
            number/=10;
        }

        //Handles the difference
        answer = product - sum;
        if(answer < 0) {
            answer = (-1)*answer;
        }

        return answer;
    }
    public static void main(String[] args) {
        
        

        Diff shaileshDiff = new Diff();
        shaileshDiff.subtractProductAndSum(31);
    }
} 
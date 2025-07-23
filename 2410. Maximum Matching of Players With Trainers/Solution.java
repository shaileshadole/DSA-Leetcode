import java.util.Arrays;

class Solution {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p = 0, t = 0;

        while(p < players.length && t < trainers.length){
            if(players[p] < trainers[t]){
                p++;
                t++;
            }else{
                t++;
            }
            
        }
        
        return p;
    }

    public static void main(String[] args) {
        
        
        int[] players = {4,7,9}, trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
        
    }
}
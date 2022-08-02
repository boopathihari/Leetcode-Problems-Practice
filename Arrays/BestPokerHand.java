
class BestPokerHand {
    public static String bestHand(int[] ranks, char[] suits) {
     
        char[] temp = new char[1];
        int count = 0;
        char[] pairChar = new char[1];
        pairChar[0] = 'z';
        // 1. "Flush": Five cards of the same suit.
        for(int i=0; i<suits.length; i++){
            
            for(int j=i+1 ; j<suits.length ; j++){ 
                if(suits[j] == suits[i]){
                     if(suits[j] != pairChar[0]){
                    count = 0;
                    pairChar[0] = suits[j];
                    count++;
                }else{
                    count++;
                    System.out.println(count);
                }
            }
            }
            
        }
        
        if(count == 10){
            return "Flush";
        }
        
        
        // 2."Three of a Kind": Three cards of the same rank.
        int rank;
        // ArrayList<Integer> duplicateArray = new ArrayList<>();
        int pairValue = Integer.MIN_VALUE;
        int rankCount=0;

        for(int i=0; i<ranks.length-1; i++){

            for(int j=i+1 ;j<ranks.length; j++){
                if(ranks[i] == ranks[j]){
                    if(pairValue != ranks[j]){
                        rankCount = 0;
                        pairValue = ranks[j];
                        rankCount++;
                    }else{
                        rankCount++;
                    }
                }
            } 
            
                   
        }
        
     
        
        if(rankCount > 1){
            return "Three of a Kind";
        }
        
        // 3. "Pair": Two cards of the same rank.
        if(rankCount == 1 || count == 1){
            return "Pair";
        }else{
            return "High Card";
        }
        
    }


    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 13;
        intArray[1] = 12;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 7;

        char[] inChar = new char[5];
        inChar[0] = 'a';
        inChar[1] = 'd';
        inChar[2] = 'c';
        inChar[3] = 'b';
        inChar[4] = 'c';

      
        String result = bestHand(intArray ,  inChar);
        System.out.println(result);
    }
    
}

import java.util.*;

class Main {
  public static void main(String[] args) {
    romanToInt("MCMXCIV");
  }

  public static void romanToInt(String s) {
     HashMap<Character, Integer> RomenNumeral = new HashMap();
     ArrayList<Integer> arr = new ArrayList<Integer>();

    int sum = 0;
    
    RomenNumeral.put('I', 1);
    RomenNumeral.put('V', 5);
    RomenNumeral.put('X', 10);
    RomenNumeral.put('L', 50);
    RomenNumeral.put('C', 100);
    RomenNumeral.put('D', 500);
    RomenNumeral.put('M', 1000);

    for(int i=0; i< s.length(); i++){
      Boolean containsKey = RomenNumeral.containsKey(s.charAt(i));
      int ContainsValue = RomenNumeral.get(s.charAt(i));
      
      if(i==0){
        if(containsKey){
            arr.add(ContainsValue);
        }
      }else{
        if(containsKey){
          if(ContainsValue <= arr.get(arr.size()-1)){
            arr.add(ContainsValue);
            
          }else{
            int sub = ContainsValue - arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            arr.add(sub);
            // System.out.println("Array=>" + arr);
          }
        }
      } 
    }

    
    for(int i=0; i<arr.size(); i++){
        sum += arr.get(i);
    }
  
    System.out.println(sum);
    // System.out.println(s);
  }
}
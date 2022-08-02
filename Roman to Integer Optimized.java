import java.util.*;

class Main {
  public static void main(String[] args) {
    romanToInt("MCMXCIV");
  }

  public static void romanToInt(String s) {
    int result = 0;

    HashMap<Character,Integer> RomenNumeral = new HashMap<>();
    
    RomenNumeral.put('I', 1);
    RomenNumeral.put('V', 5);
    RomenNumeral.put('X', 10);
    RomenNumeral.put('L', 50);
    RomenNumeral.put('C', 100);
    RomenNumeral.put('D', 500);
    RomenNumeral.put('M', 1000);

    for(int i=0; i< s.length(); i++){
      if(i+1 < s.length() && RomenNumeral.get(s.charAt(i)) < RomenNumeral.get(s.charAt(i+1))){
          result -= RomenNumeral.get(s.charAt(i));
      }else{
        result += RomenNumeral.get(s.charAt(i));
      }
    }
      
  
    System.out.println(result);
    // System.out.println(s);
  }
}
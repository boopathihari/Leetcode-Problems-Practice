class Palindrome {
    public boolean isPalindrome(int number) {
          int reverse = 0;
        
        int temp = number;
        
        if(number < 0){
            return false;
        }
            
          while(temp != 0){
            int remainder = temp % 10; //Fetch the last digit
            reverse = reverse * 10 + remainder; // Reverse the number
            temp = temp / 10; // to remove the digits from left to right
          }
      
            if(number == reverse){
                return true;
            }else{
                return false;
            }
        
    }

    public static void main(String[] args) {
      System.out.println("Hi this is my first java code in vscode");
    }
}
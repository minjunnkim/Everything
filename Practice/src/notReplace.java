public class notReplace {
    public static void main(String[] args) {
    
    String str = "isis";	
	String ans = "";
    str = " " + str + "  ";
    for(int i = 0; i < str.length()-2;i++) {
      if(str.charAt(i) == 'i' && str.charAt(i+1) == 's'){
        if(Character.isLetter(str.charAt(i-1)) == false && Character.isLetter(str.charAt(i+2)) == false){
         ans += "is not"; 
          i += 1;
        }
        else ans += "i";
      }  
      else ans += str.charAt(i);
    }
    System.out.println(ans.substring(1));
    }
}

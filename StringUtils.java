// StringUtils
class StringUtils{
  static boolean containsChar(String word,char letter){

    for(int i=0;i < word.length();i++){
      if(word.charAt(i) == letter) return true;
    }

    return false;
  }
  
  static String reverse(String word){
    String result = "";
    
    for(int i = word.length() - 1;i >= 0;i--){
      result += word.charAt(i);
    }

    return result;
  }
  
  static String replaceAll(String word,char verifier, char resultant){
    String result = ""; 
    
    for(int i = 0;i < word.length();i++){
      result += (word.charAt(i) == verifier ? resultant : word.charAt(i));
    }

    return result;
  }
}
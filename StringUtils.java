// StringUtils
class StringUtils{
  static boolean containsChar(String word,char letter){
    char[] text = word.toCharArray();
    
    for(int i=0;i < text.length;i++){
      if(text[i] == letter) return true;
    }

    return false;
  }
  
  static String reverse(String word){
    String result = "";
    char[] text = word.toCharArray();  
    
    for(int i=text.length-1; i >= 0;i--){
      result += text[i];
    }

    return result;
  }
  
  static String replaceAll(String word,char verifier, char resultant){
    String result = "";
    char[] text = word.toCharArray();  
    
    for(int i =0;i < text.length;i++){
      result += (text[i] == verifier ? resultant : text[i]);
    }

    return result;
  }
}
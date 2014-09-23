public boolean mixStart(String str) {
  if (str.length() >= 3) {
      String x = str.substring(1,3);
      if (x.equals("ix")) {
	  return true;
      }
      else{
	  return false;
      }
  }
  else {
      return false;
  }
}

public String makeOutWord(String out, String word) {
  String x = out.substring(0,2);
  String xx = out.substring(2,4);
  return x + word + xx;
}

public String firstHalf(String str) {
  String x = str.substring(0,str.length()/2);
  return x;
}

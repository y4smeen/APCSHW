public class Loop {

  public String frontTimes(String str, int n) {
    int count = 0;
    String x = "";
    if (str.length() < 3) {
      while (count < n) {
        x = x + str;
        count ++;
      }
    }
    else {
      while (count < n) {
        x = x + (str.substring(0,3));
        count ++;
      }
    }
    return x;
  } // 5 min
  
  public String stringBits(String str) {
    int count = 0;
    String x = "";
    while (count < str.length()){
      x = x + str.substring(count, count + 1);
      count += 2;
    }
    return x;
  } // 3 min
  
  public String stringYak(String str) {
    String x = "";
    int count = 0;
    while (count < str.length()) {
      if (count + 2 < str.length() && str.substring(count,count+1).equals("y") && str.substring(count+2,count+3).equals("k")) {
        count += 3;
      }
      else {
        x += str.substring(count, count + 1);
        count += 1;
      }
    }
    return x;
  } // 10 min

  public int stringMatch(String a, String b) {
    int count = 0, x = 0;
    if (a.length() >= 2 && b.length() >= 2) {
      while (count < a.length()-1 && count < b.length()-1) {
        if (a.substring(count,count+2).equals(b.substring(count,count+2))) {
        x ++;
        count += 1;
        }
        else {
          count += 1;
        }
      }
  }
  return x;
} // 5 min

}

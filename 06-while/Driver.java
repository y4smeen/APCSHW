public class Driver {
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
        x = x + ( str.substring(0,3) );
        count ++;
      }
    }
    return x;
  }
  
}

package Test;
public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double mpd) {
    return distanceToPump <= (mpg*mpd);
  }
  
}
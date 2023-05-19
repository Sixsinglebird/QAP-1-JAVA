package Time;

public class Time {

  private int hour;
  private int minute;
  private int second;
  private String Time = "";

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void nextSecond() {
    this.second += 1;
  }

  public void previousSecond() {
    this.second -= 1;
  }

  public void fixHour() {
    if (this.hour < 10) {
      this.Time += "0" + this.hour + ":";
    } else {
      this.Time += Integer.toString(this.hour) + ":";
    }
  }

  public void fixMinute() {
    if (this.minute < 10) {
      this.Time += "0" + this.minute + ":";
    } else {
      this.Time += Integer.toString(this.minute) + ":";
    }
  }

  public void fixSecond() {
    if (this.second < 10) {
      this.Time += "0" + this.second;
    } else {
      this.Time += Integer.toString(this.second);
    }
  }

  public String fixTime() {
    this.Time = "";
    fixHour();
    fixMinute();
    fixSecond();
    return this.Time;
  }

  public String toString() {
    return fixTime();
  }
}

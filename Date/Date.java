package Date;

public class Date {

  private int day;
  private int month;
  private int year;
  private String date = "";

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String fixDate() {
    fixDay();
    fixMonth();
    this.date += this.year;
    return this.date;
  }

  public void fixDay() {
    if (this.day < 10) {
      this.date += "0" + this.day + "/";
    } else {
      this.date += this.day + "/";
    }
  }

  public void fixMonth() {
    if (this.month < 10) {
      this.date += "0" + this.month + "/";
    } else {
      this.date += this.month + "/";
    }
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return fixDate();
  }
}

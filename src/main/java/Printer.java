public class Printer {
  private int numOfSheetsOfPaperLeft;
  private int tonerVolume;

  public Printer(int numOfSheetsOfPaperLeft, int tonerVolume) {
    this.numOfSheetsOfPaperLeft = numOfSheetsOfPaperLeft;
    this.tonerVolume = tonerVolume;
  }

  public int getPaperLeft() {
    return this.numOfSheetsOfPaperLeft;
  }

  public void print(int numOfPages, int numOfCopies) {
    if (this.numOfSheetsOfPaperLeft >= numOfPages * numOfCopies) {
      this.numOfSheetsOfPaperLeft -= numOfPages * numOfCopies;
      this.tonerVolume -= numOfPages * numOfCopies;
    }
  }

  public int getToner() {
    return this.tonerVolume;
  }
}

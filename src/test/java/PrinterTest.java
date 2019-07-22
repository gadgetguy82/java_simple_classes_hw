import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
  private Printer printer;

  @Before
  public void before() {
    printer = new Printer(100, 50);
  }

  @Test
  public void hasSheetsOfPaper() {
    assertEquals(100, printer.getPaperLeft());
  }

  @Test
  public void printerCanOnlyPrintWithEnoughPaper() {
    printer.print(4, 5);
    assertEquals(80, printer.getPaperLeft());
  }

  @Test
  public void hasToner() {
    assertEquals(50, printer.getToner());
  }

  @Test
  public void printerReducesTonerWhenPrinting() {
    printer.print(5, 5);
    assertEquals(25, printer.getToner());
  }
}

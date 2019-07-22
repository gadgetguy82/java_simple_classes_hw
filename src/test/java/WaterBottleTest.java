import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
  private WaterBottle waterBottle;

  @Before
  public void before() {
    waterBottle = new WaterBottle();
  }

  @Test
  public void hasVolume() {
    assertEquals(100, waterBottle.getVolume());
  }

  @Test
  public void drinkReducesVolume() {
    waterBottle.drink();
    assertEquals(90, waterBottle.getVolume());
  }

  @Test
  public void emptyWaterBottle() {
    waterBottle.empty();
    assertEquals(0, waterBottle.getVolume());
  }

  @Test
  public void fillWaterBottle() {
    waterBottle.empty();
    waterBottle.fill();
    assertEquals(100, waterBottle.getVolume());
  }
}

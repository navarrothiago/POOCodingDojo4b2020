package semana1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exemplo {

  public int add3(int n) {
    return n + 3;
  }

  @Test
  public void test_add3() {
    assertEquals(8, add3(5));
  }

  @Test
  public void trivial_test() {
    assertTrue(5 == 2 + 3);
    assertFalse(7 != 14 / 2);
  }

  @Test
  public void evil() {
    assertTrue(true);
  }

}
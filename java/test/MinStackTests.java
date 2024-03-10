import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MinStackTests {

  @Test
  public void testPush() {
    MinStack minStack = new MinStack();
    assertThrows(NoSuchElementException.class, minStack::top);
    minStack.push(1);
    assertEquals(1, minStack.top());
  }

  @Test
  public void testPop() {
    MinStack minStack = new MinStack();
    minStack.push(1);
    minStack.push(2);
    minStack.push(3);
    minStack.pop();
    assertEquals(2, minStack.top());
  }

  @Test
  public void testPopExceptions() {
    MinStack minStack = new MinStack();
    assertThrows(NoSuchElementException.class, minStack::pop);
  }

  @Test
  public void testTop() {
    MinStack minStack = new MinStack();
    minStack.push(1);
    minStack.push(2);
    minStack.push(3);
    assertEquals(3, minStack.top());
  }

  @Test
  public void testTopExceptions() {
    MinStack minStack = new MinStack();
    assertThrows(NoSuchElementException.class, minStack::top);
  }

  @Test
  public void testGetMin() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
  }
}
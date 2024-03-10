import java.util.Stack;
import java.lang.Integer;

public class MinStack {

  private final Stack<Integer> stack;
  private final Stack<Integer> minStack;

  public MinStack() {
    this.stack = new Stack<Integer>();
    this.minStack = new Stack<Integer>();
  }

  public void push(int val) {
    this.stack.push(val);
    if (!this.minStack.isEmpty()) {
      val = Math.min(val, minStack.peek());
    }
    this.minStack.push(val);
  }

  public void pop() {
    stack.removeLast();
    minStack.removeLast();
  }

  public int top() {
    return stack.getLast();
  }

  public int getMin() {
    return minStack.getLast();
  }
}
/*
 * Java Design Patterns: Chain of Responsibility
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Handler
 * handles requests it is responsible for
 */
public class ConcreteHandler1 extends Handler {
    
  public Boolean canHandle() {
    // ...
    return false;
  }
  
  @Override
  public void handleRequest() {
    if (this.canHandle()) {
      System.out.println("Handled by Concrete Handler 1");
    } else {
      System.out.println("Cannot be handled by Handler 1");
      super.handleRequest();
    }
  }
}

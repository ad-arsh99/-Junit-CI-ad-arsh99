import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class NovelTest {
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    AVLTree Tree_Zero = new AVLTree();


    Tree_Zero.delete(100);
    Tree_Zero.insert((int) (byte) 10);

    Tree_Zero.insert((int) (short) 0);

    try {
      Tree_Zero.delete(10);
      fail("Expecting null pointer exception");
    }catch(NullPointerException ignored){

    }
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    try {
      AVLTree Tree_Zero = new AVLTree();
      Tree_Zero.insert((-3240));
      Tree_Zero.insert(1779);
      Tree_Zero.delete(663);
      Tree_Zero.insert(0);
      Tree_Zero.insert((-791));
      Tree_Zero.delete((-791));
      AVLTree.Node Tree_Node0 = Tree_Zero.getRoot();
      Tree_Zero.delete((-935));
      AVLTree.Node Tree_Node1 = Tree_Node0.left;
      Tree_Node0.left = Tree_Node1;
      Tree_Zero.insert((-450));
      Tree_Node0.left.key = (-1467);


      Tree_Node1.height = (-935);

      Tree_Node0.height = 663;
      Tree_Node0.key = (-791);
      Tree_Zero.insert(391);
      Tree_Zero.getBalance(Tree_Node0);
    }catch (NullPointerException ne){
      fail("Failed");
    }
  }

  @Test(timeout = 4000)
  public void test009() throws Throwable {
    AVLTree Tree_Zero = new AVLTree();
    Tree_Zero.insert(10);
    Tree_Zero.insert(50);
    Tree_Zero.insert(22);
    Tree_Zero.insert(80);
    try {
      Tree_Zero.delete(50);
      Tree_Zero.delete(22);
      Tree_Zero.delete(80);
      fail("Null pointer exception");
    }catch(NullPointerException ignored){

    }
  }
}

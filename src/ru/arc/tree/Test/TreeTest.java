package ru.arc.tree.Test;

import org.junit.jupiter.api.Test;
import ru.arc.tree.MainTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTest {
    MainTree.Tree getTree(){
      return   new MainTree.Tree(20,
                new MainTree.Tree(7,
                        new MainTree.Tree(4, null, new MainTree.Tree(6)),
                        new MainTree.Tree(9)),
                new MainTree.Tree(35,
                        new MainTree.Tree(31, new MainTree.Tree(28), null),
                        new MainTree.Tree(40, new MainTree.Tree(38), new MainTree.Tree(52))));
    }
    @Test
    void methodDeepWideEqualResult (){
        MainTree.Tree root = getTree();
             assertEquals(MainTree.Tree.sumWide(root), MainTree.Tree.sumDeep(root));

    }
}

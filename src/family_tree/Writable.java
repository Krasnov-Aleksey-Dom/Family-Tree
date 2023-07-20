package family_tree;

import family_tree.family_tree.FamilyTree;

public interface Writable {
    void saveFile(FamilyTree tree,String path);
    FamilyTree loadFile(String path);
}

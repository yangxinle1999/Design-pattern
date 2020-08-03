package CompositePattern;

import java.util.List;

//文件，没有下一层，相当于叶子节点
public class File implements IFile {

    private String name;

    public File(String name){
        this.name=name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChildren() {
        return null;
    }
}

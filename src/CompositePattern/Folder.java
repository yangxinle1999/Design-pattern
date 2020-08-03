package CompositePattern;

import java.util.ArrayList;
import java.util.List;

//文件夹，有下一层
public class Folder implements IFile {

    private String name;
    private List<IFile> list;

    public Folder(String name){
        this.name=name;
        list=new ArrayList<>();
    }


    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        return list.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return list.remove(iFile);
    }

    @Override
    public List<IFile> getChildren() {
        return list;
    }
}

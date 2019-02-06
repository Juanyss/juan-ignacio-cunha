import java.util.ArrayList;

public class RecentFileList {
    private ArrayList<File> list;
    private int maxSize = 15;

    public RecentFileList(int maxSize) {
        this.maxSize = maxSize;
        this.list = new ArrayList<File>(maxSize);
    }

    public ArrayList<File> getList() {
        return list;
    }

    public void setList(ArrayList<File> list) {
        this.list = list;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addFile(File file){
        if(list.contains(file)){
            list.remove(file);
         //Check and Remove duplicated files in the list
        }else if(list.size() == maxSize){
            list.remove(4);
        //Check if the list is full and remove the oldest file
        }
        list.add(0,file);
        //Add to the list the newest files
    }

}

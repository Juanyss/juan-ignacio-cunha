
import org.junit.Assert;
import org.junit.Test;

public class Exercise1Test {

    @Test
    public void whenRunForFirstTimeListMustBeEmpty(){
        RecentFileList list = new RecentFileList(15);

        Assert.assertTrue(list.getList().isEmpty());
    }

    @Test
    public void addNewFileToList(){
        RecentFileList list = new RecentFileList(15);
        File file = new File("File1","C:\\",3);
        list.addFile(file);

        Assert.assertTrue(list.getList().contains(file));
    }

    @Test
    public void updateAndRemoveDuplicateFromList(){
        RecentFileList list = new RecentFileList(15);
        File file1 = new File("File1","C:\\My Documents",3);
        File file2 = new File("File2","D:\\Downloads",5);
        File file3 = new File("File3","D:\\Downloads",5);
        list.addFile(file1);
        list.addFile(file2);
        list.addFile(file3);
        list.addFile(file1);

        File lastFile = list.getList().get(0);

        Assert.assertEquals(file1,lastFile);
    }

    @Test
    public void updateWithNewestFileAndRemoveOldestFileWhenReachMaxSize(){
        RecentFileList list = new RecentFileList(5);
        File file1 = new File("File1","C:\\My Documents",3);
        File file2 = new File("File2","D:\\Downloads",5);
        File file3 = new File("File3","D:\\Downloads",5);
        File file4 = new File("File4","C:\\My Documents",3);
        File file5 = new File("File5","D:\\Downloads",5);
        File file6 = new File("File6","D:\\Downloads",5);

        list.addFile(file1);
        list.addFile(file2);
        list.addFile(file3);
        list.addFile(file4);
        list.addFile(file5);
        list.addFile(file6);


        File newestFile = list.getList().get(0);
        File oldestFile = list.getList().get(list.getList().size()-1);

        Assert.assertEquals(file6, newestFile);
        Assert.assertEquals(file2, oldestFile);
    }
}

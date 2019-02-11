import java.util.ArrayList;
import java.util.List;

public class MyBlogList {
    private List<Blog> blogHistory;

    public MyBlogList(){
        this.blogHistory = new ArrayList();
    }

    public List<Blog> getBlogHistory() {
        return blogHistory;
    }

    public void setBlogHistory(List<Blog> blogHistory) {
        this.blogHistory = blogHistory;
    }

    public Blog getBlog(int index){
        return blogHistory.get(index);
    }

    public void addBlog(Blog blog){
        if(blogHistory.contains(blog)){
            blogHistory.remove(blog);
        }
        blogHistory.add(0,blog);
    }

    public boolean deleteBlog(Blog blog){
        return blogHistory.remove(blog);
    }

    public void showMostRecentBlogs(){
        for (int i =0; i<blogHistory.size(); i++){
            System.out.println(blogHistory.get(i));
        }
    }

    public boolean containBlog(Blog blog){
        return blogHistory.contains(blog);
    }


}

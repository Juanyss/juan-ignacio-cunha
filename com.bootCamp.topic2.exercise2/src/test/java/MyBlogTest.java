import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.ArrayList;


public class MyBlogTest {
    private BlogService blogService;
    private MyBlogList blogList;

    @Before
    public void Start(){
        blogList = new MyBlogList();
        blogService = mock(BlogService.class);
        ArrayList<Blog> blogs = new ArrayList<>();

        blogs.add(new Blog("Blog1","Topic1"));
        blogs.add(new Blog("Blog2","Topic2"));
        blogs.add(new Blog("Blog3","Topic3"));
        blogs.add(new Blog("Blog4","Topic4"));
        when(blogService.RecentEntries()).thenReturn(blogs);
    }

    @Test
    public void addNewBlog(){
        blogList.addBlog(blogService.RecentEntries().get(0));

        Assert.assertTrue(blogList.containBlog(blogService.RecentEntries().get(0)));
    }

    @Test
    public void deleteExistingBlog(){
        for(int i=0; i<3; i++){
            blogList.addBlog(blogService.RecentEntries().get(i));
        }
        blogList.deleteBlog(new Blog("Blog2", "Topic2"));

        Assert.assertFalse(blogList.containBlog(new Blog("Blog2", "Topic2")));
    }

    @Test
    public void show10MostRecentBlog(){
        for(int i=0; i<3; i++){
            blogList.addBlog(blogService.RecentEntries().get(i));
        }
        for(int i=0; i<blogList.getBlogHistory().size();i++){
            Assert.assertFalse(blogList.getBlog(i).getDate().isBefore(blogList.getBlog(i++).getDate()));
        }

    }


}

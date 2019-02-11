import java.time.LocalDateTime;
import java.util.Date;

public class Blog {
    private String title;
    private LocalDateTime date;
    private String blog;

    public Blog(String title, String blog) {
        this.title = title;
        this.date = LocalDateTime.now();
        this.blog = blog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}

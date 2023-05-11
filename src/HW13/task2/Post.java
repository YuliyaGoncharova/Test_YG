package HW13.task2;

public class Post {
    int userId;
    int id;
    String title;
    String body;

    public int getId() {
        return id;
    }

    public Post (int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

}

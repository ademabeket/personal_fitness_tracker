public class Post {
    private User author;
    private String content;
    private int likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    // Getters
    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    // Method to like a post
    public void likePost() {
        likes++;
    }

    public void displayPost() {
        System.out.println("Post by: " + author.getName());
        System.out.println("Content: " + content);
        System.out.println("Likes: " + likes);
    }
}

package hanghae99.myselectshop.dto;

public class ItemRequest {

    private String username;
    private String title;
    private String content;
    private int price;

    // 기본 생성자
    public ItemRequest() {
    }

    // 생성자
    public ItemRequest(String username, String title, String content, int price) {
        this.username = username;
        this.title = title;
        this.content = content;
        this.price = price;
    }

    // Getter와 Setter 메서드
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemRequest{" +
                "username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                '}';
    }
}
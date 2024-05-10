import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    ArrayList<postList> postlists = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    // Thêm mới
    public void createPostList() {
        System.out.println("Enter post ID: ");
        long postID = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter article Title: ");
        String articleTitle = scanner.nextLine();
        System.out.println("Enter describe: ");
        String describe = scanner.nextLine();
        System.out.println("Enter avatar(You can enter the link or URL): ");
        String avatar = scanner.nextLine();
        System.out.println("Enter writer: ");
        String writer = scanner.nextLine();
        System.out.println("Enter date of writing: ");
        String date = scanner.nextLine();
        postList plist = new postList();
        postlists.add(plist);
        plist.setId(postID);
        plist.setArticleTitle(articleTitle);
        plist.setDescribe(describe);
        plist.setAvatar(avatar);
        plist.setWriter(writer);
        plist.setDateofwriting(date);
        System.out.println("Saved successfully" );
    }
    // Hiển thị toàn bộ danh sách
    public void showPostList() {
        System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Article title", "describe", "avatar", "writer", "date of writing");
        for (int i = 0; i < postlists.size(); i++) {
            postList pl = postlists.get(i);
            System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", pl.getId(), pl.getArticleTitle(), pl.getDescribe(), pl.getAvatar(), pl.getWriter(), pl.getDateofwriting());
        }
        System.out.println("Press Enter to continue.");
        scanner.nextLine();
    }
    // tìm kiếm qua Id
    public void searchPostList() {
        System.out.println("Enter post ID: ");
        long postID = scanner.nextLong();
        scanner.nextLine();
        long key = -1;
        for (int i = 0; i < postlists.size(); i++) {
            postList pl = postlists.get(i);
            if (pl.getId() == postID) {
                key = postID;
                System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Article title", "describe", "avatar", "writer", "date of writing");
                System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", pl.getId(), pl.getArticleTitle(), pl.getDescribe(), pl.getAvatar(), pl.getWriter(), pl.getDateofwriting());
            }
        }
        if (key == -1) {
            System.out.println("Post not found");
        }
    }
    // xóa
    public void deletePostList() {
        System.out.println("Enter post ID: ");
        long postID = scanner.nextLong();
        scanner.nextLine();
        long key = -1;
        for (int i = 0; i < postlists.size(); i++) {
            postList pl = postlists.get(i);
            if (pl.getId() == postID) {
                key = postID;
                postlists.remove(i);
                System.out.println("Deleted successfully");
            }
        }
        if (key == -1) {
            System.out.println("Post not found");
        }
    }
}

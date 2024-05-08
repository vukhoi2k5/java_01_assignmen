public class postList {
    long id;
    String articleTitle;
    String Describe;
    String Avatar;
    String writer ;
    String DateOfWriting;
    public postList(){
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getDateOfWriting() {
        return DateOfWriting;
    }

    public void setDateOfWriting(String dateOfWriting) {
        DateOfWriting = dateOfWriting;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}

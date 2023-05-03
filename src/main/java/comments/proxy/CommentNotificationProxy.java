package comments.proxy;

import comments.pojo.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

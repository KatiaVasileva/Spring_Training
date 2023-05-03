package comments.repository;

import comments.pojo.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

package comments.service;

import comments.pojo.Comment;
import comments.proxy.CommentNotificationProxy;
import comments.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Lazy
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy
            commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }


    public CommentService() {
        System.out.println("CommentService instance created");
    }


}

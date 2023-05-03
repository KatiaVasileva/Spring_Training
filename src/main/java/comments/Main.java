package comments;

import comments.config.ProjectConfiguration;
import comments.pojo.Comment;
import comments.proxy.CommentNotificationProxy;
import comments.proxy.EmailCommentNotificationProxy;
import comments.repository.CommentRepository;
import comments.repository.DBCommentRepository;
import comments.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        CommentRepository commentRepository = new DBCommentRepository();
//        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
//        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
//
//        Comment comment = new Comment();
//        comment.setAuthor("Laurentiu");
//        comment.setText("Demo comment");
//
//        commentService.publishComment(comment);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Laurentiu", "Demo comment");
//        comment.setAuthor("Laurentiu");
//        comment.setText("Demo comment");
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}

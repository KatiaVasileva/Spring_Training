package comments;

import comments.config.ProjectConfiguration;
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

//        Comment comment = new Comment("Laurentiu", "Demo comment");
//        comment.setAuthor("Laurentiu");
//        comment.setText("Demo comment");
//        CommentService commentService = context.getBean(CommentService.class);
//        commentService.publishComment(comment);
//        System.out.println("Before retrieving the CommentService");
//        CommentService commentService = context.getBean(CommentService.class);
//        System.out.println("After retrieving the CommentService");

        CommentService commentService1 = context.getBean(CommentService.class);
        CommentService commentService2 = context.getBean(CommentService.class);
        System.out.println(commentService2 == commentService1);
        System.out.println(commentService2.equals(commentService1));

        System.out.println(commentService2.getClass());
    }
}

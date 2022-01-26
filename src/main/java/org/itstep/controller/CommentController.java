package org.itstep.controller;

import org.itstep.entity.Comment;
import org.itstep.entity.Post;
import org.itstep.service.CommentService;
import org.itstep.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class CommentController {
    private final PostService postService;
    private final CommentService commentService;

    public CommentController(PostService postService, CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping("/comment/{integer}")
    public String addCom(@PathVariable Integer integer, Model model) {
        model.addAttribute("post", postService.findById(integer));
        return "comment";
    }

    @PostMapping("/comment/{integer}")
    public String addComm1(@PathVariable Integer integer, Comment comment) {
        comment.setCommentDate(getStringDate());
        Post post = postService.findById(integer);
        if (post != null) {
            System.out.println(comment);
            post.addComment(comment);
            commentService.addComment(comment);
        }
        return "redirect:/post";
    }

    public String getStringDate(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}

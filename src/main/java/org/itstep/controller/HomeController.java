package org.itstep.controller;

import org.itstep.entity.Post;
import org.itstep.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private final PostService postService ;

    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(){
        return "redirect:/post";
    }
    @GetMapping("/add")
    public String post(){
        return "add";
    }
    @PostMapping("/add")
    public String index(Post post){
        postService.addPost(post);
        return "redirect:/";
    }
}

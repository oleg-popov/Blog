package org.itstep.controller;

import org.itstep.entity.Post;
import org.itstep.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FindController {
    private final PostService postService;

    public FindController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping("/findById")
    public String findByid(){
        return "findById";
    }

    @PostMapping("/findById")
    public String findById(@RequestParam Integer id,  RedirectAttributes attr){
        Post post = postService.findById(id);
        System.out.println(post);
        attr.addFlashAttribute("post", post);
        return "redirect:/findById";
    }
}

package org.itstep.controller;

import lombok.AllArgsConstructor;
import org.itstep.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/post")
@AllArgsConstructor
public class PostController {
    private final PostService postService;


    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        postService.remove(id);
        return ("redirect:/post");
    }


}

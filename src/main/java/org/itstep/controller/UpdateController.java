package org.itstep.controller;

import lombok.AllArgsConstructor;
import org.itstep.entity.Post;
import org.itstep.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
//@RequestMapping("/update")
public class UpdateController {
    private final PostService postService;

    @GetMapping("/update")
    public String update(@RequestParam Integer id , Model model){
        model.addAttribute("post" , postService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String update1(Post post){
        System.out.println(post);
        postService.update(post);
        return "redirect:/post";
    }
}

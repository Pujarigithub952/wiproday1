package com.example.resttemplate.controller;

	import com.example.resttemplate.model.Post;
	import com.example.resttemplate.service.ApiService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/consume")
	public class ApiController {

	    @Autowired
	    private ApiService apiService;

	    @GetMapping("/get/{id}")
	    public Post getPost(@PathVariable int id) {
	        return apiService.getPostById(id);
	    }

	    @PostMapping("/create")
	    public Post createPost(@RequestBody Post post) {
	        return apiService.createPost(post);
	    }

	    @PutMapping("/update/{id}")
	    public String updatePost(@PathVariable int id, @RequestBody Post post) {
	        apiService.updatePost(id, post);
	        return "Updated successfully.";
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deletePost(@PathVariable int id) {
	        apiService.deletePost(id);
	        return "Deleted successfully.";
	    }
	}



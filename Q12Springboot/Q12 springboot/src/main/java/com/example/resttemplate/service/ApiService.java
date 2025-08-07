package com.example.resttemplate.service;

	import com.example.resttemplate.model.Post;
	import org.springframework.http.*;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;
	import org.springframework.web.client.HttpClientErrorException;

	@Service
	public class ApiService {

	    private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";
	    private final RestTemplate restTemplate = new RestTemplate();

	    public Post getPostById(int id) {
	        try {
	            return restTemplate.getForObject(BASE_URL + "/" + id, Post.class);
	        } catch (HttpClientErrorException e) {
	            System.out.println("GET Error: " + e.getMessage());
	            return null;
	        }
	    }

	    public Post createPost(Post post) {
	        try {
	            return restTemplate.postForObject(BASE_URL, post, Post.class);
	        } catch (HttpClientErrorException e) {
	            System.out.println("POST Error: " + e.getMessage());
	            return null;
	        }
	    }

	    public void updatePost(int id, Post post) {
	        try {
	            restTemplate.put(BASE_URL + "/" + id, post);
	            System.out.println("Post updated.");
	        } catch (HttpClientErrorException e) {
	            System.out.println("PUT Error: " + e.getMessage());
	        }
	    }

	    public void deletePost(int id) {
	        try {
	            restTemplate.delete(BASE_URL + "/" + id);
	            System.out.println("Post deleted.");
	        } catch (HttpClientErrorException e) {
	            System.out.println("DELETE Error: " + e.getMessage());
	        }
	    }
	}



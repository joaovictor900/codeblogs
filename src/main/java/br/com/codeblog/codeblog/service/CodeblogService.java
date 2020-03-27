package br.com.codeblog.codeblog.service;

import java.util.List;

import br.com.codeblog.codeblog.model.Post;

public interface CodeblogService {
	List<Post> findAll();
	Post findByID(long id);
	Post save(Post post);
}

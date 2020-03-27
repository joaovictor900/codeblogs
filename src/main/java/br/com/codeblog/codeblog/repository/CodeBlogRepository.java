package br.com.codeblog.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codeblog.codeblog.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
	
}

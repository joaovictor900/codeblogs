package br.com.codeblog.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codeblog.codeblog.model.Post;
import br.com.codeblog.codeblog.repository.CodeBlogRepository;
import br.com.codeblog.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService {

	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findByID(long id) {
		// TODO Auto-generated method stub
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return codeBlogRepository.save(post);
	}

}

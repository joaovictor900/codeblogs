/**
 * 
 */
package br.com.codeblog.codeblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.codeblog.codeblog.model.Post;
import br.com.codeblog.codeblog.service.CodeblogService;

/**
 * @author João Victor
 *
 */

@Controller
public class CodeblogController {
	
	@Autowired
	CodeblogService codeblogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPost() {
		ModelAndView mv = new ModelAndView();
		List<Post> posts  = codeblogService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
}

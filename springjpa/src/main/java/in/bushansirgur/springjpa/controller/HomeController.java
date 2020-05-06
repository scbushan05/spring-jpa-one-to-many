package in.bushansirgur.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.bushansirgur.springjpa.model.Comment;
import in.bushansirgur.springjpa.model.Post;
import in.bushansirgur.springjpa.service.CommentService;
import in.bushansirgur.springjpa.service.PostService;

@Controller
public class HomeController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping({"/", "/index", "/home"})
	public ModelAndView home(){
		ModelAndView mav = new ModelAndView("list-posts");
		mav.addObject("posts", postService.get());
		return mav;
	}
	
	@RequestMapping("/newpost")
	public ModelAndView post(){
		ModelAndView mav = new ModelAndView("post");
		mav.addObject("post", new Post());
		return mav;
	}
	
	@RequestMapping("/post")
	public ModelAndView savepost(@ModelAttribute("post") Post post){
		ModelAndView mav = new ModelAndView("list-posts");
		if(post != null){
			postService.save(post);
		}
		mav.addObject("posts", postService.get());
		return mav;
	}
	
	@RequestMapping("/viewpost/{id}")
	public ModelAndView viewpost(@PathVariable("id") Long id){
		ModelAndView mav = new ModelAndView("viewpost");
		Post post = postService.get(id);
		mav.addObject("fullpost", post);
		List<Comment> comments = commentService.getCommentsByPostId(post.getId());
		mav.addObject("comments", comments);
		mav.addObject("comment", new Comment());
		return mav;
	}
	
	@RequestMapping("/post/{postid}/comments")
	public ModelAndView savecomments(@PathVariable("postid") Long id, @ModelAttribute("comment") Comment comments){
		ModelAndView mav = new ModelAndView("list-posts");
		Post post = postService.get(id);
		if(comments != null){
			comments.setPost(post);
			commentService.save(comments);
		}
		mav.addObject("posts", postService.get());
		return mav;
	}
}

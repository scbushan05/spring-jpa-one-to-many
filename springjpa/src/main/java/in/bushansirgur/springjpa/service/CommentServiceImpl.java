package in.bushansirgur.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bushansirgur.springjpa.model.Comment;
import in.bushansirgur.springjpa.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public void save(Comment comments) {
		commentRepository.save(comments);
	}

	@Override
	public List<Comment> getCommentsByPostId(Long id) {
		return commentRepository.findByPostId(id);
	}

}

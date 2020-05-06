package in.bushansirgur.springjpa.service;

import java.util.List;

import in.bushansirgur.springjpa.model.Comment;

public interface CommentService {

	void save(Comment comments);

	List<Comment> getCommentsByPostId(Long id);

}

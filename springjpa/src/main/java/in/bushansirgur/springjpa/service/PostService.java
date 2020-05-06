package in.bushansirgur.springjpa.service;

import java.util.List;

import in.bushansirgur.springjpa.model.Post;

public interface PostService {

	void save(Post post);

	List<Post> get();

	Post get(Long id);

}

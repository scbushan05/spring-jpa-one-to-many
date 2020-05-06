package in.bushansirgur.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bushansirgur.springjpa.model.Post;
import in.bushansirgur.springjpa.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void save(Post post) {
		postRepository.save(post);
	}

	@Override
	public List<Post> get() {
		return postRepository.findAll();
	}

	@Override
	public Post get(Long id) {
		return postRepository.findById(id).isPresent() ? postRepository.findById(id).get() : null;
	}

}

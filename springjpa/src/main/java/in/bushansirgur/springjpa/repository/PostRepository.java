package in.bushansirgur.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springjpa.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

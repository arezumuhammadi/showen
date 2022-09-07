package krd.kurdestan.showen.comment;

import org.hibernate.mapping.List;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
    List<Comment> findAllByUserId(long userId);

    List<Comment> findAllByPlaceId(long placeId);
}

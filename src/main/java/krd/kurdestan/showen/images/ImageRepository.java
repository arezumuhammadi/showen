package krd.kurdestan.showen.images;

import org.hibernate.mapping.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends PagingAndSortingRepository<Image, Long> {
    List<Image> findAllByPlace_Id(long placeId);

    Image findByUser_Id(Long userId);
}

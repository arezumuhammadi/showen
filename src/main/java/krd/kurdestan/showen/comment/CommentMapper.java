package krd.kurdestan.showen.comment;

import krd.kurdestan.showen.place.PlaceMapper;
import org.hibernate.mapping.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PlaceMapper.class})
public interface CommentMapper {




        Comment toComment(CommentDTO commentDTO);

        List<Comment> toComments(List <CommentDTO> commentDTOS);

        CommentDTO toCommentDTO(Comment comment);

        List<CommentDTO> toCommentDTOs(List <Comment> comments);
}

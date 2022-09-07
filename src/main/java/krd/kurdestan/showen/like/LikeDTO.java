package krd.kurdestan.showen.like;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestan.showen.comment.CommentDTO;
import krd.kurdestan.showen.place.PlaceDTO;
import krd.kurdestan.showen.user.UserDTO;
import lombok.Data;

@Data
public class LikeDTO extends BestDTO {

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO user;

    @ApiModelProperty(required = false, hidden = false)
    private PlaceDTO place;

    @ApiModelProperty(required = false, hidden = false)
    private CommentDTO comment;
}

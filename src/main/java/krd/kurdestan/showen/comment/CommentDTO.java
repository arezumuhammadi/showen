package krd.kurdestan.showen.comment;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestan.showen.like.LikeDTO;
import krd.kurdestan.showen.place.PlaceDTO;
import krd.kurdestan.showen.user.UserDTO;
import lombok.Data;

import java.util.List;

@Data
public class CommentDTO {
    @ApiModelProperty(required = true, hidden = false)
    private String text;

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO user;

    @ApiModelProperty(required = true, hidden = false)
    private PlaceDTO place;

    @ApiModelProperty(required = false, hidden = true)
    private List<LikeDTO> likes;
}

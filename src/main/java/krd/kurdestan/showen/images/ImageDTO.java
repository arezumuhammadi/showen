package krd.kurdestan.showen.images;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestan.showen.Common.BaseDTO;
import lombok.Data;

@Data
public class ImageDTO extends BaseDTO {
    @ApiModelProperty(required = true, hidden = false)
    private String image;

    @ApiModelProperty(required = true, hidden = false)
    private Long attach_id;
}

package krd.kurdestan.showen.place;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestan.showen.Common.BaseDTO;
import lombok.Data;

@Data
public class PlaceDTO extends BaseDTO {


    @ApiModelProperty(required = true,hidden = false)
    private long id;

    @ApiModelProperty(required = true,hidden = false)

    private  String title;

    @ApiModelProperty(required = true,hidden = false)

    private  String address;

    @ApiModelProperty(required = true,hidden = false)

    private  String startService;

    @ApiModelProperty(required = true,hidden = false)

    private  String endService;

    @ApiModelProperty(required = true,hidden = false)

    private LocationDTO locationDTO;

}

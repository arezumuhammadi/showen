package krd.kurdestan.showen.place;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LocationDTO {

    @ApiModelProperty(required = true, hidden = false)
    private Double lat;
    @ApiModelProperty(required = true, hidden = false)
    private Double lng;
}

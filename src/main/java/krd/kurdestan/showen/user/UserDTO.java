package krd.kurdestan.showen.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDTO {
    @ApiModelProperty(required = true, hidden = false)
    private String name;
    @ApiModelProperty(required = true, hidden = false)
    private String email;
    @ApiModelProperty(required = true, hidden = false)
    private String password;
}

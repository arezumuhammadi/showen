package krd.kurdestan.showen.Common.exception;

import lombok.Data;

import java.util.Date;
@Data
public class ApiError {
    @ApiModelProperty(required = false,hidden = true)
    private Long id;

    @ApiModelProperty(required = false,hidden = true)
    private Integer version;

    @ApiModelProperty(required = false,hidden = true)
    private Date createdDate;

    @ApiModelProperty(required = false,hidden = true)
    private String createdBy;

    @ApiModelProperty(required = false,hidden = true)
    private Date lastModifiedDate;

    @ApiModelProperty(required = false,hidden = true)
    private String lastModifiedBy;
}

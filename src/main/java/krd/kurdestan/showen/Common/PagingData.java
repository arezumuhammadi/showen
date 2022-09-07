package krd.kurdestan.showen.Common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PagingData {

    private Integer totalPage;
    private Integer currentPage;
    private List<T> data;
}

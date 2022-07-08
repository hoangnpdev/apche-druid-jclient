package nph.druid;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import nph.druid.query.*;

import java.util.List;

@Data
@SuperBuilder
public class SelectQuery extends Query {

    private Intervals intervals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String descending;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Filter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DimensionSpec dimensions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> metrics;

    private PagingSpec pagingSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Context context;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Granularity granularity;

}

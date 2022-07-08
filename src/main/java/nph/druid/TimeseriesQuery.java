package nph.druid;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import nph.druid.query.*;

import java.util.List;

@Data
@SuperBuilder
public class TimeseriesQuery extends Query {

    private Intervals intervals;

    private Granularity granularity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Filter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Aggregation> aggregations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<PostAggregation> postAggregations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String descending;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Context context;

}

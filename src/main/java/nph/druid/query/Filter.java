package nph.druid.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Filter {

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Filter> fields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Filter field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SearchFilter query;

}

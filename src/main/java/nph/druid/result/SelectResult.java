package nph.druid.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectResult<T> {

    private Map<String, Integer> pagingIdentifiers;

    private List<EventElement<T>> events;

}

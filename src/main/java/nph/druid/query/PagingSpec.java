package nph.druid.query;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PagingSpec {

    private Map<String, Integer> pagingIdentifiers;

    private String threshold;

    private boolean fromNext = true;

    public static PagingSpec of(String threshold, boolean fromNext) {
        PagingSpec pagingSpec = new PagingSpec();
        pagingSpec.pagingIdentifiers = new HashMap<>();
        pagingSpec.setThreshold(threshold);
        pagingSpec.setFromNext(fromNext);
        return pagingSpec;
    }

    public static PagingSpec of(Map<String, Integer> pagingIdentifiers, Long threshold) {
        PagingSpec pagingSpec = new PagingSpec();
        pagingSpec.pagingIdentifiers = pagingIdentifiers;
        pagingSpec.setThreshold(threshold.toString());
        pagingSpec.setFromNext(true);
        return pagingSpec;
    }
}

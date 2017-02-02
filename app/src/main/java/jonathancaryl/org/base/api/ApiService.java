package jonathancaryl.org.base.api;

import java.util.List;

import io.reactivex.Observable;
import jonathancaryl.org.base.model.Issue;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/repos/vmg/redcarpet/issues?state=closed")
    Observable<List<Issue>> getIssues();
}

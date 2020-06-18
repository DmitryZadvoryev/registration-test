package api.service;

import api.model.Authorization;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthorizationService {

    @POST("auth/basic")
    Call<Authorization> authentication(@Body Authorization authorization);
}

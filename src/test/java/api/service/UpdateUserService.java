package api.service;

import api.model.UserInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UpdateUserService {

    @PUT("user/{userId}")
    Call<UserInfo> update(@Path("userId") String id,
                            @Header("x-authorization") String authorization,
                            @Body UserInfo userInfo);
}

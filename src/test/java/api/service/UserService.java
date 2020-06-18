package api.service;


import api.model.UserInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface UserService {
    @GET("user/")
    Call<UserInfo> getUserInfo(@Header("x-authorization") String authorization);
}

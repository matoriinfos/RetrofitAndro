package ser_comm.vs_pc.retrofitandro;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ser_comm.vs_pc.retrofitandro.pojo.MultipleResource;
import ser_comm.vs_pc.retrofitandro.pojo.User;
import ser_comm.vs_pc.retrofitandro.pojo.UserList;

/**
 * Created by VS-PC on 15.12.2017..
 */

public interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource>doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page")String page);

    @FormUrlEncoded
    @POST("/api/users")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}

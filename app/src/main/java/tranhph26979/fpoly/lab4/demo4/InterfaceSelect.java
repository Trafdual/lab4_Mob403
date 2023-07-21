package tranhph26979.fpoly.lab4.demo4;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceSelect {
    @GET("get_all_product.php")
    Call<SvrResponseSelect> getPrd();
}

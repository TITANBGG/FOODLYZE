package com.demirkol.foodlyze;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OpenFoodFactsAPI {

    // Barkod numarasına göre ürün verilerini al
    @GET("api/v0/product/{barcode}.json")
    Call<ProductResponse> getProductDetails(@Path("barcode") String barcode);
}

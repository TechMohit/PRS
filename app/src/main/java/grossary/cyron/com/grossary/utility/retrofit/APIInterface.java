package grossary.cyron.com.grossary.utility.retrofit;

import java.util.List;

import grossary.cyron.com.grossary.account.LoginModel;
import grossary.cyron.com.grossary.account.RegisterModel;
import grossary.cyron.com.grossary.account.ResendOTPModel;
import grossary.cyron.com.grossary.account.VerifyRegisterOTPModel;
import grossary.cyron.com.grossary.cart.DeleteFromCartDetailsModel;
import grossary.cyron.com.grossary.cart.UpdateFromCartDetailsModel;
import grossary.cyron.com.grossary.cart.ViewAddtoCartDetailsModel;
import grossary.cyron.com.grossary.category.AddToCartDetailsModel;
import grossary.cyron.com.grossary.category.CategoryModel;
import grossary.cyron.com.grossary.category.ProductdDescDetailsModel;
import grossary.cyron.com.grossary.category.ViewCartItemCountDetailsModel;
import grossary.cyron.com.grossary.home.HomeModel;
import grossary.cyron.com.grossary.order.OrderDetailsModel;
import grossary.cyron.com.grossary.order.ViewOrderListModel;
import grossary.cyron.com.grossary.payment.SubmitTransactionModel;
import grossary.cyron.com.grossary.profile.GetUserProfileModel;
import grossary.cyron.com.grossary.profile.GetUserProfileUpdateModel;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Url;

public interface APIInterface {

    @POST()
    @FormUrlEncoded
    Call<LoginModel> authenticate(@Url String url, @Field("MobileNumber") String MobileNumber);

    @POST()
    @FormUrlEncoded
    Call<GetUserProfileUpdateModel> getUserProfileUpdate(@Url String url, @Field("userId") String UserId, @Field("LoginId") String LoginId
            , @Field("FullName") String FullName, @Field("MobileNo") String MobileNo, @Field("Email") String Email, @Field("Address") String Address
            , @Field("GSTNumber") String GSTNumber);

    @POST()
    @FormUrlEncoded
    Call<GetUserProfileModel> getUserProfile(@Url String url, @Field("UserId") String UserId);

    @POST()
    @FormUrlEncoded
    Call<ViewOrderListModel> viewOrderList(@Url String url, @Field("UserId") String UserId);


    @POST()
    @FormUrlEncoded
    Call<DeleteFromCartDetailsModel> deleteFromCartDetails(@Url String url, @Field("OrderId") String OrderId);

    @POST()
    @FormUrlEncoded
    Call<UpdateFromCartDetailsModel> updateFromCartDetails(@Url String url, @Field("OrderId") String OrderId, @Field("Qty") String Qty);


    @POST()
    @FormUrlEncoded
    Call<ViewAddtoCartDetailsModel> viewAddtoCartDetails(@Url String url, @Field("UserId") String UserId);

    @POST()
    @FormUrlEncoded
    Call<ViewCartItemCountDetailsModel> viewCartItemCountDetails(@Url String url, @Field("UserId") String UserId);


    @POST()
    @FormUrlEncoded
    Call<SubmitTransactionModel> submitTransaction(@Url String url, @Field("FullName") String FullName, @Field("Address") String Address
            , @Field("City") String City, @Field("State") String State, @Field("ZipCode") String ZipCode, @Field("Phone") String Phone
            , @Field("UserId") String UserId, @Field("Paymode") String Paymode, @Field("TotalShippingCharges") String TotalShippingCharges
            , @Field("GrandToal") String GrandToal);

    @POST()
    @FormUrlEncoded
    Call<OrderDetailsModel> orderDetails(@Url String url, @Field("UserId") String UserId, @Field("TranNo") String TranNo);

    @POST()
    @FormUrlEncoded
    Call<ResendOTPModel> resendOTP(@Url String url, @Field("MobileNumber") String MobileNumber);

    @POST()
    @FormUrlEncoded
    Call<VerifyRegisterOTPModel> verifyRegisterOTP(@Url String url, @Field("MobileNumber") String MobileNumber, @Field("OTP") String otp);


    @POST()
    @FormUrlEncoded
    Call<ProductdDescDetailsModel> ProductdDescDetails(@Url String url, @Field("ProductDescId") String ProductDescId);

    @POST()
    @FormUrlEncoded
    Call<CategoryModel> productDetails(@Url String url, @Field("Storeid") String Storeid, @Field("CategoryId") String CategoryId);

    @POST()
    @FormUrlEncoded
    Call<CategoryModel> productSearch(@Url String url, @Field("SearchTag") String SearchTag);

    @POST()
    @FormUrlEncoded
    Call<AddToCartDetailsModel> addToCartDetails(@Url String url, @Field("UserId") String UserId, @Field("ProductDescId") String ProductDescId,
                                                 @Field("ProductId") String ProductId, @Field("StoreId") String StoreId,
                                                 @Field("ShippingCharges") String ShippingCharges, @Field("Qty") String Qty);

    @POST()
    @FormUrlEncoded
    Call<RegisterModel> register(@Url String url, @Field("PortalLoginName") String PortalLoginName, @Field("Password") String Password,
                                 @Field("Address") String Address, @Field("MobileNumber") String MobileNumber, @Field("EmailId") String EmailId,
                                 @Field("GSTNumber") String GSTNumber);

    @POST()
    @FormUrlEncoded
    Call<HomeModel> homeDetailsAPI(@Url String url, @Field("MobileNumber") String MobileNumber);

    interface Header {
        String AUTHORIZATION = "Authorization";
        String CONTENT_TYPE = "Content-Type";
    }

}

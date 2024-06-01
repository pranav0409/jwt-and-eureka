import com.example.cart_service.User.UserServiceClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class RetrofitClientConfig {

    @Value("${user.service.url}")
    private String userServiceUrl;

    @Bean
    public UserServiceClient userServiceClient() {
        return new Retrofit.Builder()
                .baseUrl(userServiceUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(UserServiceClient.class);
    }
}
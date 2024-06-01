package com.example.department_service.user;


public interface UserServiceClient {
    @GET("/users/{id}")
    Call<UserDto> getUserById(@Path("id") Long id);
}


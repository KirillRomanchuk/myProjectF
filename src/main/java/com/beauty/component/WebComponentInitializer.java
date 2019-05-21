package com.beauty.component;

import com.beauty.model.converter.UserConverter;
import com.beauty.model.converter.UserLoginConverter;
import com.beauty.model.entity.User;
import com.beauty.model.service.UserService;
import com.beauty.servlet.RequestResolver;

public class WebComponentInitializer {

    private static WebComponentInitializer initializer;
    private final RequestResolver requestResolver;
    private final UserService userService;
    private final UserLoginConverter userLoginConverter;
    private final UserConverter userConverter;

    private WebComponentInitializer() {

        DataComponentInitializer dataComponentInitializer = DataComponentInitializer.getInstance();

        userLoginConverter = new UserLoginConverter();
        userConverter = new UserConverter();
        userService = new UserService(dataComponentInitializer.getUserDao());
        requestResolver = new RequestResolver(this);
    }

    public static WebComponentInitializer getInstance() {
        if (initializer == null) {
            synchronized (WebComponentInitializer.class) {
                if (initializer == null) {
                    initializer = new WebComponentInitializer();
                }
            }
        }

        return initializer;
    }

    public RequestResolver getRequestResolver() {
        return requestResolver;
    }

    public UserService getUserService() {
        return userService;
    }

    public UserLoginConverter getUserLoginConverter() {
        return userLoginConverter;
    }

    public UserConverter getUserConverter() {
        return userConverter;
    }
}

package ru.gavrilovegor519.rssaggregator.service;

import ru.gavrilovegor519.rssaggregator.dto.output.user.TokenDto;
import ru.gavrilovegor519.rssaggregator.entity.User;

/**
 * User management service layer. User can login and register.
 * @author Egor Gavrilov (gavrilovegor519@gmail.com)
 */
public interface UserService {

    /**
     * Login user and return JWT Bearer token.
     * @param user Login data
     * @return JWT Bearer token
     */
    TokenDto login(User user);

    /**
     * Register new user.
     * @param user Registration data
     */
    void reg(User user);
}

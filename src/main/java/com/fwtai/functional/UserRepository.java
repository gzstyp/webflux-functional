package com.fwtai.functional;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

    public Mono<User> getUserById(final Long id);

    public Flux<User> getAllUsers();

    public Mono<Void> saveUser(final Mono<User> user);

    public Mono<User> putUser(final Long id,final Mono<User> user);

    public Mono<String> deleteUser(final Long id);
}
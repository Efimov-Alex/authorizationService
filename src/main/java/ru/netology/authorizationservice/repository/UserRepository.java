package ru.netology.authorizationservice.repository;

import ru.netology.authorizationservice.Authorities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ru.netology.authorizationservice.Authorities.*;

public class UserRepository {
    private static final Map<String, String> userReposituryMap = new HashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        userReposituryMap.put("Admin1", "fh4krhf");
        userReposituryMap.put("Manager1", "fjksbxc64gg");
        userReposituryMap.put("Pasha2001", "akhfg47f");

        if (userReposituryMap.containsKey(user) & userReposituryMap.get(user).equals(password)
                & user.startsWith("Admin")) {
            return List.of(new Authorities[]{READ, WRITE, DELETE});
        } else if (userReposituryMap.containsKey(user) & userReposituryMap.get(user).equals(password)
                & user.startsWith("Manager")) {
            return List.of(new Authorities[]{READ, WRITE});
        } else if (userReposituryMap.containsKey(user) & userReposituryMap.get(user).equals(password)) {
            return List.of(new Authorities[]{READ});
        }
        return List.of(new Authorities[]{});


    }
}
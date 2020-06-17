package com.udacity.jwdnd.c1.snippets.l2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BadSpringNoNewKeyword {

    public List<UserProfile> doThings() {

        UserService userService = new UserService(); // Uh oh!

        UserProfile userProfile = userService.getUserProfile("admin"); // Yep, that's bad

        List<UserProfile> profiles = new ArrayList<>(); // That's ok!

        profiles.add(userProfile);

        UserProfile newProfile = new UserProfile(); // Also ok!

        profiles.add(newProfile);

        return profiles;
    }

}


package kg.megacom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashSet<User> subscribedUsers = new HashSet<>();

        User thunder = new User("Thunder88", 432423442, "thunder21@gmail.com", 231234243, true);
        User hunter = new User("Hunter56", 432423443, "hunter412@gmail.com", 486042034, true);
        User samson = new User("Samson111", 432423444, "samson23@gmail.com", 12383845, true);
        User voldemar = new User("Voldemar7", 432423445, "voldemar546@gmail.com", 123432155, true);

        Collections.addAll(subscribedUsers, thunder, hunter, samson, voldemar);
        for (User i : subscribedUsers) {
            i.toPrint();
        }

        HashSet<User> unsubUsers = new HashSet<>();

        User dream = new User("Dream14", 432423446, "dream@gmail.com", 245343234, false);
        User jake = new User("Jakob88", 432423447, "jakob5443@gmail.com", 343299456, false);
        User kenny = new User("Kennny88", 432423448, "kennny231@gmail.com", 984885030, false);
        Collections.addAll(unsubUsers, dream, jake, kenny);

        System.out.println("Unsubscribed users:");
        for (User i : unsubUsers) {
            i.toPrint();
        }

        subscribedUsers.addAll(unsubUsers);
        unsubUsers.clear();
        for (User i : subscribedUsers) {
            if (!i.getIsSubscribed()) {
                i.setSubscribed(true);
            };
        }

        System.out.println("After adding new subscribers:");
        for (User i : subscribedUsers) {
            i.toPrint();
        }

        subscribedUsers.remove(hunter);
        subscribedUsers.remove(dream);
        unsubUsers.add(hunter);
        unsubUsers.add(dream);

        for (User i : unsubUsers) {
            if (i.getIsSubscribed()) {
                i.setSubscribed(false);
            };
        }

        System.out.println("Users whose subscription period has expired:");
        for (User i : unsubUsers) {
            i.toPrint();
        }
    }
}

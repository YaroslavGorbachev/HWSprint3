package Java.YaroslavGorbachev.ru.DZ_sem3.services;

import YaroslavGorbachev.ru.DZ_sem3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private NotificationService notificationService;

    public User createUser(String name, int age, String email)
    {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }

    public void saveUser(User user) {
    }
}
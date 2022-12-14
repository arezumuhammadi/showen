package krd.kurdestan.showen.user;

import java.util.List;

public interface UserService {
    User save(User user);

    User update(User user);

    void delete(Long id);

    User getById(Long id);

    List<User> getAll();
}

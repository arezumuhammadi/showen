package krd.kurdestan.showen.user;


import krd.kurdestan.showen.Common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        User savedBefore = getById(user.getId());
        savedBefore.setName(user.getName());
        savedBefore.setPassword(user.getPassword());
        savedBefore.setEmail(user.getEmail());

        return repository.save(savedBefore);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User getById(Long id) {
        Optional<User> optionalUser = repository.findById(id);
        if (optionalUser.isEmpty()) throw new NotFoundException("User not Found");

        return optionalUser.get();
    }

    @Override
    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }
}

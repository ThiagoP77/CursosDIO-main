package dio.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("THIAGO");
        for(User u: users){
            System.out.println(u.toString());
        }
        
    }
    private void insertUser(){
        User user = new User();
        user.setName("THIAGO PIFFER 2");
        user.setUsername("thiago");
        user.setPassword("piffer 2");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}

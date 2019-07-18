package au.com.mayi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.PostConstruct;

/**
 * Created by agrawald on 2019-07-18.
 */
@SpringBootApplication
public class Application {
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void postConstruct() {
        redisTemplate.opsForHash().put("testCol", "test", "test");
    }
}

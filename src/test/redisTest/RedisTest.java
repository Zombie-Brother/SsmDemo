package redisTest;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    @Test
    public void redisConnectionTest(){
        Jedis jedis= new Jedis("172.18.1.6",6379);
        jedis.set("test","测试");
        System.out.println(jedis.get("test"));

    }

}

import redis.clients.jedis.Jedis;

/**
 * Created by dharshekthvel on 6/1/18.
 */
public class ConnectToJedis {

    public static void main(String args[]) {

        Jedis jedis = new Jedis("localhost", 6379);


        jedis.set("supervised_learning","linear_regression");


        System.out.println(jedis.get("supervised_learning"));
    }
}

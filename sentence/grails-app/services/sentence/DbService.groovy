package sentence

import grails.gorm.transactions.Transactional
import grails.plugins.redis.RedisService
import redis.clients.jedis.Jedis


@Transactional
class DbService {

    RedisService redisService

    def serviceMethod() {

    }

    def getSentence(id) {
        def content = redisService.withRedis {Jedis redis -> redis.get((String)id)}
        if(content == null){
            content = Sentence.get(id).getContent();
            if(content != null){
                redisService.withRedis { Jedis redis ->
                    redis.set((String)id,content)}
            }
        }
        [id : id, content : content]
    }
}

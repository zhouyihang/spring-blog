package com.smatt;

import com.smatt.models.Post;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by smatt on 21/04/2017.
 */
public class MyTest {

    Logger logger = Logger.getLogger(SpringBlogApplicationTests.class);

    public MyTest() {}

    @Test
    public void testSumByStream() {
        List<Post> posts = Arrays.asList(
           new Post(1, "Post 1"),
           new Post(2, "post 2"),
           new Post(3, "post 3")
        );

        int total = posts.stream().collect(Collectors.summingInt(p -> p.getViews()));
        logger.info("total = " + total);
    }


}
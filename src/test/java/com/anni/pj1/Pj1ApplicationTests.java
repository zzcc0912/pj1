package com.anni.pj1;

import com.anni.pj1.Properties.ImagesProperties;
import com.anni.pj1.Repository.PhotoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Pj1ApplicationTests {

    @Autowired
    private PhotoRepository pr;

    @Autowired
    private ImagesProperties ip;

	@Test
	public void contextLoads() {


        pr.getPhototListByPath(ip.getPath(), true);

	}

}

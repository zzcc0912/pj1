package com.anni.pj1;

import com.anni.pj1.domain.PhotoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Pj1ApplicationTests {

	@Autowired
	private PhotoEntity pe;

	@Test
	public void contextLoads() {
		pe.setAddress("/abc/esef");
		System.out.println(pe.getAddress());

	}

}

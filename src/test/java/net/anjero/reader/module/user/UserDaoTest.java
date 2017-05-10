package net.anjero.reader.module.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/10</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserDaoTest {


    @Autowired
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        System.out.println("set up...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown...");
    }

    @Test
    public void insert() throws Exception {
        userDao.insert(new User("newTest22","te@ee.com"));
    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void insertList() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void find() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void findByNameLike() throws Exception {

    }

    @Test
    public void findByNameIn() throws Exception {

    }

}
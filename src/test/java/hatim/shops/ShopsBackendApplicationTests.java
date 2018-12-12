package hatim.shops;

import hatim.shops.controllers.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopsBackendApplicationTests {

    @Autowired
    UserController userController;

    @Test
    public void contextLoads() {
    }

    @Test
    public void isCorrectLogin() {
        assertTrue( userController.isCorrectLogin("hatim@mail.com"));
        assertFalse( userController.isCorrectLogin("sth"));
        assertFalse( userController.isCorrectLogin("sthelse"));
        assertFalse( userController.isCorrectLogin("sthelse@mail.com"));
    }

}

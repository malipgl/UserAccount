package UserTest.ControllerTest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static UserTest.CreateFactory.EntityFactory.*;
import static org.junit.Assert.assertEquals;

public class UserRestControllerTest extends AbstractTest {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void createUserAccount() throws Exception {
        String uri = "/createUserAccount";
        String inputJson = super.mapToJson(userAccountCreateDTO());

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
    }

    @Test
    public void updateUserAccount() throws Exception {
        String uri = "/updateUserAccount";
        String inputJson = super.mapToJson(userAccountUpdateDTO());
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    public void deleteUserAccount() throws Exception {
        String uri = "/deleteUserAccount/1";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }


}
package com.sporty.controller;

import com.sporty.domain.User;
import com.sporty.repo.UserRepo;
import com.sporty.security.JwtTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.logging.Logger;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AuthenticationController.class, secure = false)
public class AuthenticationControllerTest {

    private static final Logger logger = Logger.getLogger(AuthenticationControllerTest.class.getName());

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepo userRepo;

    @MockBean
    private AuthenticationManager authenticationManager;

    @MockBean
    private UserDetailsService userDetailsService;

    @MockBean
    private JwtTokenUtil jwtTokenUtil;

    Long id = new Long(1);
    User mockUser = new User(id,"admin","$2a$10$UIxNsCOpmrImG4LxIS3hEOOqRmOzsZaLGLrEg15wD2KGjnWTirJ4q","test@test.com", true, false);

    //String exampleJson = "{\"id\":1,\"username\":\"admin\",\"password\":\"$2a$10$UIxNsCOpmrImG4LxIS3hEOOqRmOzsZaLGLrEg15wD2KGjnWTirJ4q\",\"email\":\"test@test.com\",\"enabled\":true,\"passwordExpired\":false}";

    @Test
    public void getUser() throws Exception {

        Mockito.when(
                userRepo.findByUsername(Mockito.anyString())).thenReturn(mockUser);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/test/admin").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        logger.info(result.getResponse().getContentAsString());
        String expected = "{id:1,username:admin,password:$2a$10$UIxNsCOpmrImG4LxIS3hEOOqRmOzsZaLGLrEg15wD2KGjnWTirJ4q,email:test@test.com,enabled:true,passwordExpired:false}";

        // {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

        JSONAssert.assertEquals(expected, result.getResponse()
                .getContentAsString(), false);
    }

}
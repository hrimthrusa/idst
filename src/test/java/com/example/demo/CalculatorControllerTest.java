package com.example.demo;

import com.example.demo.controller.CalculatorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {


//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testAdd() throws Exception {
//        mockMvc.perform(
//                get("/add")
//                        .param("a", "2")
//                        .param("b", "1"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(is("3"))
//        );
//    }
}

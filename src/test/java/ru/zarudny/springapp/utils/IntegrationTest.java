package ru.zarudny.springapp.utils;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.BEFORE_CLASS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.zarudny.springapp.SpringAppApplication;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@Target({ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@AutoConfigureMockMvc
@SpringBootTest(classes = SpringAppApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = BEFORE_CLASS)
public @interface IntegrationTest {

}

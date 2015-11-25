import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import koreatech.cse.service.UserService;
import mypackage.MntInfoType;
import mypackage.ResultType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
        {"file:src/main/resources/common/services.xml",
                "file:src/main/resources/common/security.xml",
                "file:src/main/resources/common/mybatis.xml"}
)
public class SanTest {
    @Autowired
    private WebApplicationContext wac;
    @Value("${env.text}")
    private String envText;

    @Before
    public void setup() {
        System.out.println("wac: " + wac);
        System.out.println("this: " + this);
    }

    @Test
    public void sanTest() {
        String sanUrl = "http://www.forest.go.kr/newkfsweb/kfi/kfs/openapi/mntInfoOpenAPI.do";
        String sanKey = "ac03e6ba5a6d468c916c6d4e8fd06f51";
        int pageUnit = 10;
        int pageIndex = 1;

        // POJO 클래스의 List 멤버 위에 붙여야 할 어노테이션
        // @JacksonXmlElementWrapper(useWrapping=false)
        // protected List<MntInfoType> mntInfo;

        RestTemplate restTemplate = new RestTemplate();
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(sanUrl)
                    .queryParam("key", sanKey)
                    .queryParam("pageUnit", pageUnit)
                    .queryParam("pageIndex", 1);

            System.out.println("san : " + builder.build().encode().toUri());

            ResultType resultType = restTemplate.getForObject(builder.build().encode().toUri(),
                    ResultType.class);

            String totalCnt = resultType.getTotalCnt();
            System.out.println(totalCnt);

            System.out.println(resultType.getMntInfo().get(0).getMntiName());

        }catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
    }


    @After
    public void wrapup() {
        System.out.println("wrapup");
        System.out.println();
    }
}
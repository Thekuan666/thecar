package apipassenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ Auther: yk
 * @ Date: 2023/2/10 - 02 - 10 - 17:12
 * @ Description: testapi
 * @ version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class apipassengerApplication {
    public static void main(String[] args) {
        SpringApplication.run(apipassengerApplication.class);
    }
}

package com.coki;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("/order/{userId}")
    public String getName(@PathVariable Integer userId) {
        String name = restTemplate.getForEntity("http://MICROAPP/user/" + userId, String.class).getBody();
        return name;
    }
}

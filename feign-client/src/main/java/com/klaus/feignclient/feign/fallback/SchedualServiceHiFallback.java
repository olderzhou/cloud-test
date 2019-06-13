package com.klaus.feignclient.feign.fallback;

import com.klaus.feignclient.feign.api.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class SchedualServiceHiFallback implements SchedualServiceHi {

    @Override
    public String  sayHiFromClientOne(String name) {
        return "this is invoked by default, name is :" +name ;
    }
}

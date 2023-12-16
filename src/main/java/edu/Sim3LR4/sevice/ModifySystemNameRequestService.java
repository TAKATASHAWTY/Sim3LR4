package edu.Sim3LR4.sevice;

import edu.Sim3LR4.model.Systems;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import edu.Sim3LR4.model.Request;
import org.springframework.web.client.RestTemplate;

@Service
@Qualifier("SystemName")
public class ModifySystemNameRequestService implements ModifyRequestService{
    @Override
    public void modify(Request request){

        request.setSystemName(Systems.SYSTEM_ONE);

        request.setSource("ServiceOneCall");

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}

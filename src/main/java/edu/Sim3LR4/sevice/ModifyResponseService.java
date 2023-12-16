package edu.Sim3LR4.sevice;

import edu.Sim3LR4.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}

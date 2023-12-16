package edu.Sim3LR4.sevice;

import org.springframework.stereotype.Service;
import edu.Sim3LR4.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}

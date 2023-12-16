package edu.Sim3LR4.sevice;

import edu.Sim3LR4.exception.UnsupportedCodeException;
import edu.Sim3LR4.model.Request;
import org.springframework.stereotype.Service;

@Service
public interface UnsupportedCodeMatchExceptionService {
    void isUidMatch(Request request) throws UnsupportedCodeException;
}

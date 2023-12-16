package edu.Sim3LR4.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import edu.Sim3LR4.model.Codes;
import edu.Sim3LR4.model.ErrorCodes;
import edu.Sim3LR4.model.ErrorMessages;

@Data
@Builder
@ToString
public class Response {
    private String uid;
    private String operationUid;
    private String systemTime;
    private Codes code;
    private ErrorCodes errorCode;
    private ErrorMessages errorMessage;
}

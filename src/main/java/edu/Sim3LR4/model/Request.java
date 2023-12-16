package edu.Sim3LR4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import edu.Sim3LR4.util.DateTimeUtil;
import javax.validation.constraints.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "Uid  не может быть пустым ")
    @Size(max = 3, message = "uid должен быть меньше 32 символов")
    private String uid;
    @NotBlank(message = "operationUid не может быть пустым")
    @Size(max = 32, message = "operationUid должен быть меньше 32 символов")
    private String operationUid;
    private Systems systemName;

    public void setSystemTime(String systemTime) {
        if (systemTime.isEmpty()) {
            this.systemTime = DateTimeUtil.getCustomFormat().format(new Date());
        } else {
            this.systemTime = systemTime;
        }
    }

    private String systemTime;
    private String source;
    @Min(value = 1, message = "communicationId не может быть меньше 1")
    @Max(value = 100000, message = "communicationId не может быть больше 100000")
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid=" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId='" + communicationId +
                ", templateId='" + templateId +
                ", productCode='" + productCode +
                ", smsCode='" + smsCode +
                '}';
    }
}

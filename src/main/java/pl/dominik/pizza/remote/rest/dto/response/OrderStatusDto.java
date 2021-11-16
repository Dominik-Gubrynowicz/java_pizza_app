package pl.dominik.pizza.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.dominik.pizza.domain.model.StatusType;
import java.util.Date;

public class OrderStatusDto {

    private StatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    public OrderStatusDto(StatusType status, Date createdAt, Date expectedAt, Date updatedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.expectedAt = expectedAt;
        this.updatedAt = updatedAt;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

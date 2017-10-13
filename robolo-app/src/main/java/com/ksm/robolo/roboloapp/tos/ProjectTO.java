package com.ksm.robolo.roboloapp.tos;

import java.util.Date;
import java.util.Set;

public class ProjectTO {

    private Long id;

    private String projectName;

    private Date startDate;

    private AddressTO addressTO;

    private ClientTO clientTO;

    private Set<WorkerTO> workerTOS;

    private Set<TaskTO> taskTOS;

    private Date approximateEndDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public AddressTO getAddressTO() {
        return addressTO;
    }

    public void setAddressTO(AddressTO addressTO) {
        this.addressTO = addressTO;
    }

    public ClientTO getClientTO() {
        return clientTO;
    }

    public void setClientTO(ClientTO clientTO) {
        this.clientTO = clientTO;
    }

    public Set<WorkerTO> getWorkerTOS() {
        return workerTOS;
    }

    public void setWorkerTOS(Set<WorkerTO> workerTOS) {
        this.workerTOS = workerTOS;
    }

    public Set<TaskTO> getTaskTOS() {
        return taskTOS;
    }

    public void setTaskTOS(Set<TaskTO> taskTOS) {
        this.taskTOS = taskTOS;
    }

    public Date getApproximateEndDate() {
        return approximateEndDate;
    }

    public void setApproximateEndDate(Date approximateEndDate) {
        this.approximateEndDate = approximateEndDate;
    }
}

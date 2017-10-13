package com.ksm.robolo.roboloapp.services.util.impl;


import com.ksm.robolo.roboloapp.domain.TaskEntity;
import com.ksm.robolo.roboloapp.domain.TaskItemEntity;
import com.ksm.robolo.roboloapp.domain.WorkerEntity;
import com.ksm.robolo.roboloapp.services.util.EntityToTOConverter;
import com.ksm.robolo.roboloapp.tos.TaskItemTO;
import com.ksm.robolo.roboloapp.tos.TaskTO;
import com.ksm.robolo.roboloapp.tos.WorkerTO;

import java.util.LinkedList;
import java.util.List;

public class TaskToTOConverter implements EntityToTOConverter<TaskTO, TaskEntity>{

    private WorkerToTOConverter workerConverter;
    private TaskItemEntityToTOConverter taskItemConverter;

    public TaskToTOConverter() {
        workerConverter = new WorkerToTOConverter();
        taskItemConverter = new TaskItemEntityToTOConverter();
    }
    @Override
    public TaskTO convertToTO(TaskEntity entity) {
        TaskTO taskTO = new TaskTO();
        taskTO.setId(entity.getId());
        taskTO.setCreationDate(entity.getCreationDate());
        taskTO.setDescription(entity.getDescription());
        taskTO.setEstimatedTaskDuration(entity.getEstimatedTaskDuration());
        taskTO.setStartDate(entity.getStartDate());
        taskTO.setStatus(entity.getStatus());

        taskTO.setTaskItems(getTaskItemTOsFromTaskEntity(entity));
        taskTO.setWorkers(getWorkerTOsFromTaskEntity(entity));


        return taskTO;
    }

    @Override
    public List<TaskTO> convertListToTOList(List<TaskEntity> entityList) {
        return null;
    }

    private List<WorkerTO> getWorkerTOsFromTaskEntity(TaskEntity entity) {
        List<WorkerTO> workerTOS = new LinkedList<>();
        for (WorkerEntity worker : entity.getWorkers()) {
            WorkerTO workerTO = workerConverter.convertToTO(worker);
            workerTOS.add(workerTO);
        }
        return workerTOS;
    }

    private List<TaskItemTO> getTaskItemTOsFromTaskEntity(TaskEntity entity) {
        List<TaskItemTO> taskItemTOs = new LinkedList<>();
        for (TaskItemEntity taskItemEntity : entity.getTaskItems()) {
            TaskItemTO taskItemTO = taskItemConverter.convertToTO(taskItemEntity);
            taskItemTOs.add(taskItemTO);
        }
        return taskItemTOs;
    }
}

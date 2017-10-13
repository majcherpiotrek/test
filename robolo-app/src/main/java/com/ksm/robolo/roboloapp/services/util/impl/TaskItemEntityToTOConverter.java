package com.ksm.robolo.roboloapp.services.util.impl;

import com.ksm.robolo.roboloapp.domain.TaskItemEntity;
import com.ksm.robolo.roboloapp.services.util.EntityToTOConverter;
import com.ksm.robolo.roboloapp.tos.TaskItemTO;

import java.util.List;

public class TaskItemEntityToTOConverter implements EntityToTOConverter<TaskItemTO, TaskItemEntity>{

    @Override
    public TaskItemTO convertToTO(TaskItemEntity entity) {
        TaskItemTO taskItemTO = new TaskItemTO();
        taskItemTO.setId(entity.getId());
        taskItemTO.setQuantity(entity.getQuantity());
        taskItemTO.setDescription(entity.getDescription());
        taskItemTO.setPrice(entity.getPrice());
        return taskItemTO;
    }

    @Override
    public List<TaskItemTO> convertListToTOList(List<TaskItemEntity> entityList) {
        return null;
    }
}

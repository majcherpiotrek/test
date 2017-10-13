package com.ksm.robolo.roboloapp.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.ksm.robolo.roboloapp.enums.TaskStatus;

@Entity
@Table(name = "Tasks")
public class TaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String description;
	
	private Integer estimatedTaskDuration;

	@ManyToOne
	private ProjectEntity project;

	@ManyToMany(targetEntity = WorkerEntity.class)
	private List<WorkerEntity> workers;

	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	private TaskStatus status;
	
	@OneToMany(targetEntity = TaskItemEntity.class)
	private List<TaskItemEntity> taskItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEstimatedTaskDuration() {
		return estimatedTaskDuration;
	}

	public void setEstimatedTaskDuration(Integer estimatedTaskDuration) {
		this.estimatedTaskDuration = estimatedTaskDuration;
	}

	public ProjectEntity getProject() {
		return project;
	}

	public void setProject(ProjectEntity project) {
		this.project = project;
	}

	public List<WorkerEntity> getWorkers() {
		return workers;
	}

	public void setWorkers(List<WorkerEntity> workers) {
		this.workers = workers;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public List<TaskItemEntity> getTaskItems() {
		return taskItems;
	}

	public void setTaskItems(List<TaskItemEntity> taskItems) {
		this.taskItems = taskItems;
	}
}

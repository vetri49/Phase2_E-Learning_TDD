package com.simplilearn.tdd.E_learning;

public class Training {
	public int TrainingId;
	public String TrainingName;
	public Training(int trainingId, String trainingName) {
		super();
		TrainingId = trainingId;
		TrainingName = trainingName;
	}
	public int getTrainingId() {
		return TrainingId;
	}
	public void setTrainingId(int trainingId) {
		TrainingId = trainingId;
	}
	public String getTrainingName() {
		return TrainingName;
	}
	public void setTrainingName(String trainingName) {
		TrainingName = trainingName;
	}
	@Override
	public String toString() {
		return "Training [TrainingId=" + TrainingId + ", TrainingName=" + TrainingName + "]";
	}
	

}

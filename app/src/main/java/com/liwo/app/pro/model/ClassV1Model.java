package com.liwo.app.pro.model;

import java.util.List;

/**
 * Created by chenhuan on 15-9-13.
 */
public class ClassV1Model {
    private String classId;
    private String className;
    private String classImage;
    private List<ClassV2Model> classV2ModelList;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassImage() {
        return classImage;
    }

    public void setClassImage(String classImage) {
        this.classImage = classImage;
    }

    public List<ClassV2Model> getClassV2ModelList() {
        return classV2ModelList;
    }

    public void setClassV2ModelList(List<ClassV2Model> classV2ModelList) {
        this.classV2ModelList = classV2ModelList;
    }
}

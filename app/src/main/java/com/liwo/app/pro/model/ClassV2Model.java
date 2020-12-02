package com.liwo.app.pro.model;

import java.util.List;

/**
 * Created by chenhuan on 15-9-13.
 */
public class ClassV2Model {
    private String classId;
    private String className;
    private String classImage;
    private List<ClassV3Model> classV3ModelList;

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

    public List<ClassV3Model> getClassV3ModelList() {
        return classV3ModelList;
    }

    public void setClassV3ModelList(List<ClassV3Model> classV3ModelList) {
        this.classV3ModelList = classV3ModelList;
    }
}

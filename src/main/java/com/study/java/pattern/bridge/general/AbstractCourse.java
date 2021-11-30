package com.study.java.pattern.bridge.general;


public abstract class AbstractCourse implements ICourse {

    private INote note;
    private IVideo video;

    public AbstractCourse(INote note, IVideo video) {
        this.note = note;
        this.video = video;
    }

    public INote getNote() {
        return note;
    }

    public void setNote(INote note) {
        this.note = note;
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "AbstractCourse{" +
                "note=" + note +
                ", video=" + video +
                '}';
    }
}

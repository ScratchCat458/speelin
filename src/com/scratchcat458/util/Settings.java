package com.scratchcat458.util;

public class Settings {
    private boolean autoCont;
    private boolean autoEnd;
    private boolean loadOnStart;

    public Settings() {
    }

    public boolean isAutoCont() {
        return autoCont;
    }

    public boolean isAutoEnd() {
        return autoEnd;
    }

    public boolean isLoadOnStart() {
        return loadOnStart;
    }

    public void setAutoCont(boolean autoCont) {
        this.autoCont = autoCont;
    }

    public void setAutoEnd(boolean autoEnd) {
        this.autoEnd = autoEnd;
    }

    public void setLoadOnStart(boolean loadOnStart) {
        this.loadOnStart = loadOnStart;
    }
}

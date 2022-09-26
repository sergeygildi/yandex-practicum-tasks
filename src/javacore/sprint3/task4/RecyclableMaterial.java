package javacore.sprint3.task4;

import java.util.Objects;

public class RecyclableMaterial {

    private final int code;
    private final MaterialType type;
    private final boolean isRecyclable;
    private final String description;

    RecyclableMaterial(int code, MaterialType type, boolean isRecyclable, String description) {
        this.code = code;
        this.type = type;
        this.isRecyclable = isRecyclable;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public MaterialType getType() {
        return type;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecyclableMaterial that = (RecyclableMaterial) o;
        return code == that.code && isRecyclable == that.isRecyclable && type == that.type && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, isRecyclable, description);
    }
}


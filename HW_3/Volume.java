package HW_3;

public class Volume {
    VolumeType vt;
    int n;

    public Volume(VolumeType vt, int n) {
        this.vt = vt;
        this.n = n;
    }

    @Override
    public String toString() {
        return String.format("Объем: %s, %d", vt.getName(), n);
    }
}
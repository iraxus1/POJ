package pl.edu.pja;

public class Args {
    private int arg1;
    private int arg2;
    private int arg3;
    private int arg4;
    private int arg5;

    public Args(int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
    }

    @Override
    public String toString() {
        return "Args\n{" +
                "\narg1=" + arg1 +
                "\narg2=" + arg2 +
                "\narg3=" + arg3 +
                "\narg4=" + arg4 +
                "\narg5=" + arg5 +
                "\n}";
    }
}

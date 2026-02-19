package constants;

public enum Waits {

    PAGE_LOAD_TIMEOUT(20),
    IMPLICIT_WAIT(30),
    EXPLICIT_WAIT(40);

    private int waitTime;

        Waits(int waitTime)
        {
            this.waitTime=waitTime;
        }

        public int getCode()
        {
            return waitTime;
        }
}

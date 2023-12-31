public class Close implements Runnable
{
    private Window window;

    Close(Window window)
    {
        this.window = window;
    }

    public void run()
    {
        while (window.actions.size() != 0)
        {
            window.startClose();
        }
    }
}

package pl.edu.pja;

public class Mediator {

    private CelsiusPanel celsiusPanel;
    private FarenheitPanel farenheitPanel;

    public void register(CelsiusPanel celsiusPanel)
    {
        this.celsiusPanel = celsiusPanel;
    }

    public void register(FarenheitPanel farenheitPanel)
    {
        this.farenheitPanel = farenheitPanel;
    }

    public void setC(double c)
    {
        this.celsiusPanel.setC(c);
    }
    public void setF(double f)
    {
        this.farenheitPanel.setF(f);
    }
}

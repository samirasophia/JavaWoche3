package Objektvererbung;

import Objektvererbung.Interfaces.CanBeHifi;

public class Screen extends ElectronicDevice implements CanBeHifi {

    public int getResolutionX()  {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    private int resolutionX;
    private int resolutionY;
    private int inch;

    public boolean isHifi() {
        return hifi;
    }

    @Override
    public void setHifi(boolean hifi) {
        this.hifi = hifi;
    }

    private boolean hifi;

    public boolean getHifi(){
        return hifi;
    }
}

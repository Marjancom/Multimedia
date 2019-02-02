/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author qa-popodne
 */
public class Television {

    private int currentVolume = 0;
    private int maxVolume = 0;
    private int currentProgram = 0;
    private boolean IsTurnedOn;

    public Television(int currentVolume, int maxVolume, int currentProgram, boolean IsTurnedOn) {
        this.IsTurnedOn = IsTurnedOn;
        this.currentProgram = currentProgram;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public void SetVolume(int volume) {
        if (this.IsTurnedOn) {
            if (volume < this.maxVolume) {
                this.currentVolume += volume;
                System.out.println("Televizor je pojacan za " + volume);
            } else {
                System.out.println("Ne mozete toliko pojacati televizor maks vrednosti je " + this.maxVolume);
            }
        } else {
            System.out.println("Televizor je iskljucen");
        }
    }

    public int GetVolume() {
        if (this.IsTurnedOn) {
            return this.currentVolume;
        } else {
            System.out.println("Televizor je iskljucen");
            return 0;
        }
    }

    public void TurnOn() {
        if (this.IsTurnedOn == false) {
            this.IsTurnedOn = true;
            System.out.println("Televizor ste upravo ukljucili");
        } else {
            System.out.println("Televizor je vec ukljucen");
        }
    }

    public void SetChannel(int currentProgram) {
        if (this.IsTurnedOn && currentProgram > 0) {
            if (this.currentProgram ==currentProgram ) {
                System.out.println("Vec ste na tom kanalu");
            } else {
                this.currentProgram = currentProgram;
                System.out.println("Televizoru ste promelini kanal na " + currentProgram);
            }
        } else {
            System.out.println("Televizor je iskljucen");
        }

    }

}

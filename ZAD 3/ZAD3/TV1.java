package pl.edu.pja;

import java.util.Scanner;

public class TV1 {
    private int volume = 1;
    private int channel = 1;

    private void MainMenu(){
        System.out.println("\n[1]: VolumeUP\n[2]: VolumeDOWN\n[3]: ChannelUP\n[4]: ChannelDOWN\n[5]: TV OFF");
    }

    public void switchTV() {
        boolean exit = true;
        do {
            MainMenu();
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1: {
                    if (volume >= 20)
                    {
                        System.out.println("MAX volume");
                        volume = 20;
                    }
                    else
                    {
                        volume++;
                    }
                    System.out.println("Your volume: " + volume);
                    break;
                }
                case 2: {
                    if (volume <= 0)
                    {
                        System.out.println("MIN volume");
                        volume = 0;
                    }
                    else
                    {
                        volume--;
                    }
                    System.out.print("Your volume: " + volume);
                    break;
                }
                case 3: {
                    if (channel >= 10)
                    {
                        System.out.println("MAX channel");
                        channel = 10;
                    }
                    else
                    {
                        volume++;
                    }
                    System.out.print("Your channel: " + channel);
                    break;
                }
                case 4: {
                    if (channel <= 0)
                    {
                        System.out.println("MIN channel");
                        channel = 0;
                    }
                    else
                    {
                        channel--;
                    }
                    System.out.print("Your channel: " + channel);
                    break;
                }
                case 5: {
                    exit = false;
                    break;
                }
            }
        } while (exit);
    }
}

package latihan;

public class Convert {

    public static String[] Data = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public static String change(int a) {
        if (a < 12) {
            return Data[a];
        }
        if (a >= 12 && a <= 19) {
            return Data[a % 10] + " belas ";
        }
        if (a >= 20 && a <= 99) {
            return Data[a / 10] + " Puluh " + Data[(int) a % 10];
        }
        if (a >= 100 && a <= 199) {
            return "Seratus " + change(a % 100);
        }
        if (a >= 200 && a <= 999) {
            return Data[a / 100] + " Ratus " + change(a % 100);
        }
        if (a == 1000) {
            return "Seribu ";
        }
        return "1-1000 ya :) ";
    }

    public static int change(String b) {
        for (int i = 0; i < 12; i++) {
            if (b.equalsIgnoreCase(Data[i])) {
                return i;
            } else if (b.equalsIgnoreCase(Data[i] + " belas")) {
                return Integer.parseInt("1" + i);
            } else if (b.equalsIgnoreCase(Data[i] + " puluh")) {
                return Integer.parseInt(i + "0");
            }
            for (int j = 0; j < 10; j++) {
                if (b.equalsIgnoreCase(Data[i] + " puluh " + Data[j])) {
                    String sc = Integer.toString(i) + Integer.toString(j);
                    return Integer.parseInt(sc);
                } else if (b.equalsIgnoreCase("seratus " + Data[j])) {
                    return Integer.parseInt("10" + j);
                } else if (b.equalsIgnoreCase("seratus " + Data[i] + " puluh")) {
                    return Integer.parseInt("1" + i + "0");
                } else if (b.equalsIgnoreCase("seratus " + Data[i] + " puluh " + Data[j])) {
                    return Integer.parseInt("1" + i + j);
                } else if (b.equalsIgnoreCase(Data[i] + " ratus")) {
                    return Integer.parseInt(i + "00");
                } else if (b.equalsIgnoreCase(Data[i] + " ratus " + Data[j])) {
                    return Integer.parseInt(i + "0" + j);
                } else if (b.equalsIgnoreCase(Data[i] + " ratus " + Data[j] + " puluh")) {
                    return Integer.parseInt(i + "" + j + "0");
                }
                for (int k = 0; k < 10; k++) {
                    if (b.equalsIgnoreCase(Data[i] + " ratus " + Data[j] + " puluh " + Data[k])) {
                        return Integer.parseInt(i + "" + j + "" + k);
                    }
                }
                if (b.equalsIgnoreCase("Seribu")) {
                    return 1000;
                }
            }
        }
        return 999999;
    }
}

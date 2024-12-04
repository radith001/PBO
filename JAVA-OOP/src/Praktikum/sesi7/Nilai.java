package Praktikum.sesi7;

public class Nilai {
    private double quis;
    private double uts;
    private double uas;

    public void setQuis(double x) {
        if (x >= 0 && x <= 100) {
            quis = x;
        } else {
            System.out.println("Nilai Quis tidak valid. Harus antara 0 dan 100.");
        }
    }

    public void setUTS(double x) {
        if (x >= 0 && x <= 100) {
            uts = x;
        } else {
            System.out.println("Nilai UTS tidak valid. Harus antara 0 dan 100.");
        }
    }

    public void setUAS(double x) {
        if (x >= 0 && x <= 100) {
            uas = x;
        } else {
            System.out.println("Nilai UAS tidak valid. Harus antara 0 dan 100.");
        }
    }

    public double getQuis() {
        return quis;
    }

    public double getUTS() {
        return uts;
    }

    public double getUAS() {
        return uas;
    }

    public double getNA() {
        return 0.2 * quis + 0.3 * uts + 0.5 * uas;
    }

    public char getIndex() {
        double na = getNA();
        if (na >= 80 && na <= 100) {
            return 'A';
        } else if (na >= 68 && na < 80) {
            return 'B';
        } else if (na >= 56 && na < 68) {
            return 'C';
        } else if (na >= 45 && na < 56) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public String getKeterangan() {
        switch (getIndex()) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            case 'E':
                return "Sangat Kurang";
            default:
                return "Tidak Valid";
        }
    }

    public static void main(String[] args) {
        Nilai n = new Nilai();
        
        n.setQuis(60);
        n.setUTS(80);
        n.setUAS(75);

        System.out.println("Quis: " + n.getQuis());
        System.out.println("UTS: " + n.getUTS());
        System.out.println("UAS: " + n.getUAS());
        System.out.println("NA: " + n.getNA());
        System.out.println("Index: " + n.getIndex());
        System.out.println("Keterangan: " + n.getKeterangan());
    }
}
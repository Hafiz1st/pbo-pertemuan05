public class ClassMobil {
    String merk;
    String model;
    String nomorPlat;
    int kapasitasBahanbakar;
    int meteran;

    void info() {
        System.out.println("Mobil: " + merk + " " + model + " " + nomorPlat);
        System.out.println("Kapasitas bahan bakar: " + kapasitasBahanbakar);
        System.out.println("Total jarak tempuh: " + meteran);
    }

    void nyalakanMesin() {
        System.out.println("Mesin mobil: " + merk + " " + model + " " + nomorPlat + " bernyala");
    }

    void matikanMesin() {
        System.out.println("Mesin mobil: " + merk + " " + model + " " + nomorPlat + " telah berhenti");
    }
}
public class Main {
    public static void main(String[] args) {
        ClassMobil lamborghini = new ClassMobil();

        lamborghini.merk = "Lamborghini";
        lamborghini.model = "Aventador";
        lamborghini.nomorPlat = "DA 7777 FAB";
        lamborghini.kapasitasBahanbakar = 213;
        lamborghini.meteran = 132;

        lamborghini.info();
        lamborghini.nyalakanMesin();
        lamborghini.matikanMesin();
    }
}
package JavaGirisKodları7;

public abstract class Trafik_Kural_Abstract {

	public abstract void emniyetKemeri();

	public abstract void hızlanma();

	public static void arabaKontrol() {
		System.out.println("Kontrol Tamam");
	}

	public static void koltukAyarı() {
		System.out.println("Koltuk ayarlandı.");
	}

}

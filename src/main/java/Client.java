public class Client {
    public static void main(String []args){
        String textToEncrypt = "hola mundo de la programacion";
        EncryptorFacade encryptorFacade = new EncryptorFacade();
        System.out.println("MD5 Encrypted");
        System.out.println(encryptorFacade.encrypt("MD5", textToEncrypt));
        System.out.println("SHA256 Encrypted");
        System.out.println(encryptorFacade.encrypt("SHA256", textToEncrypt));
        System.out.println("SHA Encrypted");
        System.out.println(encryptorFacade.encrypt("SHA", textToEncrypt));
    }
}

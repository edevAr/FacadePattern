public class EncryptorFacade {
    public EncryptorFacade(){

    }
    public String encrypt(String type, String text){
        String encryptedResult = "";
        switch (type){
            case "MD5":
                MD5Encryptor md5Encryptor = new MD5Encryptor();
                encryptedResult = md5Encryptor.encrypt(text);
                break;
            case "SHA256":
                SHA256Encryptor sha256Encryptor = new SHA256Encryptor();
                encryptedResult = sha256Encryptor.encrypt(text);
                break;
            case "SHA":
                SHA shaEncryptor = new SHA();
                encryptedResult = shaEncryptor.encrypt(text);
                break;
            default:
                encryptedResult = "";
        }
        return encryptedResult;
    }
}

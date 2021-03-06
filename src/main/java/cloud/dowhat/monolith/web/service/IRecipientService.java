package cloud.dowhat.monolith.web.service;

public interface IRecipientService {
    /**
     * get a new address
     * @param address address address
     * @return new address
     */
    String getNewRecipient(String address);

    void update(String address);
}

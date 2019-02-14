package services;

public interface ClientService {
    /***
     * В данном интерфейсе задекларированы все методы, которые используются для обращения к клиенту
     */
    void createClient(String name,String surname, String phone);

    void editClient(Integer id, String newName,String newSurname,String newPhone);

    void RemoveClient(Integer id);
}